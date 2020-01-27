package com.example.fragmentexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var secondFragment: SecondFragment = SecondFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addSecondFragment()
    }

    private fun addSecondFragment() {
        supportFragmentManager
                .beginTransaction()
                .add(R.id.secondFragmentContainer, secondFragment, "SecondFragment")
                .commit()
    }
}
