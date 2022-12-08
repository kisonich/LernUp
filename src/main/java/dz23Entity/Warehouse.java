package dz23Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "warehouse")
@Getter
@Setter
public class Warehouse {
    @Id
    private Integer warehouseid;
    private String address;
    @ManyToMany
    private List<Book> books;
}
