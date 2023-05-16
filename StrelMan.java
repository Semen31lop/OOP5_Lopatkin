package Unit;
import java.util.ArrayList;
import java.util.Random;
public class StrelMan extends Shooter{

    private int damage;
    public StrelMan(int  x, int y,String name) {
        super(x, y,team, name,  0, 100, 2, 30, 50, 2, 2, 10, 3 );
        
    }
    @Override
    public String toString() {
        
        return name;
    }
    @Override
    public String getInfo() {
       
        return String.format("%s,name-%s , armor-%s , damag- %s , hpL-%s , lvl-%s , maxDamag-%s , maxHp-%s , spped-%s, arrows-%s , accuracy-%s",
        this.getClass().getName(),this.name, this.armor, this.damag,this.hpL,this.lvl,this.maxDamag,this.maxHp,this.speed,this.arrows,this.accuracy );
    }
    @Override
    public void step(ArrayList<BaseUnit> enemyTeam) {
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
