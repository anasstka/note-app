package com.anasstka.noteapp.feature_note.presentation.util

sealed class Screen(
    val route: String
) {
    object NotesScreen: Screen("notes")
    object AddEditNoteScreen: Screen("add_edit_note")
}
