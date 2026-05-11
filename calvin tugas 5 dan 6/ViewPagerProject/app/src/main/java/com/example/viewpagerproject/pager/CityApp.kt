package com.example.viewpagerproject.pager

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.viewpagerproject.component.CityList
import com.example.viewpagerproject.data.CityDataResource

@Composable
fun CityApp() {
    Column {
        CityTabCarousel() //ViewPager
       CityList(cityList = CityDataResource().loadCities()) //Lazylist
    }
}

//@Composable
//fun LokalApp() {
//    Column {
//        CityTabCarousel() //ViewPager
//        CityList(cityList = CityDataResource().loadCities()) //Lazylist
//    }
//}