package com.maxwell.pokedex.pokemon;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.maxwell.pokedex.R;

public class PokemonViewHolder extends RecyclerView.ViewHolder {
    TextView tvPokemonName;
    Button btPokemonDelete;
    LinearLayout llPokemonContainer;

    public PokemonViewHolder(@NonNull View v) {
        super(v);

        tvPokemonName = v.findViewById(R.id.tvPokemonName);
        llPokemonContainer = v.findViewById(R.id.llPokemonContainer);
        btPokemonDelete = v.findViewById(R.id.btPokemonDelete);
    }
}
