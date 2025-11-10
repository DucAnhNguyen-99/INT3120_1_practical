package com.example.mycity.data

import com.example.mycity.R
import com.example.mycity.model.Place

object DataSource {
    val places = listOf(
        Place(1, "Coffee House", "Quán cà phê yên tĩnh, view đẹp", "Cà phê", R.drawable.coffee),
        Place(2, "Nhà hàng Sông Hồng", "Ẩm thực Việt Nam chuẩn vị", "Nhà hàng", R.drawable.restaurant),
        Place(3, "Công viên Hòa Bình", "Không gian xanh mát cho gia đình", "Công viên", R.drawable.park),
        Place(4, "Vincom", "Trung tâm mua sắm hiện đại", "Mua sắm", R.drawable.mall),
        Place(5, "Khu vui chơi KidZone", "Khu vui chơi cho trẻ em", "Giải trí", R.drawable.kidzone)
    )
}
