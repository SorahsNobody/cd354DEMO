package com.benbettencourt.cd354demo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import java.util.Random

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var javaInt = 0
        var kotlInt = 0

        view.findViewById<Button>(R.id.java_button).setOnClickListener {
            val javaText = view.findViewById<TextView>(R.id.java_text)
            val rand = Random()
            javaInt = rand.nextInt(100)
            javaText.text = javaInt.toString()
        }

        view.findViewById<Button>(R.id.kotlin_button).setOnClickListener {
            val kotlinText = view.findViewById<TextView>(R.id.kotlin_text)
            val rand = kotlin.random.Random
            kotlInt = rand.nextInt(100)
            kotlinText.text = kotlInt.toString()
        }

        view.findViewById<Button>(R.id.add).setOnClickListener {
            val addText = view.findViewById<TextView>(R.id.addText)
            addText.text = (javaInt + kotlInt).toString()
        }
    }
}