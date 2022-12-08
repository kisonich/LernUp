package dz23Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "Book")
@Getter
@Setter
public class Book {
    @Id
    @Column(name = "bookid")
    private Integer bookid;
    private String namebook;
    private LocalDate year;
    private Integer pages;
    private Integer cost;

}
