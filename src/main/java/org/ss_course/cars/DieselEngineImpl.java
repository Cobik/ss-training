package org.ss_course.cars;

public class DieselEngineImpl implements Engine {
    @Override
    public void go(Car car) {
        System.out.println("Diesel engine is started to go : " + car.getModel());
    }
}
