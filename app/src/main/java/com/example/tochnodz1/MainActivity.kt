package com.example.tochnodz1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tochnodz1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cat1 = Animal( "Cool Cat", "He is cool")
        val cat2 = Animal("Cool Cat too", "He is cool")
        val cat3 = Animal("Very Cool Cat", "He is the coolest cat there")
        cat1?.let {
            val cat1Str = "${cat1.name}"
            val cat1StrAge = "${cat1.disc}"
            binding.tvName1.text = cat1StrAge
            binding.tvDesc1.text = cat1Str
        }

        cat2?.let {
            val cat2Str = "${cat2.name}"
            val cat2StrAge = "${cat2.disc}"
            binding.tvName2.text = cat2StrAge
            binding.tvDesc2.text = cat2Str

        }

        cat3?.let {
            val cat3Str = "${cat3.name}"
            val cat3StrAge = "${cat3.disc}"
            binding.tvName3.text = cat3StrAge
            binding.tvDesc3.text = cat3Str
        }

        binding.button1.setOnClickListener {
            val intent1 = Intent(this, SecondActivity::class.java)
            intent1.putExtra(ANIMAL_KEY1, cat1)
            startActivity(intent1)
        }

        binding.button2.setOnClickListener {
            val intent2 = Intent(this, SecondActivity::class.java)
            intent2.putExtra(ANIMAL_KEY2, cat2)
            startActivity(intent2)
        }

        binding.button3.setOnClickListener {
            val intent3 = Intent(this, SecondActivity::class.java)
            intent3.putExtra(ANIMAL_KEY3, cat3)
            startActivity(intent3)
        }
    }

    companion object {
        val ANIMAL_KEY1 = "animal_1"
        val ANIMAL_KEY2 = "animal_2"
        val ANIMAL_KEY3 = "animal_3"
    }
}