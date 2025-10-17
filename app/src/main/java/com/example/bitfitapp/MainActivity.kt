package com.example.bitfitapp
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Redirect to ListActivity as the primary entry point
        val intent = Intent(this, ListActivity::class.java)
        startActivity(intent)

        // Finish MainActivity so the back button doesn't return to it
        finish()
    }
}
