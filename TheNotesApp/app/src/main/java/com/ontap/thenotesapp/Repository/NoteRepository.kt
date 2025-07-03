package com.ontap.thenotesapp.Repository

import androidx.room.Query
import com.ontap.thenotesapp.Database.NoteDataBase
import com.ontap.thenotesapp.Model.Note

class NoteRepository(private val db: NoteDataBase) {

    suspend fun insertNote(note: Note) = db.getNoteDao().insertNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().deleteNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().updateNote(note)

    fun getAllNote() = db.getNoteDao().getAllNote()
    fun searchNote(query: String?) = db.getNoteDao().searchNote(query)

}