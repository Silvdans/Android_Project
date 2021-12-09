package fr.epsi.android_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class GroupInfosActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_infos)
        showBack();
    }
}