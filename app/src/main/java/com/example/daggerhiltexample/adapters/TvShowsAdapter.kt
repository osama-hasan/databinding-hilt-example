package com.example.daggerhiltexample.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.daggerhiltexample.model.TvShow
import com.example.daggerhiltexample.databinding.CustomTvShowLayoutBinding

class TvShowsAdapter(private var shows: List<TvShow>) :
    ListAdapter<TvShow, TvShowsAdapter.TvShowsViewHolder>(DiffCallbacks()) {

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
        holder.bind(getItem(position))
    }

    class DiffCallbacks : DiffUtil.ItemCallback<TvShow>() {
        override fun areItemsTheSame(oldItem: TvShow, newItem: TvShow) = oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: TvShow, newItem: TvShow) = oldItem == newItem

    }


}


