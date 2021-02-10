package com.example.agenda_fabiola.ui.activities

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.agenda_fabiola.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	
	private lateinit var binding : ActivityMainBinding
	
	override fun onCreate(savedInstanceState : Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)
	}
}