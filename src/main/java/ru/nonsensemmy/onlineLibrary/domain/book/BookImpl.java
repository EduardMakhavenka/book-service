package ru.nonsensemmy.onlineLibrary.domain.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.nonsensemmy.onlineLibrary.domain.bookDescription.BookDescription;
import ru.nonsensemmy.onlineLibrary.domain.utils.BookGenre;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "books")
@NoArgsConstructor
@AllArgsConstructor
public class BookImpl implements  Book{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String title;
    private Long pageCount;

    @ElementCollection
    private List<Long> authorIds;

    @Column
    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = BookGenre.class)
    private List<BookGenre> genre;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "description_id", referencedColumnName = "id")
    private BookDescription description;
    private String bookCoverImageName;

}
