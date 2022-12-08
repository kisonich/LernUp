package dz23Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WarehouseBook")
@Getter
@Setter
public class WarehouseBook {
    @Id
    private Integer warehousebookid;
    private Integer warehouseid;
    private Integer bookid;
}
