package com.kodilla.inheritance.homework;

    public class Linux extends OperatingSystem {

        public Linux(int editionYear) {
            super(editionYear);
        }

        @Override
        public void turnOn() {
            System.out.println("System operacyjny Linux : " + "wydany w : " + this.editionYear + " turned on");
        }

        @Override
        public void turnOff() {
            System.out.println("System operacyjny Linux : " + "wydany w : " + this.editionYear + " turned on");

        }
    }
