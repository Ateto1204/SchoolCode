package ntou.cs.java2024;

public class NormalWeapon extends Weapon {

    public NormalWeapon(double offense, double defense) {
        super(offense, defense);
    }
    
    @Override
    public double attack() {
        int atk = (int)getOffense();
        System.out.printf("[NormalWeapon可造成 %d 點的傷害]%n", atk);
        return atk;
    }

    @Override
    public double defend() {
        int def = (int)getDefense();
        System.out.printf("[NormalWeapon可抵擋 %d 點的傷害]%n", def);
        return def;
    }
}
