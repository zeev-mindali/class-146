package com.jb.catsandtoys.clr;

import com.jb.catsandtoys.beans.Cat;
import com.jb.catsandtoys.beans.Owner;
import com.jb.catsandtoys.beans.Toy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
@Order(1)
public class Test implements CommandLineRunner {

    @Autowired
    private ApplicationContext ctx;

    @Autowired
    private List<Cat> cats;

    @Autowired
    private List<Owner> owners;

    @Autowired
    private List<Toy> toys;

    @Override
    public void run(String... args) throws Exception {
        //toy
        /*
        Toy toy1 = Toy.builder()
                .color("Red")
                .toyName("Ball")
                .hasSound(true)
                .build();

        Toy toy2 = new Toy("Duck","Yellow",true);
         */

        /*
        Toy toy1 = ctx.getBean(Toy.class);
        toy1.setToyName("Ball");
        toy1.setColor("Red");
        toy1.setHasSound(false);

        Toy toy2 = ctx.getBean(Toy.class);
        toy2.setToyName("Rubber Duck");
        toy2.setColor("Yellow");
        toy2.setHasSound(true);

        Toy toy3 = ctx.getBean(Toy.class);
        toy3.setToyName("Stick");
        toy3.setColor("Brown");
        toy3.setHasSound(false);

        Toy toy4 = ctx.getBean(Toy.class);
        toy4.setToyName("Mouse");
        toy4.setColor("Grey");
        toy4.setHasSound(true);

        Toy toy5 = ctx.getBean(Toy.class);
        toy5.setToyName("Fish");
        toy5.setColor("Golden");
        toy5.setHasSound(false);

        //cat
        Cat cat1 = ctx.getBean(Cat.class);
        cat1.setName("Pagosh");
        cat1.setColor("Silver");
        cat1.setFavoriteFood("Tuna");
        cat1.setAge(2);
        cat1.setWeight(4);
        cat1.setToys(List.of(toy1,toy2));
        cat1.setMale(true);

        Cat cat2 = ctx.getBean(Cat.class);
        cat2.setName("Bumper");
        cat2.setColor("Asphalt");
        cat2.setFavoriteFood("dry food");
        cat2.setAge(3);
        cat2.setWeight(2);
        cat2.setToys(List.of(toy3,toy5));
        cat2.setMale(false);

        Cat cat3 = ctx.getBean(Cat.class);
        cat3.setName("luna");
        cat3.setColor("skin");
        cat3.setFavoriteFood("tuna");
        cat3.setAge(5);
        cat3.setWeight(7);
        cat3.setToys(List.of(toy4));
        cat3.setMale(true);

        //owner
        Owner owner1 = ctx.getBean(Owner.class);
        owner1.setName("Tal");
        owner1.setAddress("Ramat Gan");
        owner1.setId();
        owner1.setCats(null);

        Owner owner2 = ctx.getBean(Owner.class);
        owner2.setName("Golan");
        owner2.setAddress("Ashkelon wanna be...");
        owner2.setCats(List.of(cat3));

        Owner owner3 = ctx.getBean(Owner.class);
        owner3.setName("Yoav (the one and only)");
        owner3.setAddress("Karney shomron");
        owner3.setCats(List.of(cat1,cat2));

        System.out.println("\n\n");
        System.out.println(owner3);
        */

        for (int counter = 0; counter <10 ; counter++) {
            toys.add(ctx.getBean(Toy.class));
        }

        for (int counter = 0; counter < 5; counter++) {
            Cat cat = ctx.getBean(Cat.class);
            for (int i = 0; i < (int)(Math.random()*3); i++) {
                //cat.setToys(List.of(toys.get((int)(Math.random()*toys.size()))));
                cat.addToy(toys.get((int)(Math.random()*toys.size())));
            }

            cats.add(cat);

        }

        for (int counter = 0; counter < 5; counter++) {
            Owner owner =ctx.getBean(Owner.class);
            owner.setCats(List.of(cats.get((int)(Math.random()*cats.size()))));
            owners.add(owner);
        }


        //forEach(System.out::println);
        System.out.println("--------------------------------------");
        //cats.forEach(System.out::println);
        System.out.println("--------------------------------------");
        owners.forEach(System.out::println);


    }
}
