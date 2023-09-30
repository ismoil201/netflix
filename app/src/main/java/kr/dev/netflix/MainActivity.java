package kr.dev.netflix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import kr.dev.netflix.databinding.ActivityMainBinding;
import kr.dev.netflix.view.Fragment_Onboarding_1;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_onboarding_1
                , new Fragment_Onboarding_1())
                .commit();


    }
}