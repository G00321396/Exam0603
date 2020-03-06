/*

Author’s Name: Ciarán Walsh
Date: 06/03/2020
Contact Details: g00321396@gmit.ie
Comments: Employee Payroll System

 */

package ie.gmit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Employee;
import org.junit.jupiter.api.*;

import java.security.InvalidParameterException;

public class EmployeeTest
{
    private Employee myEmployee;

    @beforeAll
    @DisplayName{"Starting Test"}
    public static void print() { System.out.println("Starting tests");}

    @beforeEach
    @DisplayName("New Instance of Employee")
    void init(TestInfo testInfo, TestReporter testReporter)
    {
        myEmployee = new Employee();
        System.out.println("Employee Entry = " +testInfo.getDisplayName());
    }

    @Test
    @DisplayName("Testing Getters and Setters of Employee")
    void testGettersAndSetters(TestInfo testInfo)
    {
        myEmployee.setTitle("Mr");
        assertEquals(myEmployee.getTitle(),"Mr");
        MyEmployee.SetName("Ciaran");
        assertEquals(myEmployee.getName(),"Ciaran");
        myEmployee.setPPSN("512456");
        assertEquals(myEmployee.getPPSN(), "512456");
        myEmployee.setPhone("1941321");
        assertEquals(myEmployee.getPhone(), "1941321");
        myEmployee.setEmployeetype("Full-time");
        assertEquals(myEmployee.getEmployeetype(), "Full-Time");
        myEmployee.setAge("18");
        assertEquals(myEmployee.getAge(),"18");




    }

}
