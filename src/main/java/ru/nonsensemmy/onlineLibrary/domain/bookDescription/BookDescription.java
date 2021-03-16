package ru.nonsensemmy.onlineLibrary.domain.bookDescription;

import lombok.Data;
import ru.nonsensemmy.onlineLibrary.domain.utils.BookFlag;
import ru.nonsensemmy.onlineLibrary.domain.utils.BookPublishingHouse;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "bookDescription")
public class BookDescription{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private BookFlag flag;

    @Column
    @Enumerated(EnumType.STRING)
    private BookPublishingHouse publishingHouse;
    private String yearOfPublishing;

    @ElementCollection
    private List<String> namesPagesImages;

    private String textDescription;

}
