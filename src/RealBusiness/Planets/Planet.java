package RealBusiness.Planets;


import java.util.*;

public class Planet {


    private String name;
    private long population;
    private String volume;
    private double mass;
    private double radius;



    public double surfacegravity(){
        double constant= 6.6743 * Math.pow(10,-11);
        double surfacegravity = (constant*mass)/Math.pow(radius,3);
        return surfacegravity;
    }

    public double surfacearea(double radius){
        double pi = 3.141592653589793238;
        double surfacearea = (4*pi*radius);
        return surfacearea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Planet(String name, long population, String volume, double mass, double radius) {
        setName(name);
        setPopulation(population);
        setVolume(volume);
        setMass(mass);
        setRadius(radius);
    }

    public String toString() {
        return getClass().getSimpleName()+"{"+
                "name='" + name + '\'' +
                ", population=" + population +
                ", volume='" + volume + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                '}';
    }
}








/*1. create a class called Planet
			variables:
					name, mass, radius, surfaceGravity, surfaceArea, volume, population

			Encapsulate all the fields

			Add a constructor that can set all the fields

			methods:
				toString()

	2. create the following subclasses of Planet
			1. Earth
			2. Moon
			3. Mercury
			4. Venus
			*/
