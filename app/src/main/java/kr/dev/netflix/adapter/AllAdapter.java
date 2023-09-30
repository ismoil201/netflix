package kr.dev.netflix.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import kr.dev.netflix.databinding.ItemFilmsBinding;
import kr.dev.netflix.models.FilmData;

public class AllAdapter extends RecyclerView.Adapter<AllAdapter.Vh> {

    List<FilmData> filmDataList;

    public AllAdapter(List<FilmData> filmDataList) {
        this.filmDataList = filmDataList;
    }

    @NonNull
    @Override
    public Vh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Vh(ItemFilmsBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Vh holder, int position) {

        FilmData filmData = filmDataList.get(position);
        holder.binding.ivFilm.setImageResource(filmData.getImage());
        holder.binding.tvFilmName.setText(filmData.getFilmName());
    }

    @Override
    public int getItemCount() {
        return filmDataList.size();
    }

    class Vh extends RecyclerView.ViewHolder {

        ItemFilmsBinding binding;
        public Vh(@NonNull ItemFilmsBinding binding) {
            super(binding.getRoot());
            this.binding  = binding;
        }
    }
}
