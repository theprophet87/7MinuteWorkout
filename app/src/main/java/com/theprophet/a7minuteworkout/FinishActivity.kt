package com.theprophet.a7minuteworkout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.theprophet.a7minuteworkout.databinding.ActivityFinishBinding

class FinishActivity: AppCompatActivity() {

    private var binding: ActivityFinishBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarFinishActivity)

        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)

        }

        //setting up back button
        binding?.toolbarFinishActivity?.setNavigationOnClickListener {
            onBackPressed()
        }


        //setting up Finish button
        binding?.btnFinish?.setOnClickListener {
            finish()

        }


    }
}