package dz23Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Author")
@Getter
@Setter
public class Author {
    @Id
    private Integer id;
    private String fio;
}
