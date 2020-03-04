package com.example.palicpic_exer4_slambook

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.palicpic_exer4_slambook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //clickhandler to the donebutton
        binding.doneButton.setOnClickListener{
            doneButtonclickHandler(it)
        }
    }

    //function to the clickhandler of done button
    private fun doneButtonclickHandler(view: View) {
        binding.scrollview.visibility = View.GONE   //set the visibility of scrollview to gone
        binding.nameTextView.text = binding.nameEditText.text   //get the input name
        binding.nicknameTextView.text = binding.nicknameEditText.text   //get the nickname
        binding.ageTextView.text = binding.ageEditText.text //get the age
        binding.resultLayout.visibility = View.VISIBLE  //display the name, nickname and age

        // Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
