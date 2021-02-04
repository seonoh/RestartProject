package com.example.seonoh.restartproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.seonoh.restartproject.data.ViewModel
import com.example.seonoh.restartproject.databinding.ActivityMainBinding
import com.example.seonoh.restartproject.presenter.Presenter


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.my = ViewModel("Eam","Seonoh")
        binding.other = ViewModel("Oh","Bitna")
        binding.presenter = Presenter()
    }
}