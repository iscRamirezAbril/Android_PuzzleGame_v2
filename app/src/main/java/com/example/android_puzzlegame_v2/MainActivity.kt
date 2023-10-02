package com.example.android_puzzlegame_v2

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main)

        btnPuzzle1.setOnClickListener {
            val intent = Intent(this, Puzzle1_Activity::class.java)
            startActivity(intent)
        }

        btnPuzzle2.setOnClickListener {
            val intent = Intent(this, Puzzle2_Activity::class.java)
            startActivity(intent)
        }

        btnPuzzle3.setOnClickListener {
            val intent = Intent(this, Puzzle3_Activity::class.java)
            startActivity(intent)
        }
    }
}