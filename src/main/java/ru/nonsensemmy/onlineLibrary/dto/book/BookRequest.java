package ru.nonsensemmy.onlineLibrary.dto.book;

import lombok.Data;
import ru.nonsensemmy.onlineLibrary.domain.bookDescription.BookDescription;
import ru.nonsensemmy.onlineLibrary.domain.utils.BookGenre;

import java.util.List;

@Data
public class BookRequest {

    private Long id;
    private String title;
    private Long pageCount;
    private List<Long> authorIds;
    private List<BookGenre> genre;
    private BookDescription description;
    private String bookCoverImageName;
}
