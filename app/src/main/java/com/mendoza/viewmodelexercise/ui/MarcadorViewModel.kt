package com.mendoza.viewmodelexercise.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MarcadorViewModel: ViewModel() {
    var nombreA = "Equipo A"
    var nombreB = "Equipo B"
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
        if (tanteoEquipoA.value!! > tanteoEquipoB.value!!){
            return nombreA
        }
        else{
            return nombreB
        }
        //return tanteoEquipoA.value.toString() + " - " + tanteoEquipoB.value.toString()
    }
}