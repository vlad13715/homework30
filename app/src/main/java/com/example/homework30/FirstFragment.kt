package com.example.homework30

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.homework30.databinding.FragmentFirstBinding
import com.example.homework30.score.FirstViewModel


class FirstFragment : Fragment() {

    var binding: FragmentFirstBinding? = null
    var result: FirstViewModel? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        result = ViewModelProvider(this)[FirstViewModel::class.java]
        setOnClickListeners()
        observeScoreLiveData()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding?.root
    }


    private fun setOnClickListeners(){
        binding?.btnPlusOne?.setOnClickListener{

            result?.increaseCounter()
        }
    }

    private fun observeScoreLiveData(){
        result?.score?.observe(viewLifecycleOwner, Observer { counter ->

            binding?.tvScore?.text = counter.toString()
        })
    }


}