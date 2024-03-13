data class Book(
    val registrationNumber: Int,
    val author: String,
    val title: String,
    val year: Int,
    val publisher: String,
    val pageCount: Int
)

class BookList : IClassInfo<Book>, IClassChange<Book> {
    private val books = mutableListOf<Book>()

    override fun input(items: List<Book>) {
        books.addAll(items)
    }

    override fun display() {
        if (books.isEmpty()) {
            println("Список книг пуст")
            return
        }
        for (book in books) {
            println("${book.author}: ${book.title}, ${book.year} год издания")
        }
    }

    override fun delete(item: Book) {
        books.remove(item)
    }

    override fun sort(comparator: Comparator<Book>) {
        books.sortWith(comparator)
    }

    override fun filter(predicate: (Book) -> Boolean) {
        val filteredBooks = books.filter(predicate)
        if (filteredBooks.isEmpty()) {
            println("Таких элементов нет")
        } else {
            for (book in filteredBooks) {
                println("${book.author}: ${book.title}, ${book.year} год издания")
            }
        }
    }
}

interface IClassInfo<T> {
    fun input(items: List<T>)
    fun display()
    fun delete(item: T)
}

interface IClassChange<T> {
    fun sort(comparator: Comparator<T>)
    fun filter(predicate: (T) -> Boolean)
}
