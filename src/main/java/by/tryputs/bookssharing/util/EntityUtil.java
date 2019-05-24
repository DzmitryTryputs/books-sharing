package by.tryputs.bookssharing.util;

import by.tryputs.bookssharing.entity.IdentifiableEntity;
import org.springframework.stereotype.Component;

@Component
public class EntityUtil {

    public <T extends IdentifiableEntity> T createEmptyWithId(T t, Long id) {
        t.setId(id);
        return t;
    }
}
