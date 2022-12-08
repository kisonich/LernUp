package dz23Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Order")
@Getter
@Setter
public class Order {
    @Id
    private Integer orderid;
    private String fio;
    private Integer purchaseamount;
    @OneToMany
    private List<OrderDetails> orderDetailsList;
}
