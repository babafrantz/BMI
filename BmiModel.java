package com.Application.BMI;

import java.time.LocalDate;
import java.time.LocalTime;

public class BmiModel {

    private float weight;
    private float height;

    public BmiModel(long weight, long height) {
        this.weight = weight;
        this.height = height;
    }

    public BmiModel() {
        this.weight = weight;
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "BmiModel{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    public float Bmi(){
        return (getWeight())/(getHeight()*getHeight());
    }



    public String male_interpretation(float bmi){

        if (bmi < 18.5)
            return "You are underweight and need to see a physician, buddy!";
        else if ( bmi > 18.5  && bmi < 25)
            return " Congratulations you escaped being obese, Yay!";
        else if ( bmi > 25 && bmi < 29.9)
            return"You are Overweight mate!";
        else if(bmi >29.9)
            return "You are Obese my friend. You will benefit from regular exercises and dieting. We reckon you need to visit a physician for further information.";
        else
            return "invalid input";


    }

    public static LocalTime time(){

        LocalTime myObj2 = LocalTime.now();


        return myObj2;
    }

    public static LocalDate date(){
        LocalDate myObj = LocalDate.now();
        return myObj;
    }

}






