package com.example.fragmentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FirstFragment : androidx.fragment.app.Fragment() {

    private var listener: FirstFragmentListener? = null
    private lateinit var btnShowContent: Button

    fun setListener(listener: FirstFragmentListener) {
        this.listener = listener
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        initializeButton(view)

        return view
    }

    private fun initializeButton(view: View) {
        btnShowContent = view.findViewById(R.id.btnShowContent)
        btnShowContent.setOnClickListener {
            listener?.onShowContentClick()
        }
    }

}