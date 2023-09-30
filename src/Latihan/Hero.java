package Latihan;

public class Hero {
     private String name;
     double attackPower;
    double health;


    public Hero(String name, double attackPower, double health) {
        this.name = name;
        this.attackPower = attackPower;
        this.health = health;
    }

    void display(){
        System.out.println("Name Hero : " + this.name);
        System.out.println("Health : " + this.health);
        System.out.println("Attack : " + this.attackPower);
    }

    void TakeDamage(Hero enemy){
        System.out.println( this.name + " attack " + enemy.name);

        enemy.ReceiveDamage(this.attackPower);

    }

    void ReceiveDamage(double damage){

        System.out.println(this.name + " menerima damage sebesar "+ damage);
        health -= damage;
        System.out.println("Sisa Power");
    }
}
