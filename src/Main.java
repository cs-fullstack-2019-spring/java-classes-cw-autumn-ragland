import com.company.classwork.Account;
import com.company.classwork.Dog;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        ex2();
        ex1();
    }

    private static void ex2(){
        ArrayList<Object> dogs = new ArrayList<>();
        Dog d1 = new Dog("Spike", 12, "beagle", "brown");
//        dogs.add(d1);
        d1.printDogs();
        Dog d2 = new Dog("Elvis", 7, "terrier", "tan");
//        dogs.add(d2);
        d2.printDogs();
        Dog d3 = new Dog("Zo", 5, "yorie", "silver/brown");
//        dogs.add(d3);
        d3.printDogs();
//        for(eachDog:dogs){
//
//        }
    }

    private static void ex1(){
        Account a1 = new Account("KYancy", 10);
        Account a2 = new Account("KGibbs", 1000);
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());

        a2.withdraw(100);
        a1.deposit(100);
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
    }
}
