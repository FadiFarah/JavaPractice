// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Rabbit", 20, 'M', 7, AnimalType.Mammals);

        a.setAge(2);
        a.setWeight(5);
        a.PrintAllValues();

        //Using Factory Pattern
        Printer p = Printer.createInstance("Message:");
        String concatenatedMsg = p.concatenateMessage("Hello there");
        System.out.println(concatenatedMsg);
    }
}