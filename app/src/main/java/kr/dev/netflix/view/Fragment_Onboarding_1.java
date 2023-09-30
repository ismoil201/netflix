package kr.dev.netflix.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kr.dev.netflix.R;
import kr.dev.netflix.databinding.FragmentOnboarding1Binding;


public class Fragment_Onboarding_1 extends Fragment {


    private FragmentOnboarding1Binding binding;

    public Fragment_Onboarding_1() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment__onboarding_1, container, false);
    }
}