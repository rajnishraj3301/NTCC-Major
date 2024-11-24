package com.shandilyaOam.d8gmusicPlayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shandilyaOam.d8gmusicPlayer.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(MainActivity.currentThemeNav[MainActivity.themeIndex])
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "About"
        binding.aboutText.text = aboutText()
    }
    private fun aboutText(): String{
        return "1. Developed By: Oam Shandilya\n2. Tested By: Nishant" +
                "\n\n3. If you want to provide feedback, I will love to hear that." +
                "\n\n4. Features: " +
                "\n\n\n...............MADE WITH ❤ FROM OAM..............."
    }
}