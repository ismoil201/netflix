package kr.dev.netflix.view;

import static java.util.Objects.*;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import kr.dev.netflix.R;
import kr.dev.netflix.adapter.HomeFilmsAdapter;
import kr.dev.netflix.adapter.ViewPagerHomeAdapter;
import kr.dev.netflix.databinding.FragmentHomeBinding;
import kr.dev.netflix.models.RekFilmsData;

public class HomeFragment extends Fragment {

    private ViewPagerHomeAdapter viewPagerHomeAdapter;

    private List<RekFilmsData> rekFilmsDataList;
    private HomeFilmsAdapter homeFilmsAdapter;
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

        loadList();
        viewPagerHomeAdapter = new ViewPagerHomeAdapter(getChildFragmentManager(),getLifecycle(),fragmentList);

        binding.vpHome.setAdapter(viewPagerHomeAdapter);

        homeFilmsAdapter = new HomeFilmsAdapter(rekFilmsDataList);

        binding.rvReklama.setAdapter(homeFilmsAdapter);

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



    private void loadList(){

        fragmentList = new ArrayList<>();


        fragmentList.add(new AllFragment());
        fragmentList.add(new ComedyFragment());
        fragmentList.add(new AnimationFragment());
        fragmentList.add(new DakumentariesFragment());

        rekFilmsDataList = new ArrayList<>();

        rekFilmsDataList.add(new RekFilmsData(R.drawable.img_3,
                "AVATAR 3 THE WAY OF WATER", "On 16 December 2023"));
        rekFilmsDataList.add(new RekFilmsData(R.drawable.img_4,
                "Black Panther Wakanda\nForever ","On 3 March 2023"));

        rekFilmsDataList.add(new RekFilmsData(R.drawable.img,
                "Ghosted, the highly anticipated","On 23 April 2022"));

        rekFilmsDataList.add(new RekFilmsData(R.drawable.img_1,
                "Director of neo-noir John Wick 4","On 12 May 2022"));



    }

}