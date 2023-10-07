import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Test
    public void bookServiceTestEquals() {
        Book book = new Book("1", "Book1", "Author1");

        // создаем instance class --> bookRepositoryMock, который содержит метод findById()
        BookRepository bookRepositoryMock = mock(BookRepository.class);
        // прописываем поведение bookRepositoryMock, от которого ожидаем любое строковое значение ID книги
        // и сравниваем его с экземпляром класса book
        when(bookRepositoryMock.findById(anyString())).thenReturn(book);

        BookService bookService = new BookService(bookRepositoryMock);

        assertEquals(bookService.findBookById("1"), book);
    }
    @Test
    public void bookServiceTest() {
        Book book = new Book("2", "Book2", "Author2");
        BookRepository bookRepositoryMock = mock(BookRepository.class);

        // прописываем поведение bookRepositoryMock, от которого ожидаем
        // строковое значение ID книги и сравниваем его с экземпляром класса book
        when(bookRepositoryMock.findById("1")).thenReturn(book);

        BookService bookService = new BookService(bookRepositoryMock);

        assertThat(bookService.findBookById("1")).isEqualTo(book);
    }

    @Test
    public void bookServiceTestAllFind() {
        Book book1 = new Book("2", "Book2", "Author2");
        InMemoryBookRepository InMemimport = null;
        //InMemoryBookRepository inMemoryBookRepositoryMock = mock(InMemimport org.junit.jupiter.api.Test;
    }
}