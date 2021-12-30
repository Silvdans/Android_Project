package fr.epsi.android_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import java.io.PrintWriter

class StudentsInfosActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students_info)
        intent.getStringExtra("title")?.let { setHeaderTitle(it) }

        val imageView = findViewById<ImageView>(R.id.imageViewStudent)
        val urlImage = intent.getStringExtra("urlImage")

        val infoView = findViewById<TextView>(R.id.nameViewStudent)
        val info = intent.getStringExtra("info")

        val nameView = findViewById<TextView>(R.id.nameViewStudent)
        val name = intent.getStringExtra("name")

        val firstnameView = findViewById<TextView>(R.id.firstnameViewStudent)
        val firstname = intent.getStringExtra("firstname")

        val emailView = findViewById<TextView>(R.id.emailViewStudent)
        val email = intent.getStringExtra("email")

        val groupeView = findViewById<TextView>(R.id.groupeViewStudent)
        val groupe = intent.getStringExtra("groupe")

        Picasso.get().load(urlImage).into(imageView)
        infoView.text = info
        nameView.text = name
        firstnameView.text = firstname
        emailView.text = email
        groupeView.text = groupe

    }
}