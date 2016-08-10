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
        for (int i=0; i<data.length-1; i++){
        System.out.println(data[i]);
        }
    }
}
