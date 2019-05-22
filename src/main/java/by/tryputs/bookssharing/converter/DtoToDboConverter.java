package by.tryputs.bookssharing.converter;

public interface DtoToDboConverter<DTO, DBO> {

    DTO convertToDto(final DBO dbo);

    DBO convertToDbo(final DTO dto);
}

