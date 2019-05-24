package by.tryputs.bookssharing.config;

import by.tryputs.bookssharing.config.serializer.DateDeserializer;
import by.tryputs.bookssharing.config.serializer.DateSerializer;
import by.tryputs.bookssharing.config.serializer.DateTimeDeserializer;
import by.tryputs.bookssharing.config.serializer.DateTimeSerializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
public class JsonConfig {

    @Bean
    @Primary
    public Jackson2ObjectMapperBuilder objectMapperBuilder() {
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        builder.simpleDateFormat(DateSerializer.DATE_FORMAT);
        final SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(LocalDate.class, new DateSerializer());
        simpleModule.addSerializer(LocalDateTime.class, new DateTimeSerializer());
        simpleModule.addDeserializer(LocalDate.class, new DateDeserializer());
        simpleModule.addDeserializer(LocalDateTime.class, new DateTimeDeserializer());
        return builder.modulesToInstall(new JavaTimeModule(), simpleModule);
    }
}