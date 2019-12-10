package HomeWork_10.User_Validation_Service;

import FinalWork.model.ValidationExceptions;

import java.io.IOException;

public class UserValidationService {

    private String name;
    private String lastName;
    private Integer age;

    ValidationExceptions validationExceptions;

    public UserValidationService(String name, String lastName, Integer age) {
       try{
           if (name.length()<=3 && name.length()>=15 &&
                   lastName.length()<=3 && lastName.length()>=15 &&
           age<=0 && age >=120){

           }else {
               System.out.println("Neatbilst parametriem!");
           }

       }catch (Exception va){


       }
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
