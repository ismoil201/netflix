package kr.dev.netflix.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import kr.dev.netflix.databinding.ItemImageReklamaBinding;
import kr.dev.netflix.models.RekFilmsData;

public class HomeFilmsAdapter extends RecyclerView.Adapter<HomeFilmsAdapter.Vh> {

    private List<RekFilmsData> rekFilmsData;

    public HomeFilmsAdapter(List<RekFilmsData> rekFilmsData) {
        this.rekFilmsData = rekFilmsData;
    }

    @NonNull
    @Override
    public Vh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Vh(ItemImageReklamaBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Vh holder, int position) {
        RekFilmsData filmsData = rekFilmsData.get(position);
        holder.binding.ivRekImage.setImageResource(filmsData.getFilmImage());
        holder.binding.tvTitleRek.setText(filmsData.getFilmName());
        holder.binding.tvDate.setText(filmsData.getData());
    }

    @Override
    public int getItemCount() {
        return rekFilmsData.size();
    }

    class Vh extends RecyclerView.ViewHolder{

        ItemImageReklamaBinding binding;
        public Vh(@NonNull ItemImageReklamaBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
