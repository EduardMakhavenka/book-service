package ru.nonsensemmy.onlineLibrary.domain.author;

import lombok.Data;

@Data
public class AuthorImpl implements Author {

    private Long id;
    private String name;
    private String lastName;
    private String surname;
    private String bornYear;
    private String diedYear;

}
