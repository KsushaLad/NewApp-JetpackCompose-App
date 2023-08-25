package com.ksusha.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.ksusha.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Title 1",
        description = "Description of news app 1",
        image = R.drawable.ic_home
    ),
    Page(
        title = "Title 2",
        description = "Description of news app 2",
        image = R.drawable.ic_bookmark
    ),
    Page(
        title = "Title 3",
        description = "Description of news app 3",
        image = R.drawable.ic_preferences
    ),
)
