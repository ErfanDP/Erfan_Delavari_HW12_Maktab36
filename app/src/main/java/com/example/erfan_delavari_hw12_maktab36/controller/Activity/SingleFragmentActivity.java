package com.example.erfan_delavari_hw12_maktab36.controller.Activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.erfan_delavari_hw12_maktab36.R;
import com.example.erfan_delavari_hw12_maktab36.controller.Fragments.EnterFragment;

public abstract class SingleFragmentActivity extends AppCompatActivity {

    public abstract Fragment fragmentCreator();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_fragment);
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);
        if(fragment == null){
            fragmentManager.beginTransaction().
                    add(R.id.fragment_container, fragmentCreator()).
                    commit();
        }
    }

}
