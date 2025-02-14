public class javacreateobj {
    public static void main(String args[]){
   student s1=new student();
   s1.name="Chetan";
   s1.rollno=37;
   s1.display();

    }
    static class student{
     String name;
     int rollno;
     void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll_No : "+rollno);
     }
    }
}