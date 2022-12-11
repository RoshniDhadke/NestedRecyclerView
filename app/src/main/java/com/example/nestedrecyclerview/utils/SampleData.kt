package com.example.nestedrecyclerview.utils

import com.example.nestedrecyclerview.dataclass.main_dc
import com.example.nestedrecyclerview.dataclass.movie_dc

object SampleData {
    private val movie_dc= listOf(
    movie_dc(Image.imageUrl0),
        movie_dc(Image.imageUrl1),
        movie_dc(Image.imageUrl2),
        movie_dc(Image.imageUrl3),
        movie_dc(Image.imageUrl4),
        movie_dc(Image.imageUrl5),
        movie_dc(Image.imageUrl6),
        movie_dc(Image.imageUrl7),
        movie_dc(Image.imageUrl8),
        movie_dc(Image.imageUrl9)

    )

    val collection= listOf(
        main_dc("All Movie", movie_dc),
        main_dc("Want to see", movie_dc.reversed()),
        main_dc("Popular Movie", movie_dc.shuffled()),
        main_dc("Top Rated Movie", movie_dc.reversed()),
        main_dc("Recently Viewed", movie_dc)
    )
}