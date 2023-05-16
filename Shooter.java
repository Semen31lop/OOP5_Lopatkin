package Unit;

import java.util.ArrayList;

public class Shooter extends BaseUnit{

    public Shooter(int x, int y,ArrayList<BaseUnit> team , String name, int hpL , int maxHp,int lvl, int damag, int maxDamag , int armor, int speed,int arrows,int accuracy) {
        super(x, y,team,name, hpL, maxHp, lvl, damag, maxDamag, armor, speed,arrows,accuracy );
        
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
    public void step (ArrayList<BaseUnit> enemyTeam) {
        if (maxHp < 1 || arrows < 1) return;
        double min =Integer.MAX_VALUE;

        int index_closedEnemy =0;
        
        
        for (int i = 0; i < enemyTeam.size(); i++) {
            double temp = this.coordinat.distanceSearch(enemyTeam.get(i).coordinat);
            if (temp<min){
                index_closedEnemy =i;
                min = temp;
            }
        }
        
    }



    void healing(){

    }
    void protection(){

    }
    void attack(){
    }




    @Override
    public void spep(ArrayList<BaseUnit> maga) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'spep'");
    }

   
   }
    
