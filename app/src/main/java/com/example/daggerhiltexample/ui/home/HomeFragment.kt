package com.example.daggerhiltexample.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.example.daggerhiltexample.R
import com.example.daggerhiltexample.adapters.TvShowsAdapter
import com.example.daggerhiltexample.databinding.FragmentHomeBinding
import com.example.daggerhiltexample.enums.Status
import com.example.daggerhiltexample.ui.ActivityViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding
    private val viewModel: ActivityViewModel by activityViewModels()
    private var page = 1
    lateinit var adapter: TvShowsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adapter = TvShowsAdapter(arrayListOf())

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

        binding.apply {
            moviesRecyclerView.adapter = adapter

        }
        setUpObserver()

    }

    private fun setUpObserver() {
//        viewModel.getTvShows(page).observe(viewLifecycleOwner, {
//            when (it.status) {
//                Status.SUCCESS -> {
//                    binding.isLoading = false
//                    it.data?.let { it1 -> adapter.submitList(it1.tvShows) }
//                }
//                Status.ERROR -> {
//                    binding.isLoading = false
//                }
//                Status.LOADING -> {
//                    binding.isLoading = true
//                    Toast.makeText(requireContext(), it.message, Toast.LENGTH_SHORT).show()
//                }
//            }
//        })
        viewModel.getTvShowsLocal().observe(viewLifecycleOwner, {
            if (it.isNotEmpty()) {
                adapter.submitList(it)
            }
        })
    }


    companion object {

        @JvmStatic
        fun newInstance() =
            HomeFragment()
    }
}