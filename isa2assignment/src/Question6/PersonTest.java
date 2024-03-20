package Question6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void testSetNameAndGetAge() {
        Person person = new Person("John", 30);
        person.setName("Alice");
        assertEquals("Alice", person.getName());
        assertEquals(30, person.getAge());
    }
}
