package com.example.viewpagerproject.data

import com.example.viewpagerproject.R



class CityDataResource{
    fun loadCities(): List<City> {
        return listOf(
            City(1, R.string.spain, R.drawable.spain),
            City(2, R.string.new_york, R.drawable.new_york),
            City(3, R.string.tokyo, R.drawable.tokyo),
            City(4, R.string.switzerland, R.drawable.switzerland),
            City(5, R.string.singapore, R.drawable.singapore),
            City(6, R.string.paris, R.drawable.paris),
        )
    }

    fun loadDestinations(): List<City> {
        return listOf(
            City(1, R.string.coban_rondo, R.drawable.coban_rondo),
            City(2, R.string.gunung_bromo, R.drawable.gunung_bromo),
            City(3, R.string.gunung_semeru, R.drawable.gunung_semeru),
            City(4, R.string.kawah_ijen, R.drawable.kawah_ijen),
            City(5, R.string.pantai_balekambang, R.drawable.pantai_balekambang),
            City(6,R.string.sumber_sira, R.drawable.sumber_sira),
            City(7,R.string.coban_rais, R.drawable.coban_rais),
            City(8,R.string.kebun_teh_wonosari, R.drawable.kebun_teh_wonosari),
            City(9,R.string.pantai_goa_china, R.drawable.pantai_goa_china),
            City(10,R.string.selecta, R.drawable.selecta),
            City(11,R.string.taman_langit, R.drawable.taman_langit),
         //   City(,R.string., R.drawable.),



        )
    }
}