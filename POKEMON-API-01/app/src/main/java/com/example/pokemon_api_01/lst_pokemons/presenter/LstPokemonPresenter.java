package com.example.pokemon_api_01.lst_pokemons.presenter;

import com.example.pokemon_api_01.entities.Pokemon;
import com.example.pokemon_api_01.lst_pokemons.LstPokemonContract;
import com.example.pokemon_api_01.lst_pokemons.model.LstPokemonModel;

import java.util.ArrayList;

public class LstPokemonPresenter implements LstPokemonContract.Presenter {
    private LstPokemonModel lstPokemonModel;
    private LstPokemonContract.View view;

    public LstPokemonPresenter(LstPokemonContract.View view){
        this.view = view;
        this.lstPokemonModel = new LstPokemonModel();
    }
    @Override
    public void lstPokemon(Pokemon pokemon) {
        lstPokemonModel.lstPokemonWS(null, new LstPokemonContract.Model.
                                            OnLstPokemonListener() {
            @Override
            public void onSuccess(ArrayList<Pokemon> lstPokemon) {
                    if(lstPokemon!=null && lstPokemon.size()>0){
                        view.successLstPokemon(lstPokemon);
                    }else{
                        view.failureLstPokemon("Error en lista de Datos. ");
                    }
            }

            @Override
            public void onFailure(String error) {
                view.failureLstPokemon(error);
            }
        });
    }
}
