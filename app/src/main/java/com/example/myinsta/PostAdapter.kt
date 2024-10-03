package com.example.myinsta

import android.graphics.RenderEffect
import android.graphics.Shader
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.example.myinsta.models.PostModel
import com.example.myinsta.views.PostVH
import android.graphics.drawable.Drawable
import android.os.Build
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.google.android.material.card.MaterialCardView


class PostAdapter (val posts: List<PostModel>): RecyclerView.Adapter<PostVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostVH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_layout, parent, false)
        return PostVH(view)
    }

    override fun onBindViewHolder(holder: PostVH, position: Int) {
        val post = this.posts[position]
//        holder.postImg.setImageURI(post.postImage)

        System.err.println("PostAdapter onBindViewHolder post: $post")
        // log ppImage
        System.err.println("PostAdapter onBindViewHolder post.ppImage: ${holder.postImg}")

        // Use Glide to load the profile picture and the post image


        Glide.with(holder.ppImg.context)
            .load(post.ppImage)
            .skipMemoryCache(true)
            .diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.NONE)
            .into(holder.ppImg)

        Glide.with(holder.postImg.context)
            .load(post.postImage)
            .skipMemoryCache(true)
            .diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.NONE)
            .into(holder.postImg)




        holder.nameTv.text = post.name
//        holder.ppImg.setImageURI(post.ppImage)
        holder.likeTv.text = post.postLike.toString()
        holder.commentTv.text = post.postComment.toString()
        holder.shareTv.text = post.postShare.toString()
        holder.descriptionTv.text = buildString {
            append(post.postDescription)
            append(" ")
            append(post.postHashTags)
        }


        // Adjust card height based on its width
        holder.cardView.viewTreeObserver.addOnGlobalLayoutListener {
            val width = holder.cardView.width
            holder.cardView.layoutParams.height = width
            holder.cardView.requestLayout()
        }


        // Add blur effect to the card
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            holder.userInfoCard.setRenderEffect(RenderEffect.createBlurEffect(20f, 20f, Shader.TileMode.CLAMP))
        }
    }

    override fun getItemCount(): Int {
        return posts.size
    }

}