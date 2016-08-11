package dk.skogemann.sp5;


import dk.skogemann.sp5.Person;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas Skogemann
 */
public class Main {

    public static void main(String[] args) {

        DataGenerator test = new DataGenerator();
        
        Person[] data = test.generateData(5, "fName", "lName", "city", "street");
        
        for (int i = 0; i < data.length - 1; i++) {
            System.out.println(data[i]);
        }
        
        System.out.println("----------------------------------------");
            Person[] data2 = test.generateData(5, "fName", "lName", "street");
            for (int i2 = 0; i2 < data2.length - 1; i2++) {
                System.out.println(data2[i2]);
            }
            
        System.out.println("----------------------------------------");     
          Person[] data3 = test.generateData(5, "fName", "lName");
            for (int i3 = 0; i3 < data3.length - 1; i3++) {
                System.out.println(data3[i3]);
            }  
        }
    }
