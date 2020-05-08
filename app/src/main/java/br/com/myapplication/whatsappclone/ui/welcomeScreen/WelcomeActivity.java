package br.com.myapplication.whatsappclone.ui.welcomeScreen;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import br.com.myapplication.whatsappclone.R;
import br.com.myapplication.whatsappclone.ui.homescreen.MainActivity;
import br.com.myapplication.whatsappclone.ui.verifyPhoneScreen.VerifyPhoneActivity;

/**
 * Created by vihaan on 15/06/17.
 */

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        findViewById(R.id.agreeNContinueTVBtn).setOnClickListener(this);
        init();
    }

    private FirebaseAuth mAuth;
    private void init()
    {
        mAuth = FirebaseAuth.getInstance();
    }


    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.agreeNContinueTVBtn:
                Intent intent = new Intent(this, VerifyPhoneActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }

    @Override
    public void onStart() {
        super.onStart();

        // Check auth on Activity start
        if (mAuth.getCurrentUser() != null) {
            onAuthSuccess(mAuth.getCurrentUser());
        }
    }

    private void onAuthSuccess(FirebaseUser user) {
        startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
        finish();
    }
}
