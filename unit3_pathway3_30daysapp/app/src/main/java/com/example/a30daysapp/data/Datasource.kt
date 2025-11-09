package com.example.a30daysapp.data

import com.example.a30daysapp.R

fun loadTips(): List<Tip> {
    val images = listOf(R.drawable.day1, R.drawable.day2, R.drawable.day3)

    return listOf(
        Tip(R.string.day_1, R.string.tip_1_title, R.string.tip_1_desc, images[0]),
        Tip(R.string.day_2, R.string.tip_2_title, R.string.tip_2_desc, images[1]),
        Tip(R.string.day_3, R.string.tip_3_title, R.string.tip_3_desc, images[2]),
        Tip(R.string.day_4, R.string.tip_4_title, R.string.tip_4_desc, images[0]),
        Tip(R.string.day_5, R.string.tip_5_title, R.string.tip_5_desc, images[1]),
        Tip(R.string.day_6, R.string.tip_6_title, R.string.tip_6_desc, images[2]),
        Tip(R.string.day_7, R.string.tip_7_title, R.string.tip_7_desc, images[0]),
        Tip(R.string.day_8, R.string.tip_8_title, R.string.tip_8_desc, images[1]),
        Tip(R.string.day_9, R.string.tip_9_title, R.string.tip_9_desc, images[2]),
        Tip(R.string.day_10, R.string.tip_10_title, R.string.tip_10_desc, images[0]),
        Tip(R.string.day_11, R.string.tip_11_title, R.string.tip_11_desc, images[1]),
        Tip(R.string.day_12, R.string.tip_12_title, R.string.tip_12_desc, images[2]),
        Tip(R.string.day_13, R.string.tip_13_title, R.string.tip_13_desc, images[0]),
        Tip(R.string.day_14, R.string.tip_14_title, R.string.tip_14_desc, images[1]),
        Tip(R.string.day_15, R.string.tip_15_title, R.string.tip_15_desc, images[2]),
        Tip(R.string.day_16, R.string.tip_16_title, R.string.tip_16_desc, images[0]),
        Tip(R.string.day_17, R.string.tip_17_title, R.string.tip_17_desc, images[1]),
        Tip(R.string.day_18, R.string.tip_18_title, R.string.tip_18_desc, images[2]),
        Tip(R.string.day_19, R.string.tip_19_title, R.string.tip_19_desc, images[0]),
        Tip(R.string.day_20, R.string.tip_20_title, R.string.tip_20_desc, images[1]),
        Tip(R.string.day_21, R.string.tip_21_title, R.string.tip_21_desc, images[2]),
        Tip(R.string.day_22, R.string.tip_22_title, R.string.tip_22_desc, images[0]),
        Tip(R.string.day_23, R.string.tip_23_title, R.string.tip_23_desc, images[1]),
        Tip(R.string.day_24, R.string.tip_24_title, R.string.tip_24_desc, images[2]),
        Tip(R.string.day_25, R.string.tip_25_title, R.string.tip_25_desc, images[0]),
        Tip(R.string.day_26, R.string.tip_26_title, R.string.tip_26_desc, images[1]),
        Tip(R.string.day_27, R.string.tip_27_title, R.string.tip_27_desc, images[2]),
        Tip(R.string.day_28, R.string.tip_28_title, R.string.tip_28_desc, images[0]),
        Tip(R.string.day_29, R.string.tip_29_title, R.string.tip_29_desc, images[1]),
        Tip(R.string.day_30, R.string.tip_30_title, R.string.tip_30_desc, images[2])
    )
}
