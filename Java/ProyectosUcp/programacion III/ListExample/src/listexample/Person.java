package listexample;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pepe
 */
public class Person {

    private String name;
    private int age;
    private List<Cars> cars= new ArrayList<>();

    public Person() {
    }

    public void setCars(List<Cars> cars) {
        this.cars = cars;
    }

    public List<Cars> getCars() {
        return this.cars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}
