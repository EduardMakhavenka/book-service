package ru.nonsensemmy.onlineLibrary.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.nonsensemmy.onlineLibrary.domain.author.AuthorImpl;

import java.util.List;

@FeignClient("store-authors")
@RequestMapping("/author")
public interface AuthorRestClient {

    @RequestMapping(method = RequestMethod.POST, value = "/all-by-ids")
    List<AuthorImpl> getAuthors(List<Long> ids);
}
