public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void walk(){
        System.out.println(name+" is walking");
    }

    public  void getInfo(int age){
        System.out.println(name+age);
    }
}
