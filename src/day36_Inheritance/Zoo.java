package day36_Inheritance;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 2, "Small", "White");
        System.out.println(dog);
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
       // dog.hunt();
       // dog.scratch();



        Cat cat = new Cat();
        cat.setInfo("Tarcin","British",'M',3,"Small","brown");
        System.out.println(cat);
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
       // cat.bark();
      //  cat.hunt();
        cat.scratch();
        cat.meow();


        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "Orange");

        System.out.println(tiger);
        tiger.eat();

        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();



      //  tiger.bark();




    }

}
