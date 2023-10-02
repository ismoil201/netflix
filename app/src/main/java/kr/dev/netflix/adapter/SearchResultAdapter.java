package kr.dev.netflix.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import kr.dev.netflix.databinding.ItemSearchResultBinding;
import kr.dev.netflix.models.SearchResult;

public class SearchResultAdapter extends RecyclerView.Adapter<SearchResultAdapter.ViewHolder> {

    List<SearchResult> searchResultList;

    public SearchResultAdapter(List<SearchResult> searchResultList) {
        this.searchResultList = searchResultList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ViewHolder(ItemSearchResultBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        SearchResult searchResult = searchResultList.get(position);
        holder.binding.ivSpiderman.setImageResource(searchResult.getImgFilm());
        holder.binding.tvCalendarTitle.setText(searchResult.getData());
        holder.binding.tvTitle.setText(searchResult.getName());
        holder.binding.tvClockTitle.setText(searchResult.getTime());
        holder.binding.tvActionTitle.setText(searchResult.getJanr());
    }

    @Override
    public int getItemCount() {
        return searchResultList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ItemSearchResultBinding binding;
        public ViewHolder(@NonNull ItemSearchResultBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
