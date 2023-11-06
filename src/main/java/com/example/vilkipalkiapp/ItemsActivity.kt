package com.example.vilkipalkiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iteams)

        val itemsList: RecyclerView = findViewById(R.id.iteamsList)
        val items = arrayListOf<Item>()

        items.add(Item(1,"204","Тушеная говядина с картофелем","Описание:","Нежные кусочки говядины в сочетании с тушеным картофелем и чуть припущенными овощами в традиционном соусе и аромате китайских специй.", 780))
        items.add(Item(2,"204","Тушеная говядина с картофелем","Описание:","Нежные кусочки говядины в сочетании с тушеным картофелем и чуть припущенными овощами в традиционном соусе и аромате китайских специй.", 780))
        items.add(Item(3,"204","Тушеная говядина с картофелем","Описание:","Нежные кусочки говядины в сочетании с тушеным картофелем и чуть припущенными овощами в традиционном соусе и аромате китайских специй.", 780))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemAdapter(items, this)

    }
}