package com.example.homework30.score

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class FirstViewModel(app: Application) : AndroidViewModel(app) {

    var score: MutableLiveData<Int> = MutableLiveData(0)
    fun increaseCounter() {
        score.value = score.value?.plus(1)
    }
}