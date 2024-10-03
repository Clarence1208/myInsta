package com.example.myinsta.views

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.myinsta.R
import com.google.android.material.imageview.ShapeableImageView

class PostVH(val itemView: View) : RecyclerView.ViewHolder(itemView) {
    val cardView: CardView = itemView.findViewById(R.id.post_card_view)
    val nameTv: TextView = itemView.findViewById(R.id.post_name_tv)
    val ppImg: ShapeableImageView = itemView.findViewById(R.id.pp_post_iv)
    val postImg: ImageView = itemView.findViewById(R.id.post_iv)
    val likeTv: TextView = itemView.findViewById(R.id.like_tv)
    val commentTv: TextView = itemView.findViewById(R.id.comment_tv)
    val shareTv: TextView = itemView.findViewById(R.id.share_tv)
    val descriptionTv: TextView = itemView.findViewById(R.id.post_description_tv)
    val userInfoCard: CardView = itemView.findViewById(R.id.profile_card_view)
}