package dz26Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseBookRepository extends CrudRepository<WarehouseBook, Integer> {
}
