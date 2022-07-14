package com.calderaro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.calderaro.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(R.layout.activity_main)
//        findViewById<TextView>(R.id.textViewHelloWorld)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.textViewHelloWorld.text = "Testando 1, 2, 3."

    }
}