package com.example.homework30

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.homework30.databinding.FragmentFirstBinding
import com.example.homework30.score.Score


class FirstFragment : Fragment() {

    var binding: FragmentFirstBinding? = null
    var result: Score? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        result = ViewModelProvider(this)[Score::class.java]
        result?.setOnClickListeners()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding?.root
    }


}