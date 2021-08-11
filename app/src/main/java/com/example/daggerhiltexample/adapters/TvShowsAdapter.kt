package com.example.daggerhiltexample.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.daggerhiltexample.model.TvShow
import com.example.daggerhiltexample.databinding.CustomTvShowLayoutBinding

class TvShowsAdapter(private val shows: List<TvShow>) :
    RecyclerView.Adapter<TvShowsAdapter.TvShowsViewHolder>() {

    private lateinit var binding: CustomTvShowLayoutBinding

    class TvShowsViewHolder(private val binding: CustomTvShowLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(tvShow: TvShow) {
            binding.apply {
                this.tvShow = tvShow
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowsViewHolder {
        binding =
            CustomTvShowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return TvShowsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TvShowsViewHolder, position: Int) {
        holder.bind(shows[position])
    }

    override fun getItemCount(): Int {
        return shows.size
    }

}