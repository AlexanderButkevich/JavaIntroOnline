package by.epam.training_center.part2.beans.task2;

import java.util.Arrays;
import java.util.Objects;

/**
 * Aggregation and composition
 */
public class Automobile {
    private final String model;
    private final Engine engine;
    private final Wheel[] wheels;
    private final Tank tank;
    private int speed;

    public Automobile(String model, String engineType, String wheelsType, int tankCapacity) {
        this.model = model;
        this.engine = new Engine(engineType);
        this.wheels = new Wheel[WHEELS_NUMBER];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(wheelsType);
        }
        this.tank = new Tank(tankCapacity);
        this.speed = 0;
    }

    public void startEngine() {
        engine.start();
    }

    public void drive() {
        if (engine.started) {
            speed = MAX_SPEED;
        }
    }

    public void refuel() {
        tank.refuel();
    }

    public void changeWheel(int number, Wheel newWheel) {
        if (speed == 0 && number > 0 && number <= WHEELS_NUMBER && Objects.nonNull(newWheel)) {
            wheels[number-1] = newWheel;
        }
    }

    @Override
    public String toString() {
        return "Automobile\n" +
                "\tModel='" + model + '\'' + '\n' +
                '\t' + engine + '\n' +
                "\tWheels=" + Arrays.toString(wheels) + '\n' +
                '\t' + tank + '\n' +
                "\tSpeed=" + speed + '\n';
    }

    public class Engine {
        private final String type;
        private boolean started;

        public Engine(String type) {
            this.started = false;
            this.type = type;
        }

        public void start() {
            if (tank.notEmpty()) {
                started = true;
            }
        }

        public void stop() {
            started = false;
            speed = 0;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "type='" + type + '\'' +
                    '}';
        }
    }

    public static class Wheel {
        private final String type;

        public Wheel(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Wheel{" +
                    "type='" + type + '\'' +
                    '}';
        }
    }

    public class Tank {
        private final int capacity;
        private int fuel;

        public Tank() {
            this(DEFAULT_CAPACITY);
        }

        public Tank(int capacity) {
            this.capacity = capacity;
        }

        public void refuel() {
            if (speed == 0 && !engine.started) {
                fuel = capacity;
            }
        }

        public boolean notEmpty() {
            return fuel > 0;
        }

        @Override
        public String toString() {
            return "Tank{" +
                    "fuel=" + fuel +
                    '/' + capacity +
                    '}';
        }

        private static final int DEFAULT_CAPACITY = 120;
    }

    private static final int WHEELS_NUMBER = 4;
    private static final int MAX_SPEED = 220;
}
