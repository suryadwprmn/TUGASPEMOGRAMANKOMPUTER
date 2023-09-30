package Latihan;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Naruto",100,7000);
        HeroStrength heroStrength = new HeroStrength("Sasuke",170,5600);


        hero1.display();
        System.out.println("==================");
        heroStrength.display();
        hero1.TakeDamage(heroStrength);
        heroStrength.display();



    }
}
