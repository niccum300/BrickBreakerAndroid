package com.example.brickbreaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startBtn = findViewById<Button>(R.id.start_btn)
        startBtn.setOnClickListener(this)

        val quitBtn = findViewById<Button>(R.id.quit_btn)
        quitBtn.setOnClickListener(this)
    }

    override fun onClick(v:View)
    {
        if (v.id == R.id.quit_btn)
        {
            this@MainActivity.finish()
            exitProcess(0)
        }
    }
}
