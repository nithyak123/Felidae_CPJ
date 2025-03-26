import java.util.Random;

public class Lion extends Cat {
    
    private boolean prideLeader;
    
    public Lion (String habitat, boolean prideLeader, String nickname){
        super("lion", habitat, nickname); 
        //habitat can be woodland, grassland, or savanna
        this.prideLeader = prideLeader;
    }
    
    public boolean isPrideLeader(){
        return prideLeader;
    }
    
    @Override
    public void makeSound(){
        System.out.println("Roarrrrr roaarrrrrrr");
    }
    
    @Override
    public String toString(){
        return "Lion " + super.nickname + " is pride leader: " + prideLeader + ", and lives in the " + super.habitat + " habitat." + "They have an energy level of " + super.energyLevel + ". They are in danger: " + super.inDanger + ", they are asleep: " + super.isAsleep + "."; 
    }
}
