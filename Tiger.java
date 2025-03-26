import java.util.Random;

public class Tiger extends Cat {
    
    private boolean likesSwimming;
    private int happinessLevel;
    
    public Tiger (String habitat, boolean likesSwimming, String nickname){
        super("tiger", habitat, nickname); 
        //habitat can be forest, grasslands, or wetlands
        this.likesSwimming = likesSwimming;
        this.happinessLevel = 0;
    }
    
    public void swim(){
        super.energyLevel --;
        if (likesSwimming){
            happinessLevel ++;
            System.out.println("Swimming... wow, the water is so nice and peaceful");
        }
        else {
            System.out.println("I hate swimming... I hate water... :((");
        }
    }
    
    @Override
    public void makeSound(){
        System.out.println("Roarr roar chuff");
    }
    
    @Override
    public String toString(){
        return "Tiger " + super.nickname + " likes to swim: " + likesSwimming + ", and lives in the " + super.habitat + " habitat." + "They have an energy level of " + super.energyLevel + ". They are in danger: " + super.inDanger + ", they are asleep: " + super.isAsleep + ". They have a happiness level of " + happinessLevel; 
    }
}
