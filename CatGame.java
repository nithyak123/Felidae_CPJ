import java.util.Scanner;
import java.util.Random;

//game where I demonstrate all methods. please run this file

public class CatGame {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to the Jungle!");
        
        System.out.println("The jungle is filled with cats. Choose your avatar: press 1 for the lion, the king of the jungle. Press 2 for the fearsome tiger. Press 3 for the wily leopard. Press 4 for a generic cat or another species not written here.");
        
        //picking the type of cat
        int choice = input.nextInt();
        input.nextLine();
        
        String catType;
        if (choice == 1){
            catType = "lion";
        }
        else if (choice == 2){
            catType = "tiger";
        }
        else if (choice == 3){
            catType = "leopard";
        }
        else {
            System.out.println("What type of cat specifically? Tabby, ocelot, ginger... these are all ideas!");
            catType = input.nextLine();
        }
            
        //nickname    
        System.out.println("What will you name your " + catType + "?");
        String nickname = input.nextLine();
        
        //habitat
        System.out.println("What habitat would you like to explore?");
        String habitat = input.nextLine();
        
        //creating object
        Cat player;
        
        if (catType.equals("leopard")){
            System.out.println("What is the coat color of your leopard?");
            player = new Leopard(habitat, input.nextLine(), nickname);
        }
        else if (catType.equals("lion")){
            System.out.println("Is your lion the leader of its pride? True or false");
            player = new Lion(habitat, input.nextBoolean(), nickname);
        }
        else if (catType.equals("tiger")){
            System.out.println("Does your tiger like to swim? True or false");
            player = new Tiger(habitat, input.nextBoolean(), nickname);
        }
        else {
            player = new Cat(catType, habitat, nickname);
        }
        
        //intro message
        System.out.println();
        System.out.println("Welcome to the Jungle. You're ready to play. Press any key to commence, or press 0 to quit.");
        String play = input.nextLine();
        System.out.println();
        
        int days = 0;
        
        //make choices about what to do
        //habitat loss is random
        while (!play.equals("0")){
            if (days == 0){
                System.out.println("Now, you have options. You have a full day ahead of you. What would you like to do?");
            }
            else {
                System.out.println("Day " + days + ". What would you like to do?");
            }
            System.out.println("1: Make sound\n2: hunt\n3: sleep\n4: if asleep, wake up"); //general choices for cat class
            //specific choices based on species
            if (catType.equals("leopard")){
                System.out.println("5: climb tree");
            }
            else if (catType.equals("tiger")){
                System.out.println("5: swim");
            }
            int choice1 = input.nextInt();
            System.out.println();
            if (choice1 == 1){
                player.makeSound();
            }
            else if (choice1 == 2){
                player.hunt();
            }
            else if (choice1 == 3){
                player.sleep();
            }
            else if (choice1 == 4){
                player.wakeUp();
            }
            else if (choice1 == 5){
                if (player instanceof Leopard){
                    ((Leopard) player).climbTree();
                }
                else if (player instanceof Tiger){
                    ((Tiger) player).swim();
                }
            }
            else if (choice1 == 0){
                break;
            }
            int randomNumber = random.nextInt(10);
            if (randomNumber == 1){
                player.habitatLoss();
            }
            System.out.println("Press 6 for a summary of your situation and status or press any other number to continue to the next day.");
            int choice2 = input.nextInt();
            if (choice2 == 6){
                System.out.println(player);
            }
            if (player.getEnergyLevel() <= -3){
                System.out.println(player.getNickname() + ", you have died from low energy (and dysentery/typhoid/cholera/river crossing). This could have occurred as a result of many factors. Don't worry, you will have the chance to enter the Jungle again.");
                play = "0";
            }
            
            int randomNumber2 = random.nextInt(20);
            if (randomNumber == 1){
                System.out.println("You had to move to another jungle, sadly. Goodbye.");
                break;
            }
            System.out.println();
            days++;
        }
        
        System.out.println("Well done. You've journeyed the Jungle.");
    }
}
