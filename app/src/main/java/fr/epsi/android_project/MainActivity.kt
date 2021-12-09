package fr.epsi.android_project

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonZone1 = findViewById<Button>(R.id.button_zone_1)
        val buttonZone2 = findViewById<Button>(R.id.button_zone_2)
        buttonZone1.setOnClickListener(View.OnClickListener {
            val newIntent = Intent(application,GroupInfosActivity::class.java)
            newIntent.putExtra("title","Zone 1")
            startActivity(newIntent)
        })

        buttonZone2.setOnClickListener(View.OnClickListener {
            val newIntent = Intent(application,CategoryActivity::class.java)
            newIntent.putExtra("title","Zone 2")
            startActivity(newIntent)
        })
    }
}