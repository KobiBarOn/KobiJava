package a;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person(); // complex object #1
		
		p1.id = 101;
		p1.name = "David";
		p1.age = 25;
		
        System.out.println(p1.name);
        System.out.println(p1.id);
        System.out.println(p1.age);
        
        System.out.println("=======");

        Person p2 = new Person(); // complex object #2
		
		p2.id = 201369600;
		p2.name = "Kobi";
		p2.age = 30;
		

        System.out.println(p2.name);
        System.out.println(p2.id);
        System.out.println(p2.age);
        
        System.out.println("=======");

	}

}
