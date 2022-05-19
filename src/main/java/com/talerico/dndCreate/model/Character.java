package com.talerico.dndCreate.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data
public class Character {

    @Id
    String id;

    String name;
    Alignment alignment;

    public Character(String name, Alignment alignment) {
        this.name = name;
        this.alignment = alignment;
    }
}
