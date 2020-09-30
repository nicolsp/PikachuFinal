package com.example.pikachufinal.Pikachuapp.ViewModel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pikachufinal.Pikachuapp.entities.TodosPoke
import com.example.pikachufinal.R
import kotlinx.android.synthetic.main.itempoke_list_view.view.*
import java.text.FieldPosition

class PokeAdapter(val callback: CallabackInterface): RecyclerView.Adapter<PokeAdapter.PokemonViewHolder>() {

    private var pokeinList = emptyList<TodosPoke>()

    fun updateAdapter(mList: List<TodosPoke>) {
        pokeinList = mList
        notifyDataSetChanged()
    }

    inner class PokemonViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val itemImg = itemView.tv1
       /* {
            callback.passTheData(pokeinList[adapterPosition])
        }
        */


    }

override fun onBindViewHolder(holder: PokemonViewHolder,position: Int) {
  // Glide.with(holder.context).load(pokeinList[position].pokemon).into(holder.itemImg)
}

    override fun getItemCount() = pokeinList.size

    interface CallabackInterface {
        fun passTheData(todosPoke: TodosPoke)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.itempoke_list_view, parent, false)
        return PokemonViewHolder(itemView)
    }


}

