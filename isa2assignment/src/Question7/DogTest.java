package Question7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DogTest {

    @Test
    public void testSetNameAndGetBreed() {
        Dog dog = new Dog("Buddy", "Labrador");
        dog.setName("Charlie");
        dog.setBreed("Golden Retriever");
        assertEquals("Charlie", dog.getName());
        assertEquals("Golden Retriever", dog.getBreed());
    }
}
