package HomeWork_10.User_Validation_Service;

import FinalWork.model.ValidationExceptions;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.validation.Validator;
import java.io.IOException;

public class UserValidationService extends Validator {

    private String name;
    private String lastName;
    private Integer age;




    public UserValidationService(String name, String lastName, Integer age) {
       try{
           if (name.length()>=3 && name.length()<=15 &&
                   lastName.length()>=3 && lastName.length()<=15 &&
           age>=0 && age <=120){
               System.out.println("User added: " + name + " " + lastName + ", "
               + ", " + age + " age");

           }else {
               System.out.println("Neatbilst parametriem!");
           }

       }catch (Exception e){
           new ValidationExceptions().getClass();

       }
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public void reset() {

    }

    @Override
    public void validate(Source source, Result result) throws SAXException, IOException {

    }

    @Override
    public void setErrorHandler(ErrorHandler errorHandler) {

    }

    @Override
    public ErrorHandler getErrorHandler() {
        return null;
    }

    @Override
    public void setResourceResolver(LSResourceResolver resourceResolver) {

    }

    @Override
    public LSResourceResolver getResourceResolver() {
        return null;
    }
}
