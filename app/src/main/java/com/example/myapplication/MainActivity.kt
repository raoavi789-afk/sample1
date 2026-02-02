package com.example.myapplication

import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Handle window insets to make the button sticky
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { view, insets ->
            val imeInsets = insets.getInsets(WindowInsetsCompat.Type.ime())
            view.setPadding(view.paddingLeft, view.paddingTop, view.paddingRight, imeInsets.bottom)
            insets
        }
        binding.imageview1.setImageResource(R.drawable.gicon)

        binding.myEditText2.onFocusChangeListener = View.OnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                binding.myEditText2.hint = ""
            } else {
                binding.myEditText2.hint = "Enter your email here"
            }
        }

        binding.button.setOnClickListener {
            val email = binding.myEditText2.text.toString()
            binding.imageview1.setImageResource(R.drawable.sampleimage1)

            val toast = Toast.makeText(this, "Email submitted: $email", Toast.LENGTH_SHORT)

            // You can get a callback when the Toast is finished, but only on Android 11+ (API 30+)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                toast.addCallback(object : Toast.Callback() {
                    override fun onToastHidden() {
                        super.onToastHidden()
                        binding.imageview1.setImageResource(R.drawable.gicon)
                    }
                })
            }
            toast.show()
        }
    }
}
