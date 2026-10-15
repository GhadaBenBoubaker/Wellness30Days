
package com.example.wellness30days.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Adventure(
    @StringRes val day: Int,
    @StringRes val title: Int,
    @DrawableRes val image: Int,
    @StringRes val description: Int
)