/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listexample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pepe
 */
public class ListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /// DECLARA  la clase 
        Person person = new Person();
        //declara una lista de OBJ cars
        ArrayList<Cars> cars = new ArrayList<>();
        //de ese lista de Objeto declara uno 
        Cars car = new Cars();
        // le asigna valor  a el objeto dentro de la lista 
        car.setName("BMW");
        cars.add(0,car);

        car.setName("Peugeot");
        cars.add(1,car);

        car.setName("Lamborghini");
        cars.add(2,car);

        car.setName("Porge");
        cars.add(3,car);
        
        // ese oJbeto de veiculo de la lista se los asigna a lka case del persona
        person.setCars(cars);
        //  le asigna el valor de l alista guardada a una nueva lista de Objto caroo
        System.out.println(person.getCars().get(2).getName());
        List<Cars> listCars = new ArrayList<>(person.getCars());
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).getName());
        }
    //imprime..........
       
        System.out.println("Nombre del auto: " + listCars.get(0).getName());
        System.out.println("Nombre del auto: " + listCars.get(2).getName());
    }

}
