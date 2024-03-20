package Question8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void testCalculateDA() {
        Employee employee = new Employee("John Doe", "Software Engineer", 50000);
        assertEquals(5000, employee.calculateDA());
    }
}
