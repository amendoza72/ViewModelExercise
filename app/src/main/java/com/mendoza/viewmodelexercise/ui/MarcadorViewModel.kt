package com.mendoza.viewmodelexercise.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MarcadorViewModel: ViewModel() {

    var tanteoEquipoA = MutableLiveData<Int>()
    var tanteoEquipoB = MutableLiveData<Int>()

    init{
        tanteoEquipoA.value = 0
        tanteoEquipoB.value = 0
    }

    fun haMarcado(equipo: String) {
        if (equipo.equals("A")){
            tanteoEquipoA.value = tanteoEquipoA.value!! + 1
        }
        else{
            tanteoEquipoB.value = tanteoEquipoB.value!! + 1
        }

    }

    fun dameResultado(): String {
        return tanteoEquipoA.value.toString() + " - " + tanteoEquipoB.value.toString()
    }
}