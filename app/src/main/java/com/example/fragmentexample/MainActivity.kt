package com.example.fragmentexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), FirstFragmentListener {

    private lateinit var firstFragment: FirstFragment
    private var secondFragment: SecondFragment = SecondFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstFragment = supportFragmentManager.findFragmentById(R.id.firstFragmentContainer) as FirstFragment
        firstFragment.setListener(this)
    }

    private fun addSecondFragment() {
        if (supportFragmentManager.findFragmentByTag("SecondFragment") == null) {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.secondFragmentContainer, secondFragment, "SecondFragment")
                    .commit()
        }
    }

    override fun onShowContentClick() {
        addSecondFragment()
    }
}
