package com.kanat.criminalintent

import android.app.Application
import com.kanat.criminalintent.database.CrimeRepository

class CriminalIntentApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }

}