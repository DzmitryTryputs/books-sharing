package by.tryputs.bookssharing.controller;

import by.tryputs.bookssharing.dto.sharing.SharingCardRequestDto;
import by.tryputs.bookssharing.service.SharingCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sharingcards")
public class SharingCardController extends AbstractController<SharingCardRequestDto, SharingCardService> {

    @Autowired
    public SharingCardController(SharingCardService service) {
        super(service);
    }

}
