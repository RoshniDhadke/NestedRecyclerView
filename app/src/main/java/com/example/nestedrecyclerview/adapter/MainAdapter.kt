package com.example.nestedrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.dataclass.main_dc

class MainAdapter(val main:List<main_dc>):RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

   inner class MainViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
      val title:TextView=itemView.findViewById(R.id.parent_tv)
      //  val movie:ImageView=itemView.findViewById(R.id.movie_iv)
       val  rv:RecyclerView=itemView.findViewById(R.id.parent_rv)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
       val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.parent_item,parent,false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val input=main[position]
        holder.title.text=input.title
        //holder.movie.load(input.movie)
        val MovieAdapter=MovieAdapter(input.movie)
        holder.rv.adapter=MovieAdapter
    }

    override fun getItemCount(): Int {
      return main.size
    }
}