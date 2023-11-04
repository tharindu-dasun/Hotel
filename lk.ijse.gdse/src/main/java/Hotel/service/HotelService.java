package Hotel.service;

import Hotel.dto.HotelDTO;


import java.util.List;



public interface HotelService {
    void saveHotel(HotelDTO dto);
    void updateHotel(HotelDTO dto);
    void deleteHotel(Long id);
    HotelDTO searchHotelById(String id);
    List<HotelDTO> getAllHotelDetail();
}
