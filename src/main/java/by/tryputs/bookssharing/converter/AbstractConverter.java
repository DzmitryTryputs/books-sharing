package by.tryputs.bookssharing.converter;

import by.tryputs.bookssharing.entity.IdentifiableEntity;
import org.springframework.beans.BeanUtils;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public interface AbstractConverter<Dbo extends IdentifiableEntity, Dto> {

    default Dto convertToDto(final Dbo dbo) {
        if (dbo == null) return null;

        final Dto dto = constructDto();

        BeanUtils.copyProperties(dbo, dto);

        convertComplexFieldsForDto(dbo, dto);
        return dto;
    }

    default Dbo convertToDbo(final Dto dto) {
        if (dto == null) return null;

        final Dbo dbo = constructDbo();

        BeanUtils.copyProperties(dto, dbo);

        convertComplexFieldsForDbo(dto, dbo);
        return dbo;
    }

    default <CollectionType extends Collection<Dbo>>
    CollectionType convertToDbo(final Collection<Dto> collection, final Collector<Dbo, ?, CollectionType> collector) {
        return collection.stream().map(this::convertToDbo).collect(collector);
    }

    default List<Dbo> convertToDbo(final Collection<Dto> collection) {
        return convertToDbo(collection, Collectors.toList());
    }

    default <CollectionType extends Collection<Dto>>
    CollectionType convertToDto(final Collection<Dbo> collection, final Collector<Dto, ?, CollectionType> collector) {
        return collection.stream().map(this::convertToDto).collect(collector);
    }

    default List<Dto> convertToDto(final Collection<Dbo> collection) {
        return convertToDto(collection, Collectors.toList());
    }

    Dto constructDto();

    Dbo constructDbo();

    default void convertComplexFieldsForDto(final Dbo sourceDbo, final Dto targetDto) {
    }

    default void convertComplexFieldsForDbo(final Dto sourceDto, final Dbo targetDbo) {
    }
}