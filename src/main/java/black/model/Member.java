package black.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public class Member {
    private int id;
    private String name;
    private String family;
    private int age;
}
