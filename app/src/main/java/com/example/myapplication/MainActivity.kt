package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.myapplication.fragments.AboutFragment
import com.example.myapplication.fragments.QuestionsFragment
import com.example.myapplication.fragments.SettingsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun menuClick(view: View) {
        when(view.id){
            R.id.btnQuestions -> QuestionsFragment().load()
            R.id.btnSettings -> SettingsFragment().load()
            R.id.btnAbout -> AboutFragment().load()
        }
    }

    private fun Fragment.load() =
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, this).commit()

}
