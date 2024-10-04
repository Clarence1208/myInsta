package com.example.myinsta

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myinsta.models.HeaderStoryModel
import com.example.myinsta.views.StoryHeaderVH

class StoryHeaderAdapter (val headers: List<HeaderStoryModel>): RecyclerView.Adapter<StoryHeaderVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryHeaderVH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.story_header_cell, parent, false)
        return StoryHeaderVH(view)
    }

    override fun getItemCount(): Int {
        return this.headers.size
    }

    override fun onBindViewHolder(holder: StoryHeaderVH, position: Int) {
        val header = this.headers[position]

        holder.nameTv.text = header.name

        Glide.with(holder.imageTv.context)
            .load(header.image)
            .skipMemoryCache(true)
            .diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.NONE)
            .into(holder.imageTv)
    }
}