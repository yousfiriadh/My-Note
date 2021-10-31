package com.yousfi.mynotes.ui.activity

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.yousfi.mynotes.repository.NoteRepository

@Suppress("UNCHECKED_CAST")
class NoteActivityViewModelFactory(private val repository: NoteRepository) :
    ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NoteActivityViewModel(repository) as T
    }
}