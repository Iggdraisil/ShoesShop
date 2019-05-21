package ua.lviv.iot.shoes_shop;


import org.springframework.data.repository.CrudRepository;
import ua.lviv.iot.shoes_shop.shoes.Shoes;


public interface ShoesRepository
    extends CrudRepository<Shoes, Integer> {

}
