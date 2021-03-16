package ru.nonsensemmy.onlineLibrary.services.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nonsensemmy.onlineLibrary.clients.AuthorRestClient;
import ru.nonsensemmy.onlineLibrary.domain.author.AuthorImpl;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    private AuthorRestClient authorClient;

    @Override
    public List<AuthorImpl> findAuthors(List<Long> authorIds) {
        return authorClient.getAuthors(authorIds);
    }
}
