package dev.chepkoech.houseapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.chepkoech.houseapplication.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayHouses()
    }
    fun displayHouses(){
        var house =  House("KES 12,000","Nyamu House","Korongo Road","")
        var house1 =  House("KES 12,000","Nyamu House","Korongo Road","")
        var house2 =  House("KES 12,000","Nyamu House","Korongo Road","")
        var house3 = House("12342","Juja House","Karen","")
        var house4 =  House("KES 12,000","Nyamu House","Korongo Road","")
        var house5 =  House("KES 12,000","Nyamu House","Korongo Road","")
        var house6 =  House("KES 12,000","Nyamu House","Korongo Road","")
        var house7 =  House("KES 12,000","Nyamu House","Korongo Road","")
        var house8 =  House("KES 12,000","Nyamu House","Korongo Road","")
        var house9 =  House("KES 12,000","Nyamu House","Korongo Road","")

        var houseList = listOf(house,house1,house2,house3,house4,house5,house6,house7,house8,house9)
        var houseAdapter = HousesRVAdapter(houseList)
        binding.rvDisplayHouses.layoutManager = LinearLayoutManager(this)
        binding.rvDisplayHouses.adapter = houseAdapter
    }
}