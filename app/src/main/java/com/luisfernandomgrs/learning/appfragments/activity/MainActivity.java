package com.luisfernandomgrs.learning.appfragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.luisfernandomgrs.learning.appfragments.R;
import com.luisfernandomgrs.learning.appfragments.fragment.ContatosFragment;
import com.luisfernandomgrs.learning.appfragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {
    private Button buttonTalk, buttonContact;
    private Fragment talkFragment, contactFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Using Fragments Components");

        // basic codes...
        buttonTalk = findViewById(R.id.buttonTalk);
        buttonContact = findViewById(R.id.buttonContact);

        // Config object to Transaction
        talkFragment = new ConversasFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameContent, talkFragment);
        transaction.commit();

        buttonTalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameContent, talkFragment);
                transaction.commit();
            }
        });

        buttonContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contactFragment = new ContatosFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameContent, contactFragment);
                transaction.commit();
            }
        });
    }
}