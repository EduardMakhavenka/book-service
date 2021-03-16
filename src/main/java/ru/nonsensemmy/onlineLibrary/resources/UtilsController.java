package ru.nonsensemmy.onlineLibrary.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nonsensemmy.onlineLibrary.domain.utils.BookFlag;
import ru.nonsensemmy.onlineLibrary.domain.utils.BookGenre;
import ru.nonsensemmy.onlineLibrary.domain.utils.BookPublishingHouse;
import ru.nonsensemmy.onlineLibrary.services.utils.UtilsService;

import java.util.List;

@RestController
@RequestMapping("/utils")
public class UtilsController {

    @Autowired
    private UtilsService utilsService;

    @GetMapping("/genre")
    public List<BookGenre> getGenres(){
        return utilsService.getGenres();
    }

    @GetMapping("/flag")
    public List<BookFlag> getFlags(){
        return utilsService.getFlags();
    }

    @GetMapping("/publishingHouses")
    public List<BookPublishingHouse> getPublishingHouses(){
        return utilsService.getPublishingHouses();
    }

}
