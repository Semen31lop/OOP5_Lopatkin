package Unit;

import java.util.ArrayList;

public class Sniper extends Shooter{

    public Sniper(int x, int y,String name) {
        super( x, y,team, name, 0, 120, 2, 40, 100, 2, 2,0,0 );
      
    }
    
    public String toString() {
        
        return name;
    }
    @Override
    public String getInfo() {
        return String.format("%s,name-%s , armor-%s , damag- %s , hpL-%s , lvl-%s , maxDamag-%s , maxHp-%s , spped-%s,",
        this.getClass().getName(),this.name, this.armor, this.damag,this.hpL,this.lvl,this.maxDamag,this.maxHp,this.speed );
    }


    public void spep(ArrayList<BaseUnit> enemyTeam) {
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
}
