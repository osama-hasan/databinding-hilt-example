package com.example.daggerhiltexample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.daggerhiltexample.R
import com.example.daggerhiltexample.adapters.TvShowsAdapter
import com.example.daggerhiltexample.databinding.ActivityMainBinding
import com.example.daggerhiltexample.enums.Status
import dagger.hilt.android.AndroidEntryPoint


//Required for every Activity or Fragment we want to inject dependencies init
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val viewModel: ActivityViewModel by viewModels()
    private lateinit var adapter: TvShowsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        adapter = TvShowsAdapter(arrayListOf())

        setUpUI()
        setUpObserver()

    }


    private fun setUpUI() {
        binding.tvRecyclerView.adapter = adapter
        binding.tvRecyclerView.layoutManager =
            LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }

    private fun setUpObserver() {
        viewModel.getTvShows(2).observe(this, {
            when (it.status) {
                Status.SUCCESS -> {
                    binding.isLoading = false
                    adapter.submitData(it.data!!.tvShows)
                }
                Status.ERROR -> {
                    binding.isLoading = false
                    Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()
                }
                Status.LOADING -> {
                    binding.isLoading = true
                }
            }
        })
    }
}