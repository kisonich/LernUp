package dz26Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private WarehouseRepository warehouseRepository;
    @Autowired
    private WarehouseBookRepository warehouseBookRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderDetailsRepository orderDetailsRepository;
    @Transactional
    public void makeOrder(int bookId, String fio, int warehouseId) {
        boolean isOrderCreated = false;
        Warehouse warehouse = warehouseRepository.findById(warehouseId).get();
        for (WarehouseBook warehouseBook : warehouse.getBooks()) {
            Book book = warehouseBook.getBook();
            if (bookId == book.getBookid() && warehouseBook.getAmount() > 0) {
                warehouseBook.setAmount(warehouseBook.getAmount() - 1);
                warehouseBookRepository.save(warehouseBook);

                Orders orders = new Orders();
                orders.setFio(fio);
                orders.setPurchaseamount(book.getCost());

                OrderDetails orderDetails = new OrderDetails();
                orderDetails.setOrders(orders);
                orderDetails.setBook(book);
                orderDetails.setCount(1);
                orderDetails.setTotalcost(book.getCost());

//                if (true) {
//                    throw new RuntimeException(" ");
//                }

                orders.setOrderDetailsList(List.of(orderDetails));
                orderRepository.save(orders);

                orderDetailsRepository.save(orderDetails);

                isOrderCreated = true;
            }
        }
        if (!isOrderCreated) {
            throw new RuntimeException("Такой книги на складе нет");
        }



    }
}
