package com.example.myinsta

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myinsta.models.HeaderStoryModel

class MainActivity : AppCompatActivity() {

    lateinit var storyHeaderRv: RecyclerView

    private val storyList: List<HeaderStoryModel> = listOf(
        HeaderStoryModel("david", "https://picsum.photos/200/300"),
        HeaderStoryModel("angel", "https://picsum.photos/200/300"),
        HeaderStoryModel("julie", "https://picsum.photos/200/300"),
        HeaderStoryModel("paul", "https://picsum.photos/200/300"),
        HeaderStoryModel("loriane", "https://picsum.photos/200/300"),
        HeaderStoryModel("julien", "https://picsum.photos/200/300"),
        HeaderStoryModel("nino", "https://picsum.photos/200/300"),
        HeaderStoryModel("lucas", "https://picsum.photos/200/300"),
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Setup rv
        this.storyHeaderRv = findViewById(R.id.story_header_rv)
        this.storyHeaderRv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        this.storyHeaderRv.adapter = StoryHeaderAdapter(storyList)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}