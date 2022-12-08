package dz23Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetails")
@Getter
@Setter
public class OrderDetails {
    @Id
    private Integer orderdetailsid;
    private Integer orderid;
    private Integer bookid;
    private Integer count;
    private Integer totalcost;
    @OneToOne
    private Book book;
}
