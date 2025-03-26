import java.util.Random;

public class Cat
{
    protected String name;
    protected String habitat;
    protected int energyLevel;
    protected boolean inDanger;
    protected boolean isAsleep;
    protected String nickname;
    
    public Cat (String name, String habitat, String nickname){
        this.name = name;
        this.habitat = habitat;
        this.energyLevel = 0;
        this.isAsleep = false;
        this.inDanger = false;
        this.nickname = nickname;
    }
    
    public void makeSound(){
        System.out.println("meow");
    }
    
    public void hunt(){
        System.out.println("Hunting...");
        Random random = new Random();
        
        int randomNumber = random.nextInt(2); //generates random # between 0 and 1
        if (randomNumber % 2 == 0){
            energyLevel ++; //accounts for the case of the cat finding prey
            System.out.println("found prey");
        }
        else {
            energyLevel --; //cat did not find prey and wasted energy trying to do so
            System.out.println("did not find prey");
        }
    }
    
    public void habitatLoss(){
        inDanger = true;
        System.out.println("Oh no!! Your habitat is in danger... deforestation and humans are approaching...");
    }
    
    public void sleep(){
        energyLevel ++;
        isAsleep = true;
        System.out.println("zzzzz....");
    }
    
    public void wakeUp(){
        isAsleep = false;
        System.out.println(nickname + ": oh... it's morning already?");
    }
    
    //getter setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getHabitat(){
        return habitat;
    }
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    public String getNickname(){
        return nickname;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public int getEnergyLevel(){
        return energyLevel;
    }
    public void setEnergyLevel(int energyLevel){
        this.energyLevel = energyLevel;
    }
    public boolean isInDanger(){
        return inDanger;
    }
    public void setDanger(boolean inDanger){
        this.inDanger = inDanger;
    }
    public boolean catIsAsleep(){
        return isAsleep;
    }
    public void setAsleep(boolean isAsleep){
        this.isAsleep = isAsleep;
    }
    
    public String toString(){
        return nickname + ", a " + name + ", lives in the " + habitat + " habitat." + "They have an energy level of " + energyLevel + ". They are in danger: " + inDanger + ", they are asleep: " + isAsleep + "."; 
    }
    
}
