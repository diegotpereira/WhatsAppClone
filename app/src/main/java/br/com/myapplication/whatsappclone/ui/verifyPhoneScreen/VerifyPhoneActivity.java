package br.com.myapplication.whatsappclone.ui.verifyPhoneScreen;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import br.com.myapplication.whatsappclone.R;
import br.com.myapplication.whatsappclone.ui.createUserScreen.CreateUserActivity;


/**
 * Created by Diego Pereira on 08/05/20.
 */

public class VerifyPhoneActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_phone);
        findViewById(R.id.nextBtn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, CreateUserActivity.class);
        startActivity(intent);

    }
}


