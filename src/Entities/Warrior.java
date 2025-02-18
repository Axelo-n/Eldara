package Entities;

public class Warrior extends Entity{

    public Warrior(String name) {
        super(1500, 400, 250, 100, name);
    }

    @Override
    public void takeDamage(int damage){
        if(isDefending){
            this.HP = this.HP - (damage - this.Def - 20);
            this.isDefending = false;
        }
        else {
            this.HP = this.HP - (damage - this.Def);
        }

        //Passive Skill: Berserk
        if(HP < (HP*20/100)){
            Atk += 100;
            Def += 50;
        }

        if(HP < 0) HP = 0;
    }

    //Active skill 1
    public void powerSlash(Entity target){
        target.takeDamage((int)(1.5*Atk));
        MP -= 120;
    }

    //Active Skill 2
    public void shieldBash(Entity target){
        target.takeDamage((int)(0.8*Atk));
        target.stun();
        MP -= 80;
    }
}
