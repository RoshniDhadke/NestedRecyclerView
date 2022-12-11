package com.example.nestedrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.databinding.ActivityMainBinding.bind
import com.example.nestedrecyclerview.databinding.MovieItemBinding.bind
import com.example.nestedrecyclerview.dataclass.movie_dc

class MovieAdapter(val movie:List<movie_dc>): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    inner class MovieViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
     var image1:ImageView=itemView.findViewById(R.id.movie_iv)
       // val binding=MovieViewHolder.bind()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
      val infalter=LayoutInflater.from(parent.context)
        val view=infalter.inflate(R.layout.movie_item,parent,false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
       val data=movie[position]
        holder.image1.load(data.imageUrl)
    }

    override fun getItemCount(): Int {
      return movie.size
    }
}