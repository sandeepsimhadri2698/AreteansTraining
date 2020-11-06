package Arrays;

import java.util.List;

public class Person {
    //private String name;
   // private int age;
   // private float salary;
    List<Person> personList;
    Person(List<Person> personList) {
        this.personList = personList;
    }

    /*Person(String name,int age,float salary){
        this.salary= salary;
        this.age =age;
        this.name = name;
    }*/

   @Override
    public String toString(){
        return "Name: "+personList.get(0)+","+"Age: "+personList.get(1)+","+"Salary: "+personList.get(2);
    }

}
