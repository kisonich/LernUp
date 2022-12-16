package dz26Transactional;

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
    @GeneratedValue(generator = "ordersSeq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ordersSeq", sequenceName = "ordersSequence", initialValue = 1, allocationSize = 20)
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
