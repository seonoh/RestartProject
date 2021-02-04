package com.example.seonoh.restartproject.presenter

import android.util.Log
import android.view.View
import android.widget.Toast

class Presenter {

    fun onButtonClick(view : View,firstName : String,lastName :String){
        Toast.makeText(view.context,"$firstName $lastName",Toast.LENGTH_LONG).show()
        Log.e("isClicked","$firstName $lastName")
    }
}