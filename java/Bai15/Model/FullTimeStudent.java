package Bai15.Model;

import java.util.Set;

public class FullTimeStudent extends InformationStudent{


    public FullTimeStudent(String id, String name, String dOB, int year, int entryPoint, String department ,Set<ListOutcome> listOutcomes) {
        super(id, name, dOB, year, entryPoint,department ,listOutcomes);
    }
}
