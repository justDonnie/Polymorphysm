// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person [] people = {new Programmer("Emma"),
        new Dancer("James"), new Singer("Nikol")};
        for (Person p:people) {
            p.walk();
            if (p.getClass().equals(Dancer.class)){
                p.getInfo(20);
            } else if (p.getClass().equals(Programmer.class)) {
                p.getInfo(19);
            }else {
                p.getInfo(21);
            }
        }


    }
}

// getClass
//instanceOf