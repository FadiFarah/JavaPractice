enum AnimalType {
    Mammals,
    Birds,
    Reptiles,
    Fish,
    Invertebrates,
    Amphibians
}
public class Animal {
    private String name;
    private double weight;
    private char gender;
    private int age;
    private AnimalType animalType;

    public Animal(String name, double weight, char gender, int age, AnimalType animalType){
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
        this.animalType = animalType;
    }

    public void PrintAllValues(){
        System.out.println("Name %s".format(this.name));
        System.out.println("Weight %s".format(String.valueOf(this.weight)));
        System.out.println("Gender %s".format(String.valueOf(this.gender)));
        System.out.println("Age %s".format(String.valueOf(this.age)));
        System.out.println("Animal Type %s".format(String.valueOf(this.animalType)));
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }
}
