package com.example.jumpstart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle;
import android.view.MotionEvent
import android.view.View;
import android.widget.Button;
import android.widget.EditText
import android.widget.TextView;
import androidx.core.graphics.toColorInt
import kotlinx.android.synthetic.main.activity_main.view.*
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logButton = findViewById<Button>(R.id.loginButton)
        logButton.setOnClickListener {
            /*val intent = Intent(this,)*/


        }
        /*val accCreateText = findViewById<EditText>(R.id.etAccCreateText)
        accCreateText.setOnHoverListener { v: View?, event: MotionEvent? ->


        }*/
        val accCreateText = findViewById<EditText>(R.id.accCreation)
        accCreateText.setOnClickListener{


        }
    }
}