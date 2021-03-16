package ru.nonsensemmy.onlineLibrary.services.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nonsensemmy.onlineLibrary.domain.author.AuthorImpl;
import ru.nonsensemmy.onlineLibrary.domain.book.BookImpl;
import ru.nonsensemmy.onlineLibrary.dto.book.BookRequest;
import ru.nonsensemmy.onlineLibrary.dto.book.BookResponse;
import ru.nonsensemmy.onlineLibrary.repository.BookRepo;
import ru.nonsensemmy.onlineLibrary.services.author.AuthorService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private AuthorService authorService;

    @Override
    public List<BookResponse> findTenBooksFromId(Long id) {
        return toBookResponseList(bookRepo.findTenById(id));
    }

    @Override
    public List<BookResponse> findTwentyBooksFromId(Long id) {
        return toBookResponseList(bookRepo.findTwentyById(id));
    }

    @Override
    public List<BookResponse> findFiftyBooksFromId(Long id) {
        return toBookResponseList(bookRepo.findFiftyById(id));
    }

    @Override
    public List<BookResponse> findAll(){ return toBookResponseList(bookRepo.findAll()); }

    @Override
    public BookResponse findById(Long id) {
        return toBookResponse(bookRepo.getOne(id));
    }

    @Override
    public BookResponse save(BookRequest book) {
        BookImpl savedBook = bookRepo.save(toBookImpl(book));
        return toBookResponse(savedBook);
    }

    @Override
    public BookResponse update(BookRequest book) {
        BookImpl updatedBook = bookRepo.save(toBookImpl(book));
        return toBookResponse(updatedBook);
    }

    @Override
    public void delete(Long id) {
        bookRepo.deleteById(id);
    }

    private List<BookResponse> toBookResponseList(List<BookImpl> list){
        return list
                .stream()
                .map(this::toBookResponse)
                .collect(Collectors.toList());
    }

    private BookResponse toBookResponse(BookImpl book){
        return new BookResponse(
                book.getId(),
                book.getTitle(),
                book.getPageCount(),
                book.getAuthorIds(),
                book.getGenre(),
                book.getDescription(),
                book.getBookCoverImageName(),
                addAuthors(book.getAuthorIds())
        );
    }
    private BookImpl toBookImpl(BookRequest book){
        return new BookImpl(
                book.getId(),
                book.getTitle(),
                book.getPageCount(),
                book.getAuthorIds(),
                book.getGenre(),
                book.getDescription(),
                book.getBookCoverImageName());
    }

    private List<AuthorImpl> addAuthors(List<Long> authorIds){ return authorService.findAuthors(authorIds); }
}
