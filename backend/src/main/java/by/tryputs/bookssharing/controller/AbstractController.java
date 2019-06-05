package by.tryputs.bookssharing.controller;

import by.tryputs.bookssharing.dto.AbstractRequestDto;
import by.tryputs.bookssharing.service.AbstractService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class AbstractController<ReqDto extends AbstractRequestDto, V extends AbstractService> {

    private V service;

    protected AbstractController(V service) {
        this.service = service;
    }

    @GetMapping("/list")
    ResponseEntity getList() {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @GetMapping("/{id}")
    ResponseEntity getById(@PathVariable("id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.get(id));
    }

    @PostMapping("/add")
    ResponseEntity add(@RequestBody ReqDto dto) {
        return ResponseEntity.status(HttpStatus.OK).body(service.post(dto));
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity delete(@PathVariable("id") Long id) {
        service.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}