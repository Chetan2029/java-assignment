public class javainstanceobj { 
    public static void main(String[] args) { 
        try { 
            // Creating an obj of the outer class javainstanceobj
            javainstanceobj outerClass = new javainstanceobj(); 

            // Correcting the reflection to match the actual class
            Class<?> c = Class.forName("javainstanceobj$Student"); 

            // Create an instance of Student and pass the outerClass instance
            Student s = (Student) c.getDeclaredConstructor(javainstanceobj.class).newInstance(outerClass); 

            s.name = "Chetan"; 
            s.roll_no = 37; 

            System.out.println("Student Details: "); 
            s.display(); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 

    // Non-static inner class
    class Student { 
        String name; 
        int roll_no; 

        // method
        void display() { 
            System.out.println("Name: " + name); 
            System.out.println("RollNo: " + roll_no); 
        } 
    }
}
