package com.yousfi.mynotes.repository

import com.yousfi.mynotes.db.NoteDatabase
import com.yousfi.mynotes.model.Note

class NoteRepository(
   private val db: NoteDatabase,
) {

    fun getNote() =
        db.getNoteDao().getAllNote()

    fun searchNote(query: String) =
        db.getNoteDao().searchNote(query)

    suspend fun addNote(note: Note) =
        db.getNoteDao().addNote(note)

    suspend fun updateNote(note: Note) =
        db.getNoteDao().updateNote(note)

    suspend fun deleteNote(note: Note) =
        db.getNoteDao().deleteNote(note)

}