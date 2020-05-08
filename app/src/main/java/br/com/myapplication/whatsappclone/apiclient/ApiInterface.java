package br.com.myapplication.whatsappclone.apiclient;


import java.util.ArrayList;

import br.com.myapplication.whatsappclone.ui.models.Chat;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Diego Pereira on 08/05/20.
 */

public interface ApiInterface {

    @GET("https://api.myjson.com/bins/1eh55t")
    Call<ArrayList<Chat>> getChats();
}
