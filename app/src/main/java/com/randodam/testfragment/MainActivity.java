package com.randodam.testfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.randodam.testfragment.fragment.detailParcours;

public class MainActivity extends AppCompatActivity {
    Button buttonAddFragment;
    Fragment fragment;
    FragmentManager fragmentManager;


    @Override
    protected void onStart() {
        super.onStart();

    }

    private void initUI() {

        buttonAddFragment = (Button) findViewById(R.id.btn_add_fragment);
        fragmentManager = getSupportFragmentManager();
    }

    public void addFragment() {

        fragment = new detailParcours();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.navgFragment, fragment);
        fragmentTransaction.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();

        buttonAddFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragment();
            }
        });

    }

}