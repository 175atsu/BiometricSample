package com.example.androidtechsample.ui.groupie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.androidtechsample.databinding.FragmentGroupieBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GroupieFragment : Fragment() {

  private lateinit var binding: FragmentGroupieBinding
  private val viewModel: GroupieViewModel by viewModels()

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    binding = FragmentGroupieBinding.inflate(inflater)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
  }
}