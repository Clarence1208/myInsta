package com.example.myinsta.views

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myinsta.PostAdapter
import com.example.myinsta.R
import com.example.myinsta.models.HeaderStoryModel
import com.example.myinsta.models.PostModel

class testing : AppCompatActivity() {



    lateinit var postRv: RecyclerView

    private val postsList: List<PostModel> = listOf(
        PostModel(
            "david",
            "dadou",
            "https://random.imagecdn.app/500/500",
            "https://cdn.futura-sciences.com/cdn-cgi/image/width=1024,quality=60,format=auto/sources/images/dossier/773/01-intro-773.jpg",
            "Description Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla nec purus feugiat, vestibulum nunc id, ultricies nunc",
            "#dkdkdk, #djdjdj, #djdjdj",
            32,
            333,
            12
        ),
        PostModel(
            "david",
            "dadou",
            "https://cdn.futura-sciences.com/cdn-cgi/image/width=1024,quality=60,format=auto/sources/images/dossier/773/01-intro-773.jpg",
            "https://picsum.photos/600",
            "Description Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla nec purus feugiat, vestibulum nunc id, ultricies nunc",
            "#dkdkdk, #djdjdj, #djdjdj",
            32,
            333,
            12
        ),

        PostModel(
            "david",
            "dadou",
            "https://picsum.photos/600",
            "https://picsum.photos/600",
            "Description Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla nec purus feugiat, vestibulum nunc id, ultricies nunc",
            "#dkdkdk, #djdjdj, #djdjdj",
            32,
            333,
            12
        ),

        PostModel(
            "david",
            "dadou",
            "https://picsum.photos/600",
            "https://picsum.photos/600",
            "Description Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla nec purus feugiat, vestibulum nunc id, ultricies nunc",
            "#dkdkdk, #djdjdj, #djdjdj",
            32,
            333,
            12
        ),

        PostModel(
            "david",
            "dadou",
            "https://picsum.photos/600",
            "https://picsum.photos/600",
            "Description Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla nec purus feugiat, vestibulum nunc id, ultricies nunc",
            "#dkdkdk, #djdjdj, #djdjdj",
            32,
            333,
            12
        ),

        )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_testing)


        // setup post rv
        this.postRv = findViewById(R.id.post_rv)
        this.postRv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        this.postRv.adapter = PostAdapter(postsList)




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}