package br.com.myapplication.whatsappclone;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Diego Pereira on 08/05/20.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init()
    {

        initFirebase();
    }

    private void initFirebase()
    {
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
