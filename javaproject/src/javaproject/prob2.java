package javaproject;

public class prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
package javaproject;
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;

}
}
public class  {
    public static void main(String[] args) {
        Person person1 = new Person("Khushi", 20);
        Person person2 = new Person("Ishita", 20);
        System.out.println("Person 1:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println();

        System.out.println("Person 2:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
    }
}

