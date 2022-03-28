package DataObject;
import com.github.javafaker.Faker;
public interface CvRegistrationData {
    Faker faker = new Faker();
        String
            email = "sofchiiiik@gmail.com",
            password = "whatever159",
            name = "Sophie",
            surname = "Sturua",
            phone = "551616744";


    String
            wrongEmail = ".",
            wrongPassword = ".",
            wrongFirstName = ".",
            wrongLastName = ".",
            wrongPhone = ".";
}
