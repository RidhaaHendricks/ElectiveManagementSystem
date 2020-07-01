package za.ac.cput.elective.factory;

/** Student class
* @author @Dogfoger
* Desc: Factory for Student
* Date: 2020/07/01
 */
import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.elective.entity.Student;

import static org.junit.Assert.*;

public class StudentFactoryTest {

    @Test
    public void createStudent() {
        StudentFactory s = new StudentFactory();

        Student m = s.createStudent(3, "AppDev");
        Assert.assertEquals(3, m.getYear());
        Assert.assertEquals("AppDev", m.getStream());
    }
}
