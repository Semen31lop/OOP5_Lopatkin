package Unit;



public class Monax extends Shooter{

    public Monax(int x, int y,String name ) {
        super(y, y, team, name, 15, 170, 3, 0, 0, 5, 1,0,0);
        
    }
    
    public String toString() {
        
        return name;
    }
    @Override
    public String getInfo() {
        return String.format("%s,name-%s , armor-%s , damag- %s , hpL-%s , lvl-%s , maxDamag-%s , maxHp-%s , spped-%s",
        this.getClass().getName(),this.name, this.armor, this.damag,this.hpL,this.lvl,this.maxDamag,this.maxHp,this.speed );
    }
    @Override
    public void step() {
        int index_damag=0;
        for (int i = 0; i < team.size(); i++) {
            for (int j = i+1; j < team.size()-1; j++) {
                if (team.get(i).hpL!=0||team.get(j).hpL!=0) {
                    if(team.get(i).hpL/team.get(i).maxHp<team.get(j).hpL/team.get(j).maxHp){
                        index_damag=i;
                    }
                }
                
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
