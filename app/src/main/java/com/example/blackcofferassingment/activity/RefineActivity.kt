package com.example.blackcofferassingment.activity

import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.blackcofferassingment.R
import com.example.blackcofferassingment.databinding.ActivityRefineBinding

class RefineActivity : AppCompatActivity(){
    private lateinit var binding : ActivityRefineBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRefineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener {
           this.onBackPressed()
        }

        val list = listOf(
            "Available | Het Let Us Connect",
            "Away | Stay Discrete And Watch",
            "Busy | Do Not Disturb | Will Catch Up Later",
            "SOS | Emergency! Need Assistance! HELP"
        )
        binding.tvAvailable.setOnClickListener {
            binding.spAvailable.performClick()
        }
        val adapter = ArrayAdapter(this, R.layout.spinner_dropdown_item, list)
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item)
        binding.spAvailable.adapter = adapter

        binding.spAvailable.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (parent != null) {
                    binding.tvAvailable.text = parent.getItemAtPosition(position).toString()
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        binding.etStatus.setText("Hi community! I am open to new connections." )
    }
}