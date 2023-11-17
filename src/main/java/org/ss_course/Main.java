package org.ss_course;

import org.ss_course.animals.Animal;
import org.ss_course.animals.Cat;
import org.ss_course.animals.Dog;
import org.ss_course.cars.Car;
import org.ss_course.cars.DieselEngineImpl;
import org.ss_course.cars.Engine;
import org.ss_course.cars.GasolineEngineImpl;

public class Main {
    public static void main(String[] args) {


//        User javidan = new User();
//        javidan.setName("Azer");
//        javidan.setSureName("Hajiyev");
//        javidan.setAge(24);
//
//
//        System.out.println(javidan.getName());
//        System.out.println(javidan.getSureName());
//        System.out.println(javidan.getAge());


//        Animal dog = new Dog();
//        dog.setName("Sharik");
//        dog.setAge(2);
//
//        Animal cat = new Cat();
//        cat.setName("Murzik");
//        cat.setAge(1);
//
//
//        dog.saySomething();
////        System.out.println(dog.getName());
////        System.out.println(dog.getAge());
//        dog.getInformation();
//
//        cat.saySomething();
//        System.out.println(cat.getName());
//        System.out.println(cat.getAge());

        Car mercedes = new Car();
        mercedes.setModel("Mercedes E 200");
        mercedes.setEngineType("gasoline");
        mercedes.setYear(2001);

        Car kia = new Car();
        kia.setModel("Sorento");
        kia.setEngineType("diesel");
        kia.setYear(2005);

        go(mercedes);
        go(kia);


    }

    public static void go(Car car) {
        Engine engine;
        if (car.getEngineType().equals("gasoline")) {
            engine = new GasolineEngineImpl();
            engine.go(car);
        } else if (car.getEngineType().equals("diesel")) {
            engine = new DieselEngineImpl();
            engine.go(car);
        } else {
            System.out.println("engine type not found!");
        }
    }
}
