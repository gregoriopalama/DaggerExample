package com.gregoriopalama.daggerexample.ui;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gregoriopalama.daggerexample.R;
import com.gregoriopalama.daggerexample.databinding.ActivityMainBinding;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

/**
 * Simple activity. It now shows Hello Dagger, provided by Dagger
 *
 * @author Gregorio Palamà
 */
public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Inject
    String helloDagger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.greetings.setText(helloDagger);
    }
}
