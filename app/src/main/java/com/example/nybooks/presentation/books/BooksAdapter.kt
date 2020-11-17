package com.example.nybooks.presentation.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import com.example.nybooks.R
import com.example.nybooks.presentation.data.model.Book
import kotlinx.android.synthetic.main.item_book.view.*

class BooksAdapter(
      private val books: List<Book>,
      val onItemClickListener: ((book: Book) -> Unit)
): RecyclerView.Adapter<BooksAdapter.BooksViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, view: Int): BooksViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_book,parent ,false)
        return BooksViewHolder(itemView,onItemClickListener)
    }

    override fun onBindViewHolder(viewHolder: BooksViewHolder, position: Int) {
        viewHolder.bindView(books[position])
    }

    override fun getItemCount() = books.count()
    class BooksViewHolder(view: View,private  val onItemClickListener: ((book: Book) -> Unit)): RecyclerView.ViewHolder(view){
        private val title = view.textTitle
        private val author = view.textAuthor
        fun bindView(book:Book){
            title.text = book.title
            author.text = book.author

            itemView.setOnClickListener{
                onItemClickListener.invoke(book)
            }
        }
    }
}