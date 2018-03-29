package com.gregoriopalama.daggerexample.ui;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gregoriopalama.daggerexample.R;
import com.gregoriopalama.daggerexample.databinding.ActivityMainBinding;

/**
 * Simple activity. It will show an Hello world Text View.
 * The main goal is to provide an alternative text using Dagger
 *
 * @author Gregorio Palamà
 */
public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }
}
