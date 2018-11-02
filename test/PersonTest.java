package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import main.*;


public class PersonTest {

    @Test
    public void testPersonShouldBeCreated() {
        String actual_name = "Calvin";
        int actual_age = 25;
        Person person1 = new Person(actual_name, actual_age);

        assertEquals(actual_name, person1.getName());
        assertEquals(actual_age, person1.getAge());
    }
}
