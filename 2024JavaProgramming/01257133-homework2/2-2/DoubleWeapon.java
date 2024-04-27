package ntou.cs.java2024;

import java.security.SecureRandom;

public class DoubleWeapon extends Weapon {

    private SecureRandom random = new SecureRandom();
    private final int K = 5;
    public DoubleWeapon(double offense, double defense) {
        super(offense, defense);
    }
    
    @Override
    public double attack() {
        int seed = random.nextInt(K);
        int atk;
        if (seed == 1) {
            atk = (int)getOffense()*2;
        } else {
            atk = (int)getOffense();
        }
        System.out.printf("[DoubleWeapon可造成 %d 點的傷害]%n", atk);
        return atk;
    }

    @Override
    public double defend() {
        int def = (int)getDefense();
        System.out.printf("[DoubleWeapon可抵擋 %d 點的傷害]%n", def);
        return def;
    }
}
