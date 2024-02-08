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
}