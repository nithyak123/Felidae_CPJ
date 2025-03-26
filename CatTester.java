//shows that all the methods work

public class CatTester {
    public static void main(String[] args) {
        
        //cat testing
        Cat tom = new Cat("tom&jerry cat","jerry's house","tom");
        tom.makeSound();
        tom.hunt();
        System.out.println(tom);
        tom.habitatLoss();
        tom.sleep();
        System.out.println(tom);
        
        System.out.println();
        System.out.println("Commencing testing leopard class...");
        System.out.println();
        
        //leopard testing
        Leopard bobby = new Leopard("grassland","golden","bobby");
        bobby.makeSound();
        bobby.hunt();
        System.out.println(bobby);
        bobby.habitatLoss();
        bobby.sleep();
        bobby.climbTree();
        bobby.wakeUp();
        System.out.println(bobby);
        
        System.out.println();
        System.out.println("Commencing testing lion class...");
        System.out.println();
        
        //lion testing
        Lion mufasa = new Lion("savanna",true,"mufasa");
        mufasa.makeSound();
        mufasa.hunt();
        System.out.println(mufasa);
        mufasa.habitatLoss();
        mufasa.sleep();
        System.out.println(mufasa);
        
        System.out.println();
        System.out.println("Commencing testing tiger class...");
        System.out.println();
        
        //tiger testing
        Tiger tigger = new Tiger("wetlands",true,"tigger");
        tigger.makeSound();
        tigger.hunt();
        System.out.println(tigger);
        tigger.habitatLoss();
        tigger.sleep();
        tigger.swim();
        System.out.println(tigger);
    }
}
