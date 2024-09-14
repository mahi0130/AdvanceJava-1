Certainly! Here’s an explanation for each part of the Java class `Employee`, along with comments for clarity:

```java
package in.co.sunrays.bean;

import java.io.Serializable;

/*
 * @Copyright (c) SunilOS. All rights reserved.
 * @URL www.SunilOS.com
 */

// The Employee class implements Serializable, which means its objects can be converted into a byte stream
public class Employee implements Serializable {

    // Private fields for storing employee details
    private int id;              // Unique identifier for the employee
    private String firstName;    // Employee's first name
    private String lastName;     // Employee's last name
    private transient String tempValue; // Transient field; will not be serialized
    private static int RETIREMENT_AGE = 60; // Static constant; shared across all instances

    // Default constructor
    public Employee() {
        // No initialization needed
    }

    // Parameterized constructor to initialize employee with id, first name, and last name
    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter method for firstName
    public String getFirstName() {
        return firstName;
    }

    // Setter method for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter method for id
    public int getId() {
        return id;
    }

    // Setter method for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter method for lastName
    public String getLastName() {
        return lastName;
    }

    // Setter method for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter method for tempValue
     * @return the tempValue
     */
    public String getTempValue() {
        return tempValue;
    }

    /**
     * Setter method for tempValue
     * @param tempValue the tempValue to set
     */
    public void setTempValue(String tempValue) {
        this.tempValue = tempValue;
    }

    @Override
    public String toString() {
        // Creating a string representation of the Employee object
        StringBuffer sb = new StringBuffer("");
        sb.append("ID : " + getId());                      // Append employee ID
        sb.append("\nName : " + getFirstName());           // Append employee first name
        sb.append("\nLast Name : " + getLastName());       // Append employee last name

        return sb.toString();  // Return the string representation
    }
}
```

### Explanation:

1. **Package and Imports**:
   - `package in.co.sunrays.bean;`: Defines the package in which this class is located.
   - `import java.io.Serializable;`: Imports the `Serializable` interface, which allows the object of this class to be serialized.

2. **Class Declaration**:
   - `public class Employee implements Serializable`: Declares the `Employee` class and indicates that it implements the `Serializable` interface, allowing its instances to be converted into a byte stream.

3. **Fields**:
   - `private int id;`: Unique identifier for the employee.
   - `private String firstName;`: Employee's first name.
   - `private String lastName;`: Employee's last name.
   - `private transient String tempValue;`: Transient field that will not be serialized. Used for temporary data that doesn’t need to be saved.
   - `private static int RETIREMENT_AGE = 60;`: Static field representing the retirement age. This is shared across all instances of the class.

4. **Constructors**:
   - `public Employee()`: Default constructor with no parameters.
   - `public Employee(int id, String firstName, String lastName)`: Parameterized constructor for initializing an `Employee` object with id, first name, and last name.

5. **Getters and Setters**:
   - Methods like `getFirstName()`, `setFirstName(String firstName)`, `getId()`, `setId(int id)`, etc., are standard getter and setter methods to access and modify private fields.

6. **`toString()` Method**:
   - `@Override public String toString()`: Overrides the `toString` method to provide a custom string representation of the `Employee` object. It uses a `StringBuffer` to build the string and includes the employee’s ID, first name, and last name.

The comments should help clarify the purpose and functionality of each part of the class.
