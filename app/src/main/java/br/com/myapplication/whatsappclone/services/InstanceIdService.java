package br.com.myapplication.whatsappclone.services;

import android.util.Log;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;

import com.google.firebase.messaging.FirebaseMessagingService;

import br.com.myapplication.whatsappclone.ui.Database;


/**
 * Created by Diego Pereira on 08/05/20.
 */

public class InstanceIdService extends FirebaseMessagingService {


    public void onTokenRefresh() {
        /*mudança verificar*/
        super.onNewToken(null);
        String instanceId = FirebaseInstanceId.getInstance().getToken();
        Log.d("@@@@", "onTokenRefresh: " + instanceId);
        FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        if (firebaseUser != null) {
            FirebaseDatabase.getInstance().getReference()
                    .child(Database.NODE_USERS)
                    .child(firebaseUser.getUid())
                    .child("instanceId")
                    .setValue(instanceId);
        }
    }
}
