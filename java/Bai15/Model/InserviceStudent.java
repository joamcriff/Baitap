package Bai15.Model;

import java.util.Set;

public class InserviceStudent extends InformationStudent{
    public InserviceStudent(String id, String name, String dOB, int year, int entryPoint,String department , Set<ListOutcome> listOutcomes, String trainingLocation) {
        super(id, name, dOB, year, entryPoint,department ,listOutcomes);
        this.trainingLocation = trainingLocation;
    }

    public String getTrainingLocation() {
        return trainingLocation;
    }

    public void setTrainingLocation(String trainingLocation) {
        this.trainingLocation = trainingLocation;
    }

    private String trainingLocation;

}
