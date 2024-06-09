package com.keval.practicum3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button


class DetailedViewActivity : AppCompatActivity() {
    private lateinit var btnMainMenu: Menu:Button
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)
        setContentView(R.layout.activity_detailed_view)

        val btnMainMenu: Button = findViewById<Button>(R.id.btnMainMenu)
        val tvDetails = findViewById<TextView>(R.id.tvDetails)
        val displayData = intent.getStringExtra("DISPLAY_DATA")
        tvDetails.text = displayData

        //val tvAvg = findViewById<TextView>(R.id.tvAvg)
        //val displayAverage = intent.getStringExtra("DISPLAY_DATA_AVG")
        //tvAvg.text = displayAverage


        btnMainMenu.setOnClickListener {
            val intent = Intent(this, MainScreenActivity::class.java)
            startActivity(intent)
    }
}