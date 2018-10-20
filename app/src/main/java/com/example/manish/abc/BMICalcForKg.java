package com.example.manish.abc;

public class BMICalcForKg implements IBMICalc{
    public static float minHeight = 0.5f;
    public static float maxHeight = 2.5f;
    public static float minMass = 10f;
    public static float maxMass = 200f;

    @Override
    public float countBMI(float mass, float height) {
        if(isValidMass(mass) && isValidHeight(height))
            return mass / (height * height);
        else
            throw new IllegalArgumentException();
    }

    @Override
    public boolean isValidMass(float mass) {
        return minMass <= mass && mass <= maxMass;
    }

    @Override
    public boolean isValidHeight(float height) {
        return minHeight <= height && height <= maxHeight;
    }
}

