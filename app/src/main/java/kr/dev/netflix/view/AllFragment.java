package kr.dev.netflix.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import kr.dev.netflix.R;
import kr.dev.netflix.adapter.HomeCategoryAdapter;
import kr.dev.netflix.databinding.FragmentAllBinding;
import kr.dev.netflix.models.FilmData;

public class AllFragment extends Fragment {

    private HomeCategoryAdapter homeCategoryAdapter;

    private List<FilmData> filmDataList;

    private FragmentAllBinding binding;

    public AllFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding =  FragmentAllBinding.inflate(LayoutInflater.from(container.getContext()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadList();
        homeCategoryAdapter = new HomeCategoryAdapter(filmDataList);
    }

    private void loadList(){

        filmDataList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {


            filmDataList.add(new FilmData(R.drawable.film1, "Spider-Man No..."));
            filmDataList.add(new FilmData(R.drawable.film2, "Life of Pi"));
            filmDataList.add(new FilmData(R.drawable.film3, "The Jungle War.."));
            filmDataList.add(new FilmData(R.drawable.film4, "Riverdale"));
            filmDataList.add(new FilmData(R.drawable.film5, "Move Dotcase"));

        }
    }

}