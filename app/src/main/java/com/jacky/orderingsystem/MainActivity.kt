package com.jacky.orderingsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.jacky.orderingsystem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var menuAdapter: MenuAdapter
    private var data = mutableListOf<MenuResponse>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {

        initView()
        initRecycleView()
    }

    private fun initView() {

    }

    private fun initRecycleView() {
        repeat(20) {
            val dataItem = MenuResponse(
                "越式生牛肉(板腱肉)",
                "招牌人氣現點現燙生牛肉河粉若需改豬肉結帳時請通知櫃檯人員餐點附上檸檬角、海鮮醬、辣醬若須生辣椒結帳時請告知服務人員",
                "$140",
                "0"
            )
            data.add(dataItem)
        }

        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(
                context,
                2
            )
            menuAdapter = MenuAdapter(
                data
            )
            adapter = menuAdapter
        }

    }
}