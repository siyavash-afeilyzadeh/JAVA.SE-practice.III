package black.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@SuperBuilder
public class Borrow {
    private int id;
    private Book book;
    private Member member;

    @Builder.Default
    private LocalDate borrowDate = LocalDate.now();

    private LocalDate returnDate;
}
