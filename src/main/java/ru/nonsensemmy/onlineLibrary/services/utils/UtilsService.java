package ru.nonsensemmy.onlineLibrary.services.utils;

import org.springframework.stereotype.Service;
import ru.nonsensemmy.onlineLibrary.domain.utils.BookFlag;
import ru.nonsensemmy.onlineLibrary.domain.utils.BookGenre;
import ru.nonsensemmy.onlineLibrary.domain.utils.BookPublishingHouse;

import java.util.Arrays;
import java.util.List;

@Service
public class UtilsService {

    public List<BookGenre> getGenres(){
        return Arrays.asList(BookGenre.values());
    }

    public List<BookFlag> getFlags(){
        return Arrays.asList(BookFlag.values());
    }

    public List<BookPublishingHouse> getPublishingHouses(){
        return Arrays.asList(BookPublishingHouse.values());
    }

}
