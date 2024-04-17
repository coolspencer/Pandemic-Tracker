import java.util.*;

public class SelfAssessment {
    List<Symptoms> symptomsList;
    boolean travelHistory;
    boolean contactWithPatient;

    public SelfAssessment(List<Symptoms> symptomsList, boolean travelHistory, boolean contactWithPatient) {
        this.symptomsList = symptomsList;
        this.travelHistory = travelHistory;
        this.contactWithPatient = contactWithPatient;
    }

    public List<Symptoms> getSymptomsList() {
        return symptomsList;
    }

    public boolean isTravelHistory() {
        return travelHistory;
    }

    public boolean isContactWithPatient() {
        return contactWithPatient;
    }

    public void setSymptomsList(List<Symptoms> symptomsList) {
        this.symptomsList = symptomsList;
    }

    public void setTravelHistory(boolean travelHistory) {
        this.travelHistory = travelHistory;
    }

    public void setContactWithPatient(boolean contactWithPatient) {
        this.contactWithPatient = contactWithPatient;
    }

}
