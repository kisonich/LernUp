package dz24JPA;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "orderdetails")
@Getter
@Setter
public class OrderDetails {
    @Id
    private Integer orderdetailsid;
//    private Integer bookid;
    private Integer count;
    private Integer totalcost;
    @OneToOne
    @JoinColumn(name = "bookid", referencedColumnName = "bookid")
    private Book book;
    @ManyToOne
    @JoinColumn(name = "orderid")
    private Orders orders;

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderdetailsid=" + orderdetailsid +
                ", count=" + count +
                ", totalcost=" + totalcost +
                ", book=" + book + '}';
    }
}
