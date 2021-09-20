package com.lgajic.retrofitexample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.lgajic.retrofitexample.R;
import com.lgajic.retrofitexample.model.Hero;

import java.util.List;

public class HeroesAdapter extends RecyclerView.Adapter<HeroesAdapter.HeroViewHolder> {
    private Context context;
    private List<Hero> heroList;

    public HeroesAdapter(Context context, List<Hero> heroList) {
        this.context = context;
        this.heroList = heroList;
    }

    @NonNull
    @Override
    public HeroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.heroes_list, parent, false);

        return new HeroViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HeroViewHolder holder, int position) {
        Hero hero = heroList.get(position);

        Glide.with(context)
             .load(hero.getImageURL())
             .into(holder.heroProfileImage);

        holder.heroName.setText(hero.getName());
    }

    @Override
    public int getItemCount() {
        return heroList.size();
    }

    class HeroViewHolder extends RecyclerView.ViewHolder {
        ImageView heroProfileImage;
        TextView heroName;

        public HeroViewHolder(@NonNull View itemView) {
            super(itemView);

            heroProfileImage = itemView.findViewById(R.id.hero_profile_image);
            heroName = itemView.findViewById(R.id.hero_name);
        }
    }
}
