package kr.dev.netflix.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kr.dev.netflix.R;
import kr.dev.netflix.databinding.FragmentSignBinding;

public class SignFragment extends Fragment {

    FragmentSignBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSignBinding.inflate(getLayoutInflater(), container, false);
        return inflater.inflate(R.layout.fragment_sign, container, false);
    }
}