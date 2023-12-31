package kr.dev.netflix.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.navigation.NavigationView;

import kr.dev.netflix.R;
import kr.dev.netflix.databinding.FragmentSplashBinding;


public class SplashFragment extends Fragment {

    private FragmentSplashBinding binding;

    public SplashFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSplashBinding.inflate(LayoutInflater.from(container.getContext()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Navigation.findNavController(binding.getRoot()).navigate(R.id.loginFragment);

           }
       },2000);
    }
}