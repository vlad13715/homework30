package com.example.homework30.score

import android.app.Application
import android.os.Bundle
import android.view.View
import androidx.lifecycle.AndroidViewModel
import com.example.homework30.databinding.FragmentFirstBinding

class Score(app:Application): AndroidViewModel(app) {

    var binding: FragmentFirstBinding? = null
     var score: Int = 1




     fun setOnClickListeners() {
        binding?.btnPlusOne?.setOnClickListener {
            binding?.tvScore?.text= score++.toString()

        }
    }



}