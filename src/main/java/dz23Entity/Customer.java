package dz23Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
@Getter
@Setter
public class Customer {
    @Id
    private Integer customerId;
    private String fio;
    private Integer age;
}
