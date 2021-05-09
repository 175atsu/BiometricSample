package com.example.androidtechsample.motion

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.androidtechsample.databinding.FragmentMotionKeyPositionBinding

class MotionKeyPositionFragment : Fragment() {

  private lateinit var binding: FragmentMotionKeyPositionBinding

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    binding = FragmentMotionKeyPositionBinding.inflate(inflater)
    return binding.root
  }
}