package guitarshop.repository;

import guitarshop.model.Guitar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface GuitarRepository extends JpaRepository<Guitar, Long> {
    List<Guitar> findByType(String type);
}
