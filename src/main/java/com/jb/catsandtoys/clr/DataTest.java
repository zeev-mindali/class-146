package com.jb.catsandtoys.clr;

import com.jb.catsandtoys.data_beans.Toy;
import com.jb.catsandtoys.repo.ToyRepository;
import com.jb.catsandtoys.util.TablePrinter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
@Order(2)
public class DataTest implements CommandLineRunner {
    final ToyRepository toyRepository;
    final ApplicationContext ctx;

    @Override
    public void run(String... args) throws Exception {

        Toy toy1 = new Toy();
        toy1.setToyName("Ball");
        toy1.setColor("Red");
        toy1.setHasSound(false);
        toy1.setManufacturer("Yoav");

        Toy toy2 = new Toy();
        toy2.setToyName("Rubber Duck");
        toy2.setColor("Yellow");
        toy2.setHasSound(true);
        toy2.setManufacturer("Yoav");

        Toy toy3 = new Toy();
        toy3.setToyName("Stick");
        toy3.setColor("Brown");
        toy3.setHasSound(false);
        toy3.setManufacturer("Golan");

        Toy toy4 = new Toy();
        toy4.setToyName("Mouse");
        toy4.setColor("Grey");
        toy4.setHasSound(true);
        toy4.setManufacturer("Yoav");

        Toy toy5 = new Toy();
        toy5.setToyName("Fish");
        toy5.setColor("Golden");
        toy5.setHasSound(false);
        toy5.setManufacturer("Omer");


        //C R UD - Create Read Update Delete

        //create
        //toyRepository.save(toy1);
        //toyRepository.saveAll(List.of(toy2,toy3,toy4,toy5));

        //read
        List<Toy> toyList = toyRepository.findAll();
        TablePrinter.print(toyList);

        //update
        Optional<Toy> changeToy = toyRepository.findById(5);
        if (changeToy.isPresent()) {
            changeToy.get().setManufacturer("Geri");
            toyRepository.save(changeToy.get());
        }

        //delete
        toyRepository.deleteById(5); //delete number 5
        //toy3 = toyRepository.findById(3).get();
        toyRepository.delete(toy3);  //delete number 3


        //read
        List<Toy> newToyList = toyRepository.findAll();
        TablePrinter.print(newToyList);
    }
}
