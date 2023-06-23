package com.example.task_assignment_liveasy

import android.content.AbstractThreadedSyncAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.task_assignment_liveasy.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var arrayAdapter: ArrayAdapter<String>
    val language = arrayOf("English",
            "Mandarin Chinese",
            "Hindi",
            "Spanish",
            "French" ,
            "Standard Arabic" ,
            "Bengali" ,
            "Russian" ,
            "Portuguese" ,
            "Urdu" ,
            "Indonesian" ,
            "German" ,
            "Japanese" ,
            "Nigerian Pidgin" ,
            "Marathi" ,
            "Telugu" ,
            "Turkish" ,
            "Tamil" ,
            "Yue Chinese" ,
            "Vietnamese" ,
            "Tagalog" ,
            "Wu Chinese" ,
            "Korean" ,
            "Farsi" ,
            "Hausa" ,
            "Arabic" ,
            "Swahili" ,
            "Javanese" ,
            "Italian" ,
            "Kannada" ,
            "Gujarati" ,
            "Thai")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        arrayAdapter = ArrayAdapter(this@MainActivity,android.R.layout.simple_list_item_1,language)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.inputLanguageSpinner.adapter=arrayAdapter

        binding.inputLanguageSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>,
                                        view: View, position: Int, id: Long) {
          val value = parent.getItemIdAtPosition(position).toString();

            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // write code to perform some action
            }
        }


        binding.nextButton.setOnClickListener()
        {
            startActivity(Intent(this,PhoneActivity::class.java))
        }


    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        finishAffinity()
    }


}

