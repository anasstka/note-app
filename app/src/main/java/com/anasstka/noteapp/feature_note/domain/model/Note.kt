package com.anasstka.noteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.anasstka.noteapp.ui.theme.*

@Entity
data class Note(
    @PrimaryKey val id: Int,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int
) {
    companion object {
        val noteColors = listOf(
            MauveColor,
            RedPinkColor,
            LightGreenColor,
            LightYellowColor,
            LightBlueColor,
            LightVioletColor
        )
    }
}
