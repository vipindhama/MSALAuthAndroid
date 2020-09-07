package com.vipin.msalauth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.microsoft.identity.client.IPublicClientApplication;
import com.microsoft.identity.client.ISingleAccountPublicClientApplication;
import com.microsoft.identity.client.PublicClientApplication;
import com.microsoft.identity.client.exception.MsalException;

public class AuthenticatedActivity extends AppCompatActivity {

    private ISingleAccountPublicClientApplication mSingleAccountApp;
    Button signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authenticated);

        signOutButton = (Button) findViewById(R.id.clearCache);

        //Sign in user
        signOutButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

            }
        });

    }
}