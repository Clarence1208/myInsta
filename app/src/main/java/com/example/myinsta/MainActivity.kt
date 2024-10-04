package com.example.myinsta

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myinsta.enums.PostType.*
import com.example.myinsta.models.HeaderStoryModel
import com.example.myinsta.models.PostModel


class MainActivity : AppCompatActivity(), OnPostClickListener {

    lateinit var storyHeaderRv: RecyclerView

    lateinit var postRv: RecyclerView


    private val storyList: List<HeaderStoryModel> = listOf(
        HeaderStoryModel("david", "https://picsum.photos/1200"),
        HeaderStoryModel("angel", "https://picsum.photos/1200"),
        HeaderStoryModel("julie", "https://picsum.photos/1200"),
        HeaderStoryModel("paul", "https://picsum.photos/1200"),
        HeaderStoryModel("loriane", "https://picsum.photos/1200"),
        HeaderStoryModel("julien", "https://picsum.photos/1200"),
        HeaderStoryModel("nino", "https://picsum.photos/1200"),
        HeaderStoryModel("lucas", "https://picsum.photos/1200"),
        HeaderStoryModel("lucie", "https://picsum.photos/1200"),
        HeaderStoryModel("luc", "https://picsum.photos/1200"),
        HeaderStoryModel("Alexie", "https://picsum.photos/1200"),
        HeaderStoryModel("Alex", "https://picsum.photos/1200"),
        HeaderStoryModel("Pierre", "https://picsum.photos/1200"),
        HeaderStoryModel("Paul", "https://picsum.photos/1200"),
        HeaderStoryModel("Jean", "https://picsum.photos/1200"),
        HeaderStoryModel("Jeanne", "https://picsum.photos/1200"),
        HeaderStoryModel("Marie", "https://picsum.photos/1200"),
        HeaderStoryModel("Marie", "https://picsum.photos/1200"),
    )


    private val postsList: List<PostModel> = listOf(
        PostModel(
            "david",
            "dadou",
            "https://picsum.photos/1200",
            "https://picsum.photos/1200",
            "Description Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla nec purus feugiat, vestibulum nunc id, ultricies nunc",
            "#dkdkdk, #djdjdj, #djdjdj",
            32,
            333,
            12,
            IMAGE
        ),
        PostModel(
            "david",
            "dadou",
            "https://picsum.photos/1200",
            "https://picsum.photos/1200",
            "Description Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla nec purus feugiat, vestibulum nunc id, ultricies nunc",
            "#dkdkdk, #djdjdj, #djdjdj",
            32,
            333,
            12,
            IMAGE
        ),

        PostModel(
            "david",
            "dadou",
            "https://picsum.photos/1200",
            "https://picsum.photos/1200",
            "Description Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla nec purus feugiat, vestibulum nunc id, ultricies nunc",
            "#dkdkdk, #djdjdj, #djdjdj",
            32,
            333,
            12,
            IMAGE
        ),

        PostModel(
            "david",
            "dadou",
            "https://picsum.photos/1200",
            "https://picsum.photos/1200",
            "Description Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla nec purus feugiat, vestibulum nunc id, ultricies nunc",
            "#dkdkdk, #djdjdj, #djdjdj",
            32,
            333,
            12,
            IMAGE
        ),

        PostModel(
            "david",
            "dadou",
            "https://picsum.photos/1200",
            "https://picsum.photos/1200",
            "Description Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla nec purus feugiat, vestibulum nunc id, ultricies nunc",
            "#dkdkdk, #djdjdj, #djdjdj",
            32,
            333,
            12,
            IMAGE
        ),

        )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Setup rv
        this.storyHeaderRv = findViewById(R.id.story_header_rv)
        this.storyHeaderRv.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        this.storyHeaderRv.adapter = StoryHeaderAdapter(storyList)


        // setup post rv
        this.postRv = findViewById(R.id.post_rv)
        this.postRv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        this.postRv.adapter = PostAdapter(postsList)


//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
//            val cardView = findViewById<MaterialCardView>(R.id.fullscreen_rv)
//            cardView.setRenderEffect(RenderEffect.createBlurEffect(20f, 20f, Shader.TileMode.CLAMP))
//        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onPostClick(postPosition: Int) {
//        Intent(this, PostActivity::class.java).apply
    }
}


interface OnPostClickListener {
    fun onPostClick(postPosition: Int)
}