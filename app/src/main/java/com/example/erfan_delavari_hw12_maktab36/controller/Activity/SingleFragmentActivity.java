package com.example.erfan_delavari_hw12_maktab36.controller.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.erfan_delavari_hw12_maktab36.R;

public abstract class SingleFragmentActivity extends AppCompatActivity {
    public abstract Fragment fragmentCreator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_fragment);
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);
        if(fragment == null) {
            fragmentManager.beginTransaction().
                    add(R.id.fragment_container, fragmentCreator()).
                    commit();
        }
    }
}