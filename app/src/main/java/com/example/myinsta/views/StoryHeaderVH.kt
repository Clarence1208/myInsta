package com.example.myinsta.views

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myinsta.R
import com.google.android.material.imageview.ShapeableImageView

class StoryHeaderVH (val itemView: View): RecyclerView.ViewHolder(itemView) {
    val nameTv: TextView = itemView.findViewById(R.id.story_header_name_tv)
    val imageTv: ShapeableImageView = itemView.findViewById(R.id.story_header_image)
}
