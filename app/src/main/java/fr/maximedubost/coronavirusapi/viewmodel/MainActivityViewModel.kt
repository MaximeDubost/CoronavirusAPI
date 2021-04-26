package fr.maximedubost.coronavirusapi.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import fr.maximedubost.coronavirusapi.models.RecyclerList
import fr.maximedubost.coronavirusapi.network.RetroInstance
import fr.maximedubost.coronavirusapi.network.RetroService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivityViewModel: ViewModel() {
    var recyclerListLiveData: MutableLiveData<RecyclerList> = MutableLiveData()

    fun getRecyclerListObserver(): MutableLiveData<RecyclerList> = recyclerListLiveData

    fun makeApiCall() {
        viewModelScope.launch(Dispatchers.IO) {
            val retroInstance = RetroInstance.getRetroInstance().create(RetroService::class.java)
            val response = retroInstance.getRegions()
            recyclerListLiveData.postValue(response)
        }
    }
}
