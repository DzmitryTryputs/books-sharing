package by.tryputs.bookssharing.service;

import by.tryputs.bookssharing.converter.AbstractRequestConverter;
import by.tryputs.bookssharing.converter.AbstractResponseConverter;
import by.tryputs.bookssharing.dto.AbstractDto;
import by.tryputs.bookssharing.dto.AbstractResponseDto;
import by.tryputs.bookssharing.entity.IdentifiableEntity;
import by.tryputs.bookssharing.repository.AbstractRepository;
import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
public abstract class AbstractService<Dbo extends IdentifiableEntity, RequestDto extends AbstractDto, ResponseDto extends AbstractResponseDto,
        Rep extends AbstractRepository<Dbo, Long>, ReqCon extends AbstractRequestConverter<Dbo, RequestDto>, ResCon extends AbstractResponseConverter<Dbo, ResponseDto>> {

    private Rep repository;
    private ReqCon reqCon;
    private ResCon resCon;

    @Transactional
    public ResponseDto post(final RequestDto dto) {
        return resCon.convertToDto(repository.save(reqCon.convertToDbo(dto)));
    }

    @Transactional
    public ResponseDto get(final Long id) {
        return resCon.convertToDto(repository.getOne(id));
    }

    @Transactional
    public void delete(final Long id) {
        repository.deleteById(id);
    }

    @Transactional
    public List<ResponseDto> findAll() {
        return resCon.convertToDto(repository.findAll());
    }
}