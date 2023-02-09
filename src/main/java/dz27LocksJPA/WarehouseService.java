package dz27LocksJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class WarehouseService {

    @Autowired
    private WarehouseRepository warehouseRepository;

    @Transactional
    public void testContext() {
        Warehouse byAddress = warehouseRepository.findByAddress(" 1 street");
        byAddress.setAddress(" 2 Street");
        warehouseRepository.save(byAddress);
    }

    @Transactional
    public void testContextSlow() {

        Warehouse byAddress = warehouseRepository.findByAddress(" 1 street");
        byAddress.setAddress(" 50 Street!!!");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        warehouseRepository.save(byAddress);
    }
}
