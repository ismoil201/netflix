package kr.dev.netflix.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

import kr.dev.netflix.R;
import kr.dev.netflix.adapter.HomeCategoryAdapter;
import kr.dev.netflix.adapter.ViewPagerHomeAdapter;
import kr.dev.netflix.databinding.FragmentHomeBinding;
import kr.dev.netflix.models.FilmData;

public class HomeFragment extends Fragment {

    private ViewPagerHomeAdapter viewPagerHomeAdapter;


    private List<Fragment> fragmentList;
   private FragmentHomeBinding binding;

    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(LayoutInflater.from(container.getContext()),container, false);
        return binding.getRoot();




    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        fragmentList.add(new AllFragment());
        fragmentList.add(new ComedyFragment());
        fragmentList.add(new AnimationFragment());
        fragmentList.add(new DakumentariesFragment());

        viewPagerHomeAdapter = new ViewPagerHomeAdapter(getChildFragmentManager(),getLifecycle(),fragmentList);

        binding.vpHome.setAdapter(viewPagerHomeAdapter);

        new TabLayoutMediator(binding.tlCategories, binding.vpHome, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:{
                        tab.setText("All");
                        return;
                    }
                    case 1:{
                        tab.setText("Comedy");
                        return;
                    }
                    case 2:{
                        tab.setText("Animation");
                        return;
                    }
                    case 3:{
                        tab.setText("Dakumntaries");
                        return;
                    }

                }
            }
        }).attach();

    }




}