package PR6.entities;

public abstract class Dog {
    protected String breed;
    protected int age;

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }
    public abstract String getColor();
    @Override
    public String toString() {
        return "Dog: {breed: " + breed + ", age: " + age + " years}";
    }
}