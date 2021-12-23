package fr.epsi.android_project


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class GroupInfosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_groupe_infos)
        val buttonStudent1 = findViewById<Button>(R.id.button_info_Student1)
        val buttonStudent2 = findViewById<Button>(R.id.button_info_Student2)
        val buttonStudent3 = findViewById<Button>(R.id.button_info_Student3)
        buttonStudent1.setOnClickListener(View.OnClickListener {
            val newIntent = Intent(application,GroupInfosActivity::class.java)
            newIntent.putExtra("title","Nom")
            newIntent.putExtra("urlImage","https://media-exp1.licdn.com/dms/image/C4D03AQGRGRdI01mGkg/profile-displayphoto-shrink_100_100/0/1631544251476?e=1642032000&v=beta&t=LlW6zqYOnGnE2G5fF3QQGoNYrXXbUipVNsD8hfT2r-k")
            newIntent.putExtra("name","DAUPHIN")
            newIntent.putExtra("firstname","Hugo")
            newIntent.putExtra("email","Hugo.dauphin@epsi.fr")
            newIntent.putExtra("groupe","Groupe G1")
            startActivity(newIntent)
        })
        buttonStudent2.setOnClickListener(View.OnClickListener {
            val newIntent = Intent(application,GroupInfosActivity::class.java)
            newIntent.putExtra("title","Nom")
            newIntent.putExtra("urlImage","https://media-exp1.licdn.com/dms/image/C4E03AQHDpb1jWGryKA/profile-displayphoto-shrink_800_800/0/1607439975563?e=1644451200&v=beta&t=UYphiSZtgDf8AxgVqGM4NAZ3Ml3YDZeT7LE5jS8J9uw")
            newIntent.putExtra("name","DELPIERRE")
            newIntent.putExtra("firstname","Loic")
            newIntent.putExtra("email","Loic.delpierre@epsi.fr")
            newIntent.putExtra("groupe","Groupe G1")
            startActivity(newIntent)
        })
        buttonStudent3.setOnClickListener(View.OnClickListener {
            val newIntent = Intent(application,GroupInfosActivity::class.java)
            newIntent.putExtra("title","Nom")
            newIntent.putExtra("urlImage","https://media-exp1.licdn.com/dms/image/C4E03AQEQwHe7sP9_Kg/profile-displayphoto-shrink_200_200/0/1626286353715?e=1643846400&v=beta&t=3ilATSVbQ-ujmehobrowz9yaDjAzn4F1SfgOjABAqJY")
            newIntent.putExtra("name","RECLUS")
            newIntent.putExtra("firstname","Mathis")
            newIntent.putExtra("email","mathis.Reclus@epsi.fr")
            newIntent.putExtra("groupe","Groupe G1")
            startActivity(newIntent)
        })

    }
}