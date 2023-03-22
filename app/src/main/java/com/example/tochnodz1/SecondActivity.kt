package com.example.tochnodz1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.tochnodz1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val cat1 = intent.getParcelableExtra<Animal>(MainActivity.ANIMAL_KEY1)
        val cat2 = intent.getParcelableExtra<Animal>(MainActivity.ANIMAL_KEY2)
        val cat3 = intent.getParcelableExtra<Animal>(MainActivity.ANIMAL_KEY3)
        cat1?.let {
            val catStr =
                "He is ${cat1.name}, his description is ${cat1.disc}, and he is sticker from Telegram from zxcursed's group"
            binding.qweZXC.text = catStr
            binding.gugu.setImageResource(R.drawable.cat1)

        }

        cat2?.let {
            val catStr =
                "He is ${cat2.name}, his description is ${cat2.disc}, and he is sticker from Telegram from zxcursed's group"
            binding.qweZXC.text = catStr
            binding.gugu.setImageResource(R.drawable.cat5)

        }

        cat3?.let {
            val catStr =
                "He is ${cat3.name}, his description is ${cat3.disc}, and he is sticker from Telegram from zxcursed's group"
            binding.qweZXC.text = catStr
            binding.gugu.setImageResource(R.drawable.cat3)

        }
        binding.button4.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}