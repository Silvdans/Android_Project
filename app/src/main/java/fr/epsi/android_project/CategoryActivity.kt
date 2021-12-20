package fr.epsi.android_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CategoryActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
        showBack();
    }
}