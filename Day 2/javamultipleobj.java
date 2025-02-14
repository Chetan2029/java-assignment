// wap to create the multiple objects of a class and display the information of each object to the console.

public class javamultipleobj {
    // Instance variables to store the information of about each object...
String name;
String mail_id;
String employee_code;
long PHONE_NUMBER;
String Address;
String Details;
int age;

    // constructor is a special method that is used to initialize objects. It is called when an object of a class is created. 
public javamultipleobj(String name, String mail_id, String employee_code, long PHONE_NUMBER, String Address, String Details, int age) {
    this.name = name;
    this.mail_id = mail_id;
    this.employee_code = employee_code;
    this.PHONE_NUMBER = PHONE_NUMBER;
    this.Address = Address;
    this.Details = Details;
    this.age = age;
}

// Display method to display the information of each object to the console...

public void display() {
    System.out.println("Name: " + name + ", Mail_id: " + mail_id + ", Employee_code: " + employee_code + ", Phone_number: " + PHONE_NUMBER + ", Address: " + Address + ", Details: " + Details + ", Age: " + age);

}
// Main method  to create objects of the class and call the display method on each object...
public static void main(String[] args) {
    javamultipleobj obj1 = new javamultipleobj("Chetan", "chetan3901 @gmail.com", "Emp-091", 9817565897L, "Delhi", "Student", 20);
    javamultipleobj obj2 = new javamultipleobj("Ankit", "Ankit4902 @gmail.com", "Emp-092", 9497644546L, "Mumbai", "Employee", 25);
    javamultipleobj obj3 = new javamultipleobj("Mandeep", "Mandeeo7903 @gmail.com", "Emp-093", 9151243437L, "Pune", "Employee", 30);
    javamultipleobj obj4 = new javamultipleobj("Kirti", "kirti8904 @gmail.com", "Emp-094", 8942134364L, "Bangalore", "Employee", 35);
    javamultipleobj obj5 = new javamultipleobj("Himanshu", "himanshu @gmail.com", "Emp-095", 9944643458L, "Chennai", "Employee", 40);
    obj1.display();         
    obj2.display(); 
    obj3.display();
    obj4.display();
    obj5.display();
        
}
}
