package by.tryputs.bookssharing.service;

import by.tryputs.bookssharing.converter.AbstractConverter;
import by.tryputs.bookssharing.dto.user.AbstractDto;
import by.tryputs.bookssharing.entity.IdentifiableEntity;
import by.tryputs.bookssharing.repository.AbstractRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
public abstract class AbstractService<Dbo extends IdentifiableEntity, Dto extends AbstractDto, Rep extends AbstractRepository<Dbo, Long>, Con extends AbstractConverter<Dbo, Dto>> {

    private Rep repository;
    private Con converter;

    @Transactional
    public Dto post(final Dto dto) {
        return converter.convertToDto(repository.save(converter.convertToDbo(dto)));
    }

    @Transactional
    public Dto get(final Long id) {
        return converter.convertToDto(repository.getOne(id));
    }

    @Transactional
    public void delete(final Long id) {
        repository.deleteById(id);
    }

    @Transactional
    public List<Dto> findAll() {
        return converter.convertToDto(repository.findAll());
    }
}