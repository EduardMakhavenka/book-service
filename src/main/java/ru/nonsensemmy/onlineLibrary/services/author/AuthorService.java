package ru.nonsensemmy.onlineLibrary.services.author;

import ru.nonsensemmy.onlineLibrary.domain.author.AuthorImpl;

import java.util.List;

public interface AuthorService {
    List<AuthorImpl> findAuthors(List<Long> authorIds);
}
