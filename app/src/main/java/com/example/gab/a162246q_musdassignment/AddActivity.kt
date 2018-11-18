package com.example.gab.a162246q_musdassignment

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_add.*

class AddActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)


        cbMsrp.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                cbViolence.visibility = (View.VISIBLE)
                cbLanguage.visibility = (View.VISIBLE)
            } else {
                cbViolence.visibility = (View.INVISIBLE)
                cbLanguage.visibility = (View.INVISIBLE)
            }

        }

            btnAddMovie.setOnClickListener {
                Toast.makeText(this, "Title = " + editTextName.text + "\n" + "Overview = " + editTextDesc.text + "\n" + "Language = " + "\n" + "Release date = " + tbDate.text + "\n" + "Not suitable for all ages: " + cbMsrp.isChecked, Toast.LENGTH_SHORT).show()
            }

        }
    }
