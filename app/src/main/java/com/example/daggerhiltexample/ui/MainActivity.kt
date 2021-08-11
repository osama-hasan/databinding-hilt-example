package com.example.daggerhiltexample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.daggerhiltexample.R
import com.example.daggerhiltexample.adapters.TvShowsAdapter
import com.example.daggerhiltexample.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint


//Required for every Activity or Fragment we want to inject dependencies init
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val viewModel: ActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        viewModel.getTvShows(1).observe(this, {

            Log.d("osama","${it.tvShows.size}")
            binding.tvRecyclerView.adapter = TvShowsAdapter(it.tvShows)
            binding.tvRecyclerView.layoutManager =
                LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        })

    }
}