package com.example.marsphotos.fake

import com.example.marsphotos.model.MarsPhoto

object FakeDataSource {
    val idOne = "img1"
    val idTwo = "img2"
    val imgOne = "url.1"
    val imgTwo = "url.2"

    val photosList = listOf(
        MarsPhoto(
            id = idOne,
            imgSrc = imgOne
        ),
        MarsPhoto(
            id = idTwo,
            imgSrc = imgTwo
        )
    )
}