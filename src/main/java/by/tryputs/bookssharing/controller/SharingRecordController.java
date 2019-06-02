package by.tryputs.bookssharing.controller;

import by.tryputs.bookssharing.dto.sharing.SharingRecordDto;
import by.tryputs.bookssharing.service.SharingRecordService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("api/sharingrecords")
public class SharingRecordController {

    private SharingRecordService service;

    @PostMapping("/add")
    public ResponseEntity<SharingRecordDto> add(@RequestBody Long cardId) {
        return ResponseEntity.status(HttpStatus.OK).body(service.post(cardId));
    }
}
