package Hotel.service;

import Hotel.dto.PurchaseHotelDTO;
import lk.ijse.gdse.Hotel.dto.PurchaseHotelDTO;

import java.util.List;

public interface PurchaseHotelService {
    void savePurchaseHotel(PurchaseHotelDTO dto);
    void updatePurchaseHotel(PurchaseHotelDTO dto);
    void deletePurchaseHotel(Long id);
    PurchaseHotelDTO searchPurchaseHotelById(String id);
    List<PurchaseHotelDTO> getAllPurchaseHotelDetail();
}
