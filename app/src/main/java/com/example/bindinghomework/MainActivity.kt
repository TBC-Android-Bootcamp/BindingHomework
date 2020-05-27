package com.example.bindinghomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bindinghomework.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val users = mutableListOf<User>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
                this, R.layout.activity_main)


        users.add(User("Lionel", "Messi"))
        users.add(User("Cristiano", "Ronaldo"))
        users.add(User("Harry", "Kane"))
        users.add(User("Luka", "Modric"))
        users.add(User("Robert", "Lewandowski"))
        users.add(User("Toni", "Kroos"))

        recyclerView.adapter = Adapter(users, this@MainActivity)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
    }
}
