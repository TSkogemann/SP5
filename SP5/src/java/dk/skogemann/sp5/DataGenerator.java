package dk.skogemann.sp5;


import dk.skogemann.sp5.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Thomas Skogemann
 */
public class DataGenerator {

    String[] fNameList = {"Bo", "Knud", "Peter", "Søren", "Lars", "Hans", "Casper"};
    String[] lNameList = {"Hansen", "Olsen", "Knudsen", "Petersen", "Larsen"};
    String[] streetList = {"Vej1", "Vej2", "Vej3", "Vej4", "Vej5", "Vej6", "Vej7", "Vej8", "Vej9", "Vej10", "Vej11", "Vej12", "Vej13"};
    String[] cityList = {"city1", "city2", "city3", "city4", "city5", "city6", "city7", "city8", "city9", "city10", "city11", "city12"};

    public Person[] generateData(int count, String... args) {
        int fNamePers = 0;
        int lNamePers = 0;
        int cityPers = 0;
        int streetPers = 0;
        
        if (count == 0) {
            Person[] error = new Person[0];
            return error;
        }
        for (int i = 0; i < args.length; i++) {
           
            if (args[i].equals("fname")) {
                fNamePers = 1;
            }
            if (args[i].equals("lname")) {
                lNamePers = 1;
            }
            if (args[i].equals("city")) {
                cityPers = 1;
            }
            if (args[i].equals("street")) {
                streetPers = 1;
            }
        }
        
            
            System.out.println(fNamePers + " fName");
            System.out.println(lNamePers + " lName");
            System.out.println(cityPers + " city");
            System.out.println(streetPers + " street");
            

        Person[] res = new Person[count];

        for (int p = 0; p < count; p++) {

            Person tempPerson = new Person();
            if (fNamePers == 1) {
                tempPerson.setfName(getRandom(fNameList));
            }
            if (lNamePers == 1) {
                tempPerson.setlName(getRandom(lNameList));
            }
            if (cityPers == 1) {
                tempPerson.setCity(getRandom(cityList));
            }
            if (streetPers == 1) {
                tempPerson.setStreet(getRandom(streetList));
            }
            res[p] = tempPerson;
        }
        System.out.println(res);
        return res;
    }
    
    public String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}
