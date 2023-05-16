package Unit;

import java.util.ArrayList;

public abstract class BaseUnit implements GameInterface {
    enum State {
        ready, busy
    }

    protected int hpL , maxHp, lvl ,damag ,maxDamag,armor,speed;
    protected String name;
    protected static ArrayList<BaseUnit> team ;
    protected int x,y;
    protected int arrows;
    protected  int accuracy;
    protected Coordinat coordinat;
    protected State state;

    public BaseUnit(int x, int y,ArrayList<BaseUnit> team , String name, int hpL , int maxHp,int lvl, int damag, int maxDamag , int armor, int speed,int arrows,int accuracy){
        this.armor = armor;
        this.damag= damag;
        this.lvl=lvl;
        this.maxDamag=maxDamag;
        this.maxHp=maxHp;
        this.name=name;
        this.hpL=hpL;
        this.speed=speed;
        this.team= team;
        this.x=x;
        this.y=y;
        this.arrows=armor;
        this.accuracy=accuracy;
        this.coordinat = new Coordinat(x,y);
        this.state = State.ready;

    }

    
   
    
    public BaseUnit(ArrayList<BaseUnit> team2, String name2, int hpL2, int maxHp2, int lvl2, int damag2, int maxDamag2,
            int armor2, int speed2, int x2, int y2) {
    }




    public String getInfo (){
        return String.format("-- %s -- %s[%d/%d], damag: %d --",
        this.getClass().getName(),this.name, this.armor, this.damag,this.hpL,this.lvl,this.maxDamag,this.maxHp,this.speed );
            
    }    
   
    public void step() {
        
        
    }
    public int compareTo(Object o){
        BaseUnit baseUnit = (BaseUnit)o;
        return this.speed-baseUnit.speed;
        
    }




    public int getHp() {
        return 0;
    }

}
