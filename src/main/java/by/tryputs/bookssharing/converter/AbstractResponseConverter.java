package by.tryputs.bookssharing.converter;

import by.tryputs.bookssharing.dto.AbstractResponseDto;
import by.tryputs.bookssharing.entity.IdentifiableEntity;

public interface AbstractResponseConverter<Dbo extends IdentifiableEntity, Dto extends AbstractResponseDto> extends AbstractConverter<Dbo, Dto> {
}
