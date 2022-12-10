package GroupStudy;

import java.util.Random;

public class Fighter {
    public String name;
    public int health;
    public int damagePerAttack;

    public int damage;



    public void SetInfo(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }


    public String toString() {
        return "Fighter{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damagePerAttack=" + damagePerAttack +
                '}';
    }
}

