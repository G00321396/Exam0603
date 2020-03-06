/*

Author’s Name: Ciarán Walsh
Date: 06/03/2020
Contact Details: g00321396@gmit.ie
Comments: Employee Payroll System

 */


package ie.gmit;

public class Employee
{

    private String title;
    private String name;
    private String ppsn;
    private String phone;
    private String employeetype;
    private int age;

    public Employee()
    {
        this.title = "";
        this.name = "";
        this.ppsn = "";
        this.phone = "";
        this.employeetype = "";
        int age;
    }

    public Employee(String title, String name, String ppsn, String phone, String employeetype, int age) throws IllegalAccessException {
        if ((title != "Mr") || (title != "Mrs") || (title != "Miss"))
            {
                throw new IllegalAccessException();
            }
        else
            {
                this.title = title;
                this.name = name;
                this.ppsn = ppsn;
                this.phone = phone;
                this.employeetype = employeetype;
                this.age = age;
            }
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title) throws IllegalAccessException
    {
        if ((title != "Mr") || (title != "Mrs") || (title != "Miss"))
            {
                System.out.println("Title Error: Only Mr, Mrs or Miss accepted.");
                throw new IllegalAccessException();
            }
        else
            {
                this.title = title;
            }
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) throws IllegalAccessException
    {
        if (name.length() < 5 || name.length() > 22)
        {
            System.out.println("Name Error: Name Provided is not valid.");
            throw new IllegalAccessException();
        }
        else{
                this.name = name;
            }
    }

    public String getPPSN()
    {
        return ppsn;
    }

    public void setPPSN(String ppsn) throws IllegalAccessException
    {
        if (ppsn.length() != 6)
        {
            System.out.println("PPSN Error: Number must have 6 characters.");
            throw new IllegalAccessException();
        }
        else{
            this.ppsn = ppsn;
        }
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone) throws IllegalAccessException
    {
        if (phone.length() !=7)
        {
            System.out.println("Phone Error: Number must have 7 digits.");
            throw new IllegalAccessException();
        }
        else for (char c : phone.toCharArray())
        {
            if(!Character.isDigit(c))
            {
                System.out.println("Phone Error: Non-digit inputted. Number must have 7 digits.");
                throw new IllegalAccessException();
            }
            else {
                this.phone = phone;
            }
        }

    }

    public String getEmployeetype()
    {
        return employeetype;
    }

    public void setEmployeetype(String employeetype) throws IllegalAccessException
    {
        if(employeetype != "Full-time" || employeetype != "Part-time")
        {
            System.out.println("Type Error: You can only Full time or Part Time.");
            throw new IllegalAccessException();
        }
        else
            {
                this.employeetype = employeetype;
            }
    }
    public int getAge()
    {
        return age;
    }

    public void setAge(int Age) throws IllegalAccessException
    {
        if(age < 18)
        {
            System.out.println("Age Error: Age must be over 18. You are too young to work at this company.");
            throw new IllegalAccessException();
        }
        else
            {
                this.age= age;
            }
    }
}

