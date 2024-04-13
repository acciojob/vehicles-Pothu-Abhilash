package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned

        super(name, 0, 0, 0, isManual, null, 0);

    }

    public void accelerate(int rate) {
//        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate

        int newSpeed = getCurrentSpeed() + rate;


        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if (newSpeed == 0) {
            //Stop the car, set gear as 1

            changeGear(1);
            stop();
            setCurrentSpeed(newSpeed);

        } else if (newSpeed < 51) {
            changeGear(1);
            setCurrentSpeed(newSpeed);
        } else if (newSpeed < 101) {
            changeGear(2);
            setCurrentSpeed(newSpeed);
        } else if (newSpeed < 151) {
            changeGear(3);
            setCurrentSpeed(newSpeed);
        } else if (newSpeed < 201) {
            changeGear(4);
            setCurrentSpeed(newSpeed);
        } else if (newSpeed < 251) {
            changeGear(5);
            setCurrentSpeed(newSpeed);
        } else {
            changeGear(6);
            setCurrentSpeed(newSpeed);
        }


    }

}