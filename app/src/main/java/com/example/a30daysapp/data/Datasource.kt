package com.example.a30daysapp.data

import com.example.a30daysapp.R
import com.example.a30daysapp.model.PositiveThinking

class Datasource {
    fun loadPositiveThinking():List<PositiveThinking>{ //Source for images: https://www.pexels.com/
        return listOf<PositiveThinking>(
            PositiveThinking(R.string.day1,R.string.song1,R.string.pt1, R.drawable.img1),
            PositiveThinking(R.string.day2,R.string.song2,R.string.pt2, R.drawable.img2),
            PositiveThinking(R.string.day3,R.string.song3,R.string.pt3, R.drawable.img3),
            PositiveThinking(R.string.day4,R.string.song4,R.string.pt4, R.drawable.img4),
            PositiveThinking(R.string.day5,R.string.song5,R.string.pt5, R.drawable.img5),
            PositiveThinking(R.string.day6,R.string.song6,R.string.pt6, R.drawable.img6),
            PositiveThinking(R.string.day7,R.string.song7,R.string.pt7, R.drawable.img7),
            PositiveThinking(R.string.day8,R.string.song8,R.string.pt8, R.drawable.img8),
            PositiveThinking(R.string.day9,R.string.song9,R.string.pt9, R.drawable.img9),
            PositiveThinking(R.string.day10,R.string.song10,R.string.pt10, R.drawable.img10),
            PositiveThinking(R.string.day11,R.string.song11,R.string.pt11, R.drawable.img11),
            PositiveThinking(R.string.day12,R.string.song12,R.string.pt12, R.drawable.img12),
            PositiveThinking(R.string.day13,R.string.song13,R.string.pt13, R.drawable.img13),
            PositiveThinking(R.string.day14,R.string.song14,R.string.pt14, R.drawable.img14),
            PositiveThinking(R.string.day15,R.string.song15,R.string.pt15, R.drawable.img15),
            PositiveThinking(R.string.day16,R.string.song16,R.string.pt16, R.drawable.img16),
            PositiveThinking(R.string.day17,R.string.song17,R.string.pt17, R.drawable.img17),
            PositiveThinking(R.string.day18,R.string.song18,R.string.pt18, R.drawable.img18),
            PositiveThinking(R.string.day19,R.string.song19,R.string.pt19, R.drawable.img19),
            PositiveThinking(R.string.day20,R.string.song20,R.string.pt20, R.drawable.img20),
            PositiveThinking(R.string.day21,R.string.song21,R.string.pt21, R.drawable.img21),
            PositiveThinking(R.string.day22,R.string.song22,R.string.pt22, R.drawable.img22),
            PositiveThinking(R.string.day23,R.string.song23,R.string.pt23, R.drawable.img23),
            PositiveThinking(R.string.day24,R.string.song24,R.string.pt24, R.drawable.img24),
            PositiveThinking(R.string.day25,R.string.song25,R.string.pt25, R.drawable.img25),
            PositiveThinking(R.string.day26,R.string.song26,R.string.pt26, R.drawable.img26),
            PositiveThinking(R.string.day27,R.string.song27,R.string.pt27, R.drawable.img27),
            PositiveThinking(R.string.day28,R.string.song28,R.string.pt28, R.drawable.img28),
            PositiveThinking(R.string.day29,R.string.song29,R.string.pt29, R.drawable.img29),
            PositiveThinking(R.string.day30,R.string.song30,R.string.pt30, R.drawable.img30)
        )
    }
}