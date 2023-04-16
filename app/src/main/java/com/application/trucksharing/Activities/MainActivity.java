package com.application.trucksharing.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.application.trucksharing.Fragments.LogInFragment;
import com.application.trucksharing.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .setCustomAnimations(R.anim.transition_in, R.anim.transition_out, R.anim.transition_in, R.anim.transition_out)
                .setReorderingAllowed(true)
                .replace(R.id.coreFragmentContainer, LogInFragment.newInstance(), null)
                .commit();
    }
}