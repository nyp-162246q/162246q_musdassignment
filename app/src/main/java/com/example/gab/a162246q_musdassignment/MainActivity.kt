package com.example.gab.a162246q_musdassignment

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAdd.setOnClickListener {

            val intent = Intent(this, AddActivity::class.java)
            startActivity(intent);
        }

        buttonView.setOnClickListener {

            val intent = Intent(this, ViewActivity::class.java)
            startActivity(intent);
        }

        buttonRate.setOnClickListener {

            val intent = Intent(this, RateActivity::class.java)
            startActivity(intent);
        }
    }

}
