package by.tryputs.bookssharing.converter;

import by.tryputs.bookssharing.dto.AbstractRequestDto;
import by.tryputs.bookssharing.entity.IdentifiableEntity;

public interface AbstractRequestConverter<Dbo extends IdentifiableEntity, Dto extends AbstractRequestDto> extends AbstractConverter<Dbo, Dto>{
}
