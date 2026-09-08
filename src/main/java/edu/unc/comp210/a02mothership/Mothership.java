package edu.unc.comp210.a02mothership;
import java.util.ArrayList;

public class Mothership {
    //create private instances of APowerGenerator, ThrusterModule, experimentModule and Arraylist of AModule
    private APowerGenerator powerGenerator;
    private ThrusterModule thrusterModule;
    private ExperimentModule experimentModule;
    private WaterModule waterModule;
    private ArrayList<AModule> shipModules;

    public Mothership(APowerGenerator powerGenerator, ThrusterModule thrusterModule, ExperimentModule experimentModule) {
        this.powerGenerator = powerGenerator;
        this.thrusterModule = thrusterModule;
        this.experimentModule = experimentModule;
        this.shipModules = new ArrayList<AModule>();
        shipModules.add(powerGenerator);
        shipModules.add(thrusterModule);
        shipModules.add(experimentModule);
    }

    public Mothership(APowerGenerator powerGenerator, ThrusterModule thrusterModule, ExperimentModule experimentModule, AModule extraModule) {
        this(powerGenerator, thrusterModule, experimentModule);
        shipModules.add(extraModule);
    }

    public int requestPower() {
        return powerGenerator.generatePower();
    }

    public boolean fireThruster(int availablePower) {
        return thrusterModule.thrust(availablePower);
    }

    public void runExperiment() {
        experimentModule.runExperiment();
    }

    public String getExperimentSummary() {
        return experimentModule.getSummary();
    }

    public void printStatusReports() {
        for (AModule module : this.shipModules) {
            module.statusReport("Normal", true);
        }
    }
}
