package dz29REST.model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Data
@Entity
@Table(name = "Userr")
@Getter
@Setter
public class Userr {
    @Id
    @Column(name = "id")
    private int id;
    private String fio;
    private String email;
}
