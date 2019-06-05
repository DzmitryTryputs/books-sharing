package by.tryputs.bookssharing.controller;

import by.tryputs.bookssharing.dto.sharing.SharingRecordDto;
import by.tryputs.bookssharing.service.SharingRecordService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/sharingrecords")
public class SharingRecordController {

    private SharingRecordService service;

    @PostMapping("/order")
    public ResponseEntity<SharingRecordDto> order(Long cardId) {
        return ResponseEntity.status(HttpStatus.OK).body(service.orderBook(cardId));
    }

    @PostMapping(value = "/return")
    public ResponseEntity back(Long cardId) {
        service.returnBook(cardId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
