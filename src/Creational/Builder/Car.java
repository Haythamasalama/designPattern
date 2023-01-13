package Creational.Builder;

public class Car {
    private final String maker;
    private final String model;
    private final int year;
    private final String color;
    private final boolean isAutomatic;

    Car(String maker, String model, int year, String color, boolean isAutomatic) {
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isAutomatic = isAutomatic;
    }

    public static class Builder {
        private String maker;
        private String model;
        private int year;
        private String color;
        private boolean isAutomatic;

        public Builder setMaker(String maker) {
            this.maker = maker;

            return this;
        }

        public Builder setModel(String model) {
            this.model = model;

            return this;
        }

        public Builder setYear(int year) {
            this.year = year;

            return this;
        }

        public Builder setColor(String color) {
            this.color = color;

            return this;
        }

        public Builder setAutomatic(boolean isAutomatic) {
            this.isAutomatic = isAutomatic;

            return this;
        }

        public Car build() {
            return new Car(maker, model, year, color, isAutomatic);
        }
    }
}
