package ru.nonsensemmy.onlineLibrary.dto.book;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.nonsensemmy.onlineLibrary.domain.author.AuthorImpl;
import ru.nonsensemmy.onlineLibrary.domain.book.BookImpl;
import ru.nonsensemmy.onlineLibrary.domain.bookDescription.BookDescription;
import ru.nonsensemmy.onlineLibrary.domain.utils.BookGenre;

import java.util.List;

@Data
@NoArgsConstructor
public class BookResponse extends BookImpl {

    private List<AuthorImpl> authors;

    public BookResponse(Long id,
                        String title,
                        Long pageCount,
                        List<Long> authorIds,
                        List<BookGenre> genre,
                        BookDescription description,
                        String bookCoverImageName){
        super(id,title,pageCount, authorIds, genre,description,bookCoverImageName);
    }

    public BookResponse(Long id,
                        String title,
                        Long pageCount,
                        List<Long> authorIds,
                        List<BookGenre> genre,
                        BookDescription description,
                        String bookCoverImageName, List<AuthorImpl> authors){
        super(id,title,pageCount, authorIds, genre,description,bookCoverImageName);
        this.authors =authors;
    }
}
