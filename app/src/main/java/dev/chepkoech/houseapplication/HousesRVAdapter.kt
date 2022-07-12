package dev.chepkoech.houseapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HousesRVAdapter(var houseList:List<House>):
    RecyclerView.Adapter<HousesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HousesViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.houses_list_item,parent,false)
        return HousesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: HousesViewHolder, position: Int) {
        var currentHouse = houseList.get(position)
        holder.tvHouseAddress.text = currentHouse.houseAddress
        holder.tvHouseName.text = currentHouse.houseName
        holder.tvPrice.text = currentHouse.price

    }

    override fun getItemCount(): Int {
        return houseList.size
    }
}
class HousesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvHouseName = itemView.findViewById<TextView>(R.id.tvHouseName)
    var tvHouseAddress = itemView.findViewById<TextView>(R.id.tvHouseAddress)
    var tvPrice= itemView.findViewById<TextView>(R.id.tvPrice)
    var imgHouse = itemView.findViewById<ImageView>(R.id.imgHouse)
}