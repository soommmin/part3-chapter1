package android.part3_chapter1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.part3_chapter1.databinding.ActivityMainBinding
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startDetectButton.setOnClickListener {
            it.isVisible = false
        }
    }
}