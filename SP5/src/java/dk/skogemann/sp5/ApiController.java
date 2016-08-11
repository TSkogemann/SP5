/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.skogemann.sp5;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Thomas Skogemann
 */
@Controller
@RequestMapping(produces = MimeTypeUtils.APPLICATION_JSON_VALUE)public class ApiController {
    DataGenerator dataGenerator = new DataGenerator();

    public ApiController() {
        System.out.println("ApiController constructor");
    }
    

    @RequestMapping(value = "adresses/{count}/{fname}/{lname}/{city}/{street}", 
            method = RequestMethod.GET)
    @ResponseBody
    public Person[] generateData(
        @PathVariable("count") int count,
        @PathVariable("fname") String fName,
        @PathVariable("lname") String lName,
        @PathVariable("city") String city,
        @PathVariable("street") String street
        ){
       return dataGenerator.generateData(count, fName, lName, city, street);
    }
    
    @RequestMapping(value = "test")
    @ResponseBody
    public void test(){
        System.out.println("ApiController test bliver kaldt");
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/ping")
    @ResponseBody
    public Person[] ping(HttpServletRequest request) {
        return new Person[]{};
    }
}
