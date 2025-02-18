package Entities;

public class Entity {
    protected String name;
    protected int HP;
    protected int MP;
    protected int Atk;
    protected int Def;
    protected boolean isDefending = false;
    protected boolean isStunned = false;

    public Entity(int HP, int MP, int atk, int def, String name) {
        this.HP = HP;
        this.MP = MP;
        this.Atk = atk;
        this.Def = def;
        this.name = name;
    }

    public void takeDamage(int damage){
        if(isDefending){
            this.HP = this.HP - (damage - this.Def - 20);
            this.isDefending = false;
        }
        else {
            this.HP = this.HP - (damage - this.Def);
        }
        if(HP < 0) HP = 0;
    }

    public void stun(){
        isStunned = true;
    }

    public void attack(Entity target){
        target.takeDamage(Atk);
    }

    public void defend(){
        this.isDefending = true;
    }
}
