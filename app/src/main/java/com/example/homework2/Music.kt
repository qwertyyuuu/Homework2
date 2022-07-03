package com.example.homework2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.homework2.R
import com.example.homework2.databinding.MusicMainBinding

class Music : Fragment(R.layout.music_main) {
    private var _binding: MusicMainBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = MusicMainBinding.bind(view)
    }

}