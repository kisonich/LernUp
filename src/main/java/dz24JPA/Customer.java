package dz24JPA;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "Customer")
@Getter
@Setter
public class Customer {
    @Id
    private Integer customerid;
    private String fio;
    private LocalDate age;

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerid +
                ", fio='" + fio + '\'' +
                ", age=" + age +
                '}';
    }
}
