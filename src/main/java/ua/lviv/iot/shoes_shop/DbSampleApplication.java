package ua.lviv.iot.shoes_shop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.lviv.iot.shoes_shop.shoes.Material;
import ua.lviv.iot.shoes_shop.shoes.Role;
import ua.lviv.iot.shoes_shop.shoes.Seasons;
import ua.lviv.iot.shoes_shop.shoes.Shoes;

@SpringBootApplication
public class DbSampleApplication {

    public static void main(final String[] args) {
        SpringApplication.run(DbSampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(final ShoesRepository repository) {
        return (args) -> {
            repository.save(new Shoes(42, "Blue", Material.LEATHER,
                    5000, Seasons.SUMMER, Role.MEN, "LaCosta"));
            repository.save(new Shoes(46, "Black", Material.SHMIT,
                    500, Seasons.SUMMER, Role.WOMEN, "Abibas"));
            repository.save(new Shoes(23, "White", Material.LEATHER,
                    4000, Seasons.SUMMER, Role.CHILD, "Antoshka"));
            repository.save(new Shoes(39, "Purple", Material.DERAMANTINE,
                    3000, Seasons.DEMISEASON, Role.SPORT, "Nike"));
            repository.findAll().forEach(System.out::println);
        };
    }
}
