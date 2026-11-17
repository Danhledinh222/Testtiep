package com.example.lamquen_2415053122308;

import kotlinx.serialization.descriptors.PrimitiveKind

fun String.ChuanHoaTen_2308(): String{
    return this.trim()
}

object QuyTacPhieu_2308{
    fun taoMaPhieu_2308(Stt: Int): String{
        return "L$Stt"
    }
}