import java.util.Scanner;

public class Person {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Person person = new Person();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        person.setName(input.nextLine());
        String name = person.getName();

        System.out.print("Your full name is: " + name);
    }

}

