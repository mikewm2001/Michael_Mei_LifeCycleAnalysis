package com.bignerdranch.android.michael_mei_lifecycleanalysis

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate(Bundle?) called")
        setContentView(R.layout.activity_main)

        val myButton : Button = findViewById(R.id.button)
        val textView : TextView = findViewById(R.id.textView)
        val editText : EditText = findViewById(R.id.editText)

        myButton.setOnClickListener {
            textView.text = getString(R.string.HelloString)
            editText.setText(getString(R.string.HelloString))
        }
    }

    // Log the call of onStart event
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() called")
    }
    // Log the call of onRestart event
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart() called")
    }
    // Log the call of onResume event
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }
    // Log the call of onPause event
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }
    // Log the call of onStop event
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }
    // Log the call of onDestroy event
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }
}