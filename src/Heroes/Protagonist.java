package Heroes;

public class Protagonist {
    private String name;
    private int HP;
    private int MP;
    private int Atk;
    private int Def;
    private boolean isDefending = false;

    public Protagonist(int HP, int MP, int atk, int def, String name) {
        this.HP = HP;
        this.MP = MP;
        this.Atk = atk;
        this.Def = def;
        this.name = name;
    }

    public void takeDamage(int damage){
        if(isDefending){
            this.HP = this.HP - (damage - this.Def)/2;
            this.isDefending = false;
        }
        else {
            this.HP = this.HP - (damage - this.Def);
        }
    }

    public void defend(){
        this.isDefending = true;
    }
}
