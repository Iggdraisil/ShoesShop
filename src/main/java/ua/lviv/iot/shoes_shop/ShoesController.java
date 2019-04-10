package ua.lviv.iot.shoes_shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.shoes_shop.shoes.Shoes;

import java.util.List;


@RestController
public class ShoesController {

    @Autowired
    private ShoesRepository shoesRepository;

    @RequestMapping(value = "/shoes", method = RequestMethod.GET)
    public List<Shoes> getShoes() {
        return (List<Shoes>) shoesRepository.findAll();
    }

    @RequestMapping(value = "/shoes/{id}", method = RequestMethod.GET)
    public Shoes getShoe(@PathVariable final Integer id) {
        return shoesRepository.findById(id).get();
    }

    @RequestMapping(value = "/shoes", method = RequestMethod.POST)
    public void postShoe(@RequestBody final Shoes shoe) {
        shoesRepository.save(shoe);
    }

    @RequestMapping(value = "/shoes/{id}", method = RequestMethod.PUT)
    public Shoes updateShoe(@RequestBody final Shoes shoe,
                            @PathVariable final Integer id) {
        return shoesRepository.findById(id).map(oldShoe ->
                shoesRepository.save(oldShoe = new Shoes(shoe, id))).orElseThrow();
    }

    @RequestMapping(value = "/shoes/{id}", method = RequestMethod.DELETE)
    public Shoes deleteShoe(@PathVariable final Integer id) {
        Shoes shoe = shoesRepository.findById(id).get();
        shoesRepository.deleteById(id);
        return shoe;
    }
}
