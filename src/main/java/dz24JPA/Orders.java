package dz24JPA;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Orders")
@Getter
@Setter
public class Orders {
    @Id
    private Integer orderid;
    private String fio;
    private Integer purchaseamount;
    @OneToMany(mappedBy = "orders", fetch = FetchType.EAGER)
    private List<OrderDetails> orderDetailsList;

    @Override
    public String toString() {
        return "Order{" +
                "orderid=" + orderid +
                ", fio='" + fio + '\'' +
                ", purchaseamount=" + purchaseamount +
                ", orderDetailsList=" + orderDetailsList +
                '}';
    }
}
