package com.example.myinsta.models

import android.net.Uri

data class PostModel (
    val name: String,
    val username: String,
    val ppImage: String,
    val postImage: String,
    val postDescription: String,
    val postHashTags: String,
    val postLike: Int,
    val postComment: Int,
    val postShare: Int
) {
}