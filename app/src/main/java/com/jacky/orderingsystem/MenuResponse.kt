package com.jacky.orderingsystem

import com.google.gson.annotations.SerializedName

data class MenuResponse(

    @SerializedName("name")
    val name: String,

    @SerializedName("content")
    val content: String,

    @SerializedName("money")
    val money: String,

    @SerializedName("count")
    val count: String

)
