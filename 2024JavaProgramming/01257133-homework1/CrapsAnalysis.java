package ntou.cs.java2024;

public class CrapsAnalysis {
    private double winTotal;
    private double runTotal;

    public CrapsAnalysis(double winTotal, double runTotal) {
        this.winTotal = winTotal;
        this.runTotal = runTotal;
    }

    public void output() {
        System.out.printf("%nThe chances of winning are %d / 1000 = %.2f%%%n", (int)winTotal, winTotal / 10);
        runTotal /= 1000;
        System.out.printf("The average game length is %.2f rolls.%n", runTotal);
    }
}
