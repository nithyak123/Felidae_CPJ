import java.util.Random;

public class Leopard extends Cat {
    
    private String coatColor;
    
    public Leopard (String habitat, String coatColor, String nickname){
        super("leopard", habitat, nickname); 
        //habitat can be forest, grassland, or savanna
        this.coatColor = coatColor;
    }
    
    public void climbTree(){
        System.out.println("Climbing tree...");
        Random random = new Random();
        
        int randomNumber = random.nextInt(2); //generates random # between 0 and 1
        if (randomNumber % 2 == 0){
            super.energyLevel ++; //accounts for the case of the leopard finding prey
            System.out.println("found prey");
        }
        else {
            super.energyLevel --; //leopard did not find prey and wasted energy trying to do so
            System.out.println("did not find prey");
        } 
    }
    
    @Override
    public void makeSound(){
        System.out.println("Growl growwwl mew");
    }
    
    @Override
    public String toString(){
        return "Leopard " + super.nickname + " has a " + coatColor + " coat, and lives in the " + super.habitat + " habitat." + "They have an energy level of " + super.energyLevel + ". They are in danger: " + super.inDanger + ", they are asleep: " + super.isAsleep + "."; 
    }
}
