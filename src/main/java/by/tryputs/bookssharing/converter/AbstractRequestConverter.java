package by.tryputs.bookssharing.converter;

import by.tryputs.bookssharing.dto.AbstractDto;
import by.tryputs.bookssharing.entity.IdentifiableEntity;

public interface AbstractRequestConverter<Dbo extends IdentifiableEntity, Dto extends AbstractDto> extends AbstractConverter<Dbo, Dto>{
}
