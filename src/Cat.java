public class Cat {
    private double weight;
    private String name;
    private int age;
    private String color;


    public Cat(int weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
    }


    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age > this.age) {
            this.age = age;
        }
    }
    
    public int getAge() {
        
    }

    public void setColor(String color) {
        this.color = color;

        meow(); meow(); meow();
    }

    private void meow() {
        System.out.println("meow");
    }

    private void pee() {
        weight -= 20;
    }

    public void eat() {
        weight += 20;

        if(50/weight == .01)
            pee();
    }
}
