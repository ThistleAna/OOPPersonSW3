// blueprint of the person object
public class Person {
    // declare all attributes, ecapsulate them using private keyword
    private String name;
    private int age;
    private int height;
    private double weight;
    // method constructor
    public Person(String name, int age, int height, double weight) { // list all the setter methods
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }
    // setter method for name, no static keyword, always void, pass on parameter
    public void setName (String name) {
        this.name = name;
    }
    // getter method for name, return value, no parameter passing
    public String getName() {
        return name;
    }
    // setter method for age, no static keyword, always void, pass on parameter
    public void setAge (int age) {this.age = age;}
    // getter method for age, return value, no parameter passing

    public int getAge() {return age;}

    // use shortcut Alt + Insert

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // behavioural method
    public void growOlder(){
        setAge(getAge()+1); // increase age by 1
        setHeight(getHeight()-1); // decrease height by 1
        setWeight(getWeight()-0.5);// decrease the weight  by 0.5
    }
}
