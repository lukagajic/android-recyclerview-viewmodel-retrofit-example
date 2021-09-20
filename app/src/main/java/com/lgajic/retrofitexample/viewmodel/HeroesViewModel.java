package com.lgajic.retrofitexample.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.lgajic.retrofitexample.client.RetrofitClient;
import com.lgajic.retrofitexample.model.Hero;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HeroesViewModel extends ViewModel {
    private MutableLiveData<List<Hero>> heroesList;

    public LiveData<List<Hero>> getHeroes() {
        if (heroesList == null) {
            heroesList = new MutableLiveData<>();
            loadHeroes();
        }

        return heroesList;
    }

    private void loadHeroes() {
        Call<List<Hero>> call = RetrofitClient.getInstance().getHeroApi().getHeroes();

        call.enqueue(new Callback<List<Hero>>() {
            @Override
            public void onResponse(Call<List<Hero>> call, Response<List<Hero>> response) {
                heroesList.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<Hero>> call, Throwable t) {

            }
        });
    }
}
