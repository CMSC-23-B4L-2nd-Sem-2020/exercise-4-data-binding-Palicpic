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

        binding.doneButton.setOnClickListener{
            doneButtonclickHandler(it)
        }
    }

    private fun doneButtonclickHandler(view: View) {
        binding.scrollview.visibility = View.GONE
        binding.nameTextView.text = binding.nameEditText.text
        binding.nicknameTextView.text = binding.nicknameEditText.text
        binding.ageTextView.text = binding.ageEditText.text
        binding.resultLayout.visibility = View.VISIBLE

        // Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
