package za.ac.cput.elective.factory;

//import com.sun.tools.javac.jvm.Gen;
import za.ac.cput.elective.entity.Gender;

public class GenderFactory {

    public static Gender createGender(Gender.genderIs genderIs, String gender) {

        Gender gender1 = new Gender.Builder()
                .setGenderID(genderIs)
                .setGender(gender)
                .build();

        return null;
    }

}
