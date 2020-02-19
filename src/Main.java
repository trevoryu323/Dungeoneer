import entity.*;
import entity.creature.*;
import entity.heroes.*;

public class Main {

    public static void main(String[] args) {


        System.out.println("\nWelcome to Dungeoneer!");
        System.out.println("\n-----------------------------------------\n");
        
        System.out.println("");

        ACreature slime = new slimeball(12);
        AHero elf = new elf(1);
        System.out.println(elf.inspectEntity());
        System.out.println(slime.inspectEntity());
    }
}