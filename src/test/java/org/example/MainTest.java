package org.example;

import hibernate_test.model.Worker;
import org.junit.Test;

import javax.persistence.OptimisticLockException;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkReflectionApi() {
        Worker worker = new Worker(
                "Ivan@gmail.com",
                "Ivan",
                "Sidaorov",
                22);
        String sql = """
                insert
                into
                %s
                (%s)
                values
                (%s)
                """;

//        Optional.ofNullable(worker.getClass().getAnnotation(Table.class))
//                .map(table -> )
    }

}