package dz26Transactional;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Warehousebook")
@Getter
@Setter
public class WarehouseBook {
    @Id
    private Integer warehousebookid;
    @ManyToOne
    @JoinColumn(name = "warehouseid")
    private Warehouse warehouse;
    @ManyToOne
    @JoinColumn(name = "bookid")
    private Book book;

    private Integer amount;

    @Override
    public String toString() {
        return "WarehouseBook{" +
                "warehousebookid=" + warehousebookid +
                ", book=" + book +
                '}';
    }
}
