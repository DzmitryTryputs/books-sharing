package by.tryputs.bookssharing.controller;

import by.tryputs.bookssharing.dto.user.AbstractDto;
import by.tryputs.bookssharing.service.AbstractService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class AbstractController<Dto extends AbstractDto, V extends AbstractService> {

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
    ResponseEntity add(Dto dto) {
        return ResponseEntity.status(HttpStatus.OK).body(service.post(dto));
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity delete(@PathVariable("id") Long id) {
        service.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}