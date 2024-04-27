package ntou.cs.java2024;

public class PowerWeapon extends Weapon {

    public PowerWeapon(double offense, double defense) {
        super(offense, defense);
    }
    
    @Override
    public double attack() {
        int atk = (int)getOffense() * 6 / 5;
        System.out.printf("[PowerWeapon可造成 %d 點的傷害]%n", atk);
        return atk;
    }

    @Override
    public double defend() {
        int def = (int)getDefense();
        System.out.printf("[PowerWeapon可抵擋 %d 點的傷害]%n", def);
        return def;
    }
}
