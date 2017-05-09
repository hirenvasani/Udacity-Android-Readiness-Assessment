
import java.util.Collection;
//import javafx.print.Collation;

/*
 * TASK: Implement the Comparable Interface using the age field
 * as the differentiator
 * 
*/
public class Human implements Comparable<Human> {
    private int age;
    private String name;
    
    public Human(String givenName, int age) {
        this.name = givenName;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String introduce() {
        return "Hey! I'm " + name + " and I'm " + age + " years old.";
    }
    
    // Hint: Implement the method required by the Comparable Interface 
    // using age as the differentiator

    @Override
    public int compareTo(Human o) {
        int temp = o.getAge();
        return this.age - temp;
    }

}
