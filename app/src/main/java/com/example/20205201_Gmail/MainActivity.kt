package com.example.`20205201_Gmail`

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.gmailpratice.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayListOf<ItemModel>()
        repeat(28) {
            val index = it + 1
            items.add(ItemModel(
            "\uD83D\uDCE9Edurila.com   ",
                "$19 only (First 10 spots) - Bestselling...Are you looking to Learn Web...",
                "12:34 PM",
                resources.getIdentifier("layer1", "drawable", packageName)
            ))
            items.add(ItemModel(
                "\uD83D\uDCE9Chris abad.com   ",
                "Help make Campaing Monitor better Let us know your thoughts! No Images...",
                "11:22 PM",
                resources.getIdentifier("layer2", "drawable", packageName)
            ))
            items.add(ItemModel(
                "\uD83D\uDCE9Tuto.com   ",
                "8h de formation gratuite et les nouvea... Photoshop, SEO, Blender, CSS, WordPre...",
                "11:04 PM",
                resources.getIdentifier("layer1", "drawable", packageName)
            ))
        }

        findViewById<ListView>(R.id.list_view).adapter = ItemAdapter(items)
    }


}