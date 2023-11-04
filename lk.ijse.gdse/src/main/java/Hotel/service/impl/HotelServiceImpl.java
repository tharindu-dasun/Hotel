package Hotel.service.impl;

import Hotel.dto.HotelDTO;
import Hotel.repo.HotelRepo;
import Hotel.service.HotelService;
import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepo hotelRepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveHotel(HotelDTO dto) {
        hotelRepo.save(mapper.map(dto, Hotel.class));
    }

    @Override
    public void updateHotel(HotelDTO dto) {
        hotelRepo.save(mapper.map(dto, Hotel.class));
    }

    @Override
    public void deleteHotel(Long id) {
        hotelRepo.deleteById(id);
    }

    @Override
    public HotelDTO searchHotelById(String id) {
        return null;
    }

    @Override
    public List<HotelDTO> getAllHotelDetail() {
        return mapper.map(hotelRepo.findAll(), new TypeToken<List<HotelDTO>>() {}.getType());
    }
}
