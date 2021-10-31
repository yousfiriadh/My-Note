package com.yousfi.mynotes.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.yousfi.mynotes.databinding.ActivityNoteBinding
import com.yousfi.mynotes.db.NoteDatabase
import com.yousfi.mynotes.repository.NoteRepository
import com.yousfi.mynotes.utils.shortToast

class NoteActivity : AppCompatActivity() {

    lateinit var noteActivityViewModel: NoteActivityViewModel
    lateinit var binding: ActivityNoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNoteBinding.inflate(layoutInflater)
        try {
            setContentView(binding.root)
            val noteRepository = NoteRepository(NoteDatabase(this))
            val noteViewModelProviderFactory = NoteActivityViewModelFactory(noteRepository)
            noteActivityViewModel = ViewModelProvider(
                this,
                noteViewModelProviderFactory
            )[NoteActivityViewModel::class.java]
       } catch (e: Exception) {
            shortToast("error occurred")
        }
    }

}