package com.mendoza.viewmodelexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.mendoza.viewmodelexercise.databinding.ActivityMainBinding
import com.mendoza.viewmodelexercise.ui.MarcadorViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var marcadorViewModel: MarcadorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        marcadorViewModel = ViewModelProvider(this).get(MarcadorViewModel::class.java)

        binding.buttonA.setOnClickListener {
            marcadorViewModel.haMarcado("A")
        }

        binding.buttonB.setOnClickListener {
            marcadorViewModel.haMarcado("B")
        }

        val tanteoAOberser=Observer<Int>{value ->
            binding.textViewMarcadorA.text = value.toString()
            binding.textViewPartido.text = marcadorViewModel.dameResultado()
        }

        /*marcadorViewModel.tanteoEquipoA.observe(this){value ->
            binding.textViewMarcadorA.text = value.toString()
        }*/
        marcadorViewModel.tanteoEquipoA.observe(this, tanteoAOberser)

        marcadorViewModel.tanteoEquipoB.observe(this){value ->
            binding.textViewMarcadorB.text = value.toString()
            binding.textViewPartido.text = marcadorViewModel.dameResultado()
        }
    }
}