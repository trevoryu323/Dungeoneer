import entity.AEntity;
import entity.creature.slimeball;

public class Main {

    public static void main(String[] args) {


        System.out.println("\nWelcome to Dungeoneer!");
        System.out.println("\n-----------------------------------------\n");
        
        System.out.println("");

        AEntity slime = new slimeball(10);
        System.out.print(slime.stat.accuracy);
        System.out.println("");
    }
}