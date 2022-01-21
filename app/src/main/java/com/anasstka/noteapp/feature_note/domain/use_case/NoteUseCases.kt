package com.anasstka.noteapp.feature_note.domain.use_case

data class NoteUseCases(
    val getNotes: GatNotesUseCase,
    val deleteNote: DeleteNoteUseCase
)
