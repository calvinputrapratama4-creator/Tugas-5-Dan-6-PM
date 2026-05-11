package com.example.viewpagerproject.pager

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.viewpagerproject.component.CityList
import com.example.viewpagerproject.data.CityDataResource


@Composable
fun CityTabCarousel() {
    val pagerState = rememberPagerState(pageCount = { 5 })

    HorizontalPager(
        state = pagerState,
        modifier = Modifier
            .fillMaxSize()
//            .height(120.dp)
    ) { page ->
        when (page) {
            0 -> {
                Text(
                    text = "This is favorite cities for traveling",
                    modifier = Modifier.padding(all = 16.dp)
                )
            }
            1 ->  {
                CityList(cityList = CityDataResource().loadCities())
            }
            2 -> {
                Text(
                    text = "This is local favorite destinitions for traveling",
                    modifier = Modifier.padding(all = 16.dp)
                )
            }
            3 -> {
                CityList(cityList = CityDataResource().loadDestinations())

            }
        }

    }
}