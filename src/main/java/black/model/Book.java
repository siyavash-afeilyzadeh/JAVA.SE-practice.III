package black.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public class Book {
    private int id;
    private String name;
    private String author;
    private int pages;
}
