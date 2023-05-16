import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Unit.BaseUnit;
import Unit.Crossbowman;
import Unit.Mag;
import Unit.Monax;
import Unit.Peasant;
import Unit.Shooter;
import Unit.Sniper;
import Unit.StrelMan;
import Unit.Vor;

public class Game {
    private static boolean add;
    public static ArrayList<BaseUnit> team1 = new ArrayList<>();
    public static ArrayList<BaseUnit> team2 = new ArrayList<>();
    public static ArrayList<BaseUnit> allTeam = new ArrayList<>();

    public static void main(String[] args) {
       Shooter shooter= new Shooter(0, 0, null, "Den", 0, 150, 1, 0, 0,  3, 5, 1, 0);
        Mag mag = new Mag(20,150, "heal");
        Vor vor = new Vor(0,0,"Hard");
        StrelMan strelMan= new StrelMan(0,0,"Din");
        Sniper sniper = new Sniper(0, 0, "Miki");
        Monax monax =new Monax(15, 170, "heal");
        Crossbowman crossbowman = new Crossbowman(0,0,"Lip" );
        Peasant peasant = new Peasant(0, 0, null);
       
       ArrayList<BaseUnit> team1 = new ArrayList<>();
       for (int i = 0; i < 10; i++) {
           switch (new Random().nextInt(4)) {
               case 0:
                   team1.add(new Sniper(1, i, "Miki"));
                   break;
               case 1:
                   add = team1.add(new Mag(1,i, "heal"));
                   break;
               case 2:
                   team1.add(new Crossbowman(1,i,"Lip" ));
                   break;
               case 3:
                   team1.add(new Peasant (1,i, "Den" ));
                   break;
           }
       }
       ArrayList<BaseUnit> team2 = new ArrayList<>();
       for (int i = 0; i < 10; i++) {
           switch (new Random().nextInt(4)) {
               case 0:
                   team2.add(new Vor(10,i,"Hard"));
                   break;
               case 1:
                   team2.add(new Monax(10, i, "heal"));
                   break;
               case 2:
                   team2.add(new StrelMan(10, i, null));
                   break;
               case 3:
                   team2.add(new Peasant(10, i, null));
                   break;
           }

       }
       //team1.forEach(n -> System.out.println(n.getInfo()));
      // System.out.println();
       //team2.forEach(n -> System.out.println(n.getInfo()));

       allTeam.addAll(team1);
         allTeam.addAll(team2);
         allTeam.sort(BaseUnit::compareTo);
 
         Scanner in = new Scanner(System.in);
         while (true){
 
             View.view();
             in.nextLine();
             for (BaseUnit baseUnit : allTeam){
                 if (team1.contains(baseUnit)){
                     baseUnit.step();
                 }else baseUnit.step();
             }
 
         

            }
       
         }
         
        }       
