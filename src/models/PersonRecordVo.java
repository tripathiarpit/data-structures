package models;

import java.util.Optional;

public record PersonRecordVo(String name, int age) {

    private static final Optional<String> NAME= "person";
}
