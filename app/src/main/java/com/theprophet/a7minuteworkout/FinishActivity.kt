package com.theprophet.a7minuteworkout

import android.icu.text.SimpleDateFormat
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.theprophet.a7minuteworkout.databinding.ActivityFinishBinding
import kotlinx.coroutines.launch
import java.util.*

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

        val dao = (application as WorkoutApp).db.historyDao()
        addDateToDatabase(dao)

    }
    private fun addDateToDatabase(historyDao: HistoryDao){

        //get calendar
        val c = Calendar.getInstance()
        val dateTime = c.time
        Log.e("Date: ", ""+dateTime)

        //format date
        val sdf = SimpleDateFormat("dd MMM yyyy HH:mm:ss", Locale.getDefault())
        val date = sdf.format(dateTime)
        Log.e("Formatted Date: ",""+ date)


        //coroutine
        lifecycleScope.launch {
            historyDao.insert(HistoryEntity(date))

        }

    }

}