import java.util.*;

public class Class1{
 // here making class for Person
    private static class Person{
        // intializing data members
        int age;
        String name;
  //mathod
        void sayhi(){
            if(age > 30){
                System.out.println("hello"+" "+this.name);
            }
            else{
                System.out.println("hii"+" "+this.name);
            }
        }
    }

    public static void main(String[] args)
    {
        //here in stack variable created of name p1 of Person datatype and value is NULL
        Person p1 ;
        // here new is operater it is use in class for creating instanse of object in heap and pass valie to p1 ...
        p1 = new Person();

        p1.name = "Rahul";
        p1.age = 21;
        // when mathod is called the function came in satack before p1 and "this" keyword is passed this is point to calling variable i.e it has address of calling variable...
        p1.sayhi();

        Person p2 ;
        p2 = new Person();
        p2.age = 34;
        p2.name = "sumit";
        p2.sayhi();

        // here address of p2 is goto p3 now both p2 p3 are point same address and when we change the value of data memebers it also change for other variable also..
        Person p3 = p2 ;
        p3.age = 44;
        p3.name = "ranjit";
        p3.sayhi();
        p2.sayhi();

        p1.age = p3.age ;
        p1.sayhi();


    }
}