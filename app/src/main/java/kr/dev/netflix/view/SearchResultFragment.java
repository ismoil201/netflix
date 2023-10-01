package kr.dev.netflix.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import kr.dev.netflix.R;
import kr.dev.netflix.adapter.SearchResultAdapter;
import kr.dev.netflix.databinding.FragmentSearchResultBinding;
import kr.dev.netflix.models.SearchResult;


public class SearchResultFragment extends Fragment {

    SearchResultAdapter adapter;


    private FragmentSearchResultBinding binding;

   private List<SearchResult> searchResultList;
     public SearchResultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         binding = FragmentSearchResultBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadList();
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(view.getContext(),DividerItemDecoration.VERTICAL);
        binding.rvSearchResult.addItemDecoration(dividerItemDecoration);
        adapter = new SearchResultAdapter(searchResultList);
        binding.rvSearchResult.setAdapter(adapter);


    }

    public void loadList(){
        searchResultList = new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            searchResultList.add(new SearchResult(R.drawable.spiderman, "Spider-Man No Way.. ", " 2021", "148 Minutes", "Action | Movie"));
            searchResultList.add(new SearchResult(R.drawable.lifeofpi, "Life of Pi", " 2012", "127 Minutes", "Action | Dorama"));
            searchResultList.add(new SearchResult(R.drawable.thejungkewaiting, "The Jungle Waiting", " 2021", "148 Minutes", "Action | Movie"));
            searchResultList.add(new SearchResult(R.drawable.jonkuginamu, "천국의 나무", " 2006", "60 Minutes", "로맨스 | Dorama"));
            searchResultList.add(new SearchResult(R.drawable.shaytanat, "Shaytanat", " 1999", "120 Minutes", "드라마"));
        }
    }
}