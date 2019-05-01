package com.maxwell.pokedex.network;

import com.maxwell.pokedex.network.models.PokemonByIdResponse;
import com.maxwell.pokedex.network.models.PokemonListResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PokemonAPI {
    @GET("pokemones")
    Call<PokemonListResponse> getPokemonList();

    @GET("pokemon/{id}")
    Call<PokemonByIdResponse> getPokemonById(@Path("id") String id);
}
