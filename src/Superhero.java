/*
 * - TASK: Extend the class Superhero as a subclass of Human.
 * - TASK: Add a String field that stores the hero's alter ego!
 * - TASK: Modify the given constructor by adding the alter ego as an additional parameter
 *   and setting it.
 * - TASK: Override the introduce() method to ALSO include the alter ego! (In other words,
 *   you should call the superclass introduce method when you override the method.)
*/

public class Superhero extends Human{
    private String alterEgo;
    private int age;
    private String name;
    
    public Superhero(String givenName, int age, String alterName) {
        super(givenName, age);
        this.name = givenName;
        this.age = age;
        this.alterEgo = alterName;
    }
    
    public String getAlterEgo() {
        return alterEgo;
    }
    
    @Override
    public String introduce() {
        return "Hey! I'm " + name + " and I'm " + age + " years old.I'm also known as " + alterEgo;
    }
}