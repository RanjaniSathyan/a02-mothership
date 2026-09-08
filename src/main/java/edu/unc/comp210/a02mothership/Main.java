package edu.unc.comp210.a02mothership;

public class Main {
    public static void main(String[] args) {
        APowerGenerator generator = new SolarGenerator();
        ThrusterModule thruster = new ThrusterModule();
        double[] parameters = {2.0, 2.0, 3.0};
        ExperimentModule experiment = new ExperimentModule("First Test", parameters);
        WaterModule water = new WaterModule(50);
        Mothership ship = new Mothership(generator, thruster, experiment, water);

        int power = ship.requestPower();
        System.out.println("Power has been requested: " + power);

        boolean fired = ship.fireThruster(power);
        System.out.println("Thruster fired: " + fired);

        ship.runExperiment();

        String summary = ship.getExperimentSummary();
        System.out.println(summary);

        ship.printStatusReports();
    }
}
