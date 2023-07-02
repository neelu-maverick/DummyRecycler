package com.example.dummyrecycler

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dummyrecycler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val listData = arrayListOf<ListModel>()
    private lateinit var listAdapter: ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
        setList()
    }

    private fun initRecyclerView() {

        listAdapter = ListAdapter(listData) { position ->
            Log.d("TAG", "$position")
        }

        binding.recyclerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = listAdapter
        }
    }

    private fun setList() {
        listData.add(
            ListModel("Hi")
        )
        listData.add(
            ListModel("Hello")
        )
        listData.add(
            ListModel("Welcome")
        )
        listData.add(
            ListModel("Bye")
        )
        listData.add(
            ListModel("Good")
        )
        listData.add(
            ListModel("Awesome")
        )
        listData.add(
            ListModel("Well Done")
        )
        listData.add(
            ListModel("Good Bye")
        )
        listData.add(
            ListModel("Pleasure!")
        )
        listData.add(
            ListModel("Good Day")
        )

    }
}