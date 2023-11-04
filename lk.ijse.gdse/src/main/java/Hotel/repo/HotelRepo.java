package Hotel.repo;

import lk.ijse.gdse.Hotel.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;



public interface HotelRepo extends JpaRepository<Hotel,Long> {
}
