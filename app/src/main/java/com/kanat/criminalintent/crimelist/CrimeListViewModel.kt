package com.kanat.criminalintent.crimelist

import androidx.lifecycle.ViewModel
import com.kanat.criminalintent.database.Crime
import com.kanat.criminalintent.database.CrimeRepository


class CrimeListViewModel : ViewModel() {
    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()
    fun addCrime(crime: Crime) {
        crimeRepository.insertCrime(crime)
    }
}