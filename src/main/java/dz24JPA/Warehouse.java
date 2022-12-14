package dz24JPA;

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
    @OneToMany(mappedBy = "warehouse", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<WarehouseBook> books;

    @Override
    public String toString() {
        return "Warehouse{" +
                "warehouseid=" + warehouseid +
                ", address='" + address + '\'' +
                ", books=" + books +
                '}';
    }
}
