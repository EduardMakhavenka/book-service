package ru.nonsensemmy.onlineLibrary.services.book;

import ru.nonsensemmy.onlineLibrary.dto.book.BookRequest;
import ru.nonsensemmy.onlineLibrary.dto.book.BookResponse;

import java.util.List;

public interface BookService {

    List<BookResponse> findTenBooksFromId(Long id);
    List<BookResponse> findTwentyBooksFromId(Long id);
    List<BookResponse> findFiftyBooksFromId(Long id);
    List<BookResponse> findAll();
    BookResponse findById(Long id);
    BookResponse save(BookRequest book);
    BookResponse update(BookRequest book);
    void delete(Long id);
}
