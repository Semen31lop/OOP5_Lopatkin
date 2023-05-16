package Unit;

public class Vor extends Shooter  {

    public Vor(int  x, int y,String name)
     {
        super(x, y,team, name,  0, 120, 2, 40, 100, 2, 3, 0, 0 );
    }

    public String toString() {
        
        return name;
    }
     @Override
     public String getInfo() {
        return String.format("%s,name-%s , armor-%s , damag- %s , hpL-%s , lvl-%s , maxDamag-%s , maxHp-%s , spped-%s,",
        this.getClass().getName(),this.name, this.armor, this.damag,this.hpL,this.lvl,this.maxDamag,this.maxHp,this.speed );

     }
     @Override
     public void step() {
         
         super.step();
     }

    void healing(){

    }
    void protection(){

    }
    void attack(){
        
    }
   
}
