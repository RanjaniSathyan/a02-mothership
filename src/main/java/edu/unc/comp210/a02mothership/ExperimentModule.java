package edu.unc.comp210.a02mothership;

public class ExperimentModule extends AModule {
    String experimentName;
    double[] parameters;
    double result;
    boolean hasRun;

    public ExperimentModule(String experimentName, double[] parameters){
        super("Experiment Module");
        this.experimentName = experimentName;
        this.parameters = parameters;
        this.hasRun = false;
        this.result = 0;
    }

    public void runExperiment(){
        for (double parameter: this.parameters) {
            this.result += (parameter * Math.random());
        }
        this.hasRun = true;
        }


    public String getSummary(){
        if (hasRun){
            return "Experiment '" + experimentName + "' result: " + result;
        } else {return "Experiment not run yet.";
        }
    }

    @Override
    public void statusReport(String moduleStatus, boolean isSuccessful){
        if (hasRun){
            System.out.println("ExperimentModule: " + this.experimentName + " completed.");
        } else {
            System.out.println("ExperimentModule: " + this.experimentName + " pending.");
        }
        super.statusReport(moduleStatus, isSuccessful);
    }

}
