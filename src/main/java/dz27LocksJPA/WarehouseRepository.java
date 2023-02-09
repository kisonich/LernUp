package dz27LocksJPA;

import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;
import java.util.Optional;

@Repository
public interface WarehouseRepository extends CrudRepository <Warehouse, Integer> {

    @Lock(LockModeType.OPTIMISTIC)
    Warehouse findByAddress(String address);
}
