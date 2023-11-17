package org.ss_course.cars;

public class GasolineEngineImpl implements Engine {
    @Override
    public void go(Car car) {
        System.out.println("Gasoline engine is started to go : " + car.getModel());
    }
}
