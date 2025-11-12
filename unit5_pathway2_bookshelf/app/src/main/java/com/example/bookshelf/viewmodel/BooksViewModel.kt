package com.example.bookshelf.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bookshelf.data.NetworkModule
import com.example.bookshelf.data.BookItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class BooksViewModel : ViewModel() {
    private val _books = MutableStateFlow<List<BookItem>>(emptyList())
    val books: StateFlow<List<BookItem>> = _books

    fun searchBooks(query: String = "jazz+history") {
        viewModelScope.launch {
            try {
                val response = NetworkModule.apiService.searchBooks(query)
                _books.value = response.items ?: emptyList()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
