package ru.nonsensemmy.onlineLibrary.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.nonsensemmy.onlineLibrary.domain.book.Book;
import ru.nonsensemmy.onlineLibrary.dto.book.BookRequest;
import ru.nonsensemmy.onlineLibrary.dto.book.BookResponse;
import ru.nonsensemmy.onlineLibrary.services.book.BookService;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookControllerImpl{

    @Autowired
    private BookService bookService;

    @GetMapping("/{id}")
    public Book findById(@PathVariable Long id) {
        return bookService.findById(id);
    }

    @GetMapping
    public List<BookResponse> findAll(){
        return bookService.findAll();
    }

    @GetMapping("/ten/{id}")
    public List<BookResponse> findTenBooksById(@PathVariable Long id){
        return bookService.findTenBooksFromId(id);
    }

    @GetMapping("/Twenty/{id}")
    public List<BookResponse> findTwentyBooksById(@PathVariable Long id){
        return bookService.findTwentyBooksFromId(id);
    }

    @GetMapping("/Fifty/{id}")
    public List<BookResponse> findFiftyBooksById(@PathVariable Long id){
        return bookService.findFiftyBooksFromId(id);
    }

    @PostMapping
    public BookResponse save(@RequestBody BookRequest bookRequest){
        BookResponse bookResponse = bookService.save(bookRequest);
        return bookResponse;
    }

    @PutMapping
    public BookResponse update(@RequestBody BookRequest bookRequest){
        return bookService.update(bookRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        bookService.delete(id);
    }


}
