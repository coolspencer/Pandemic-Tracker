public class RiskCalculator {
    SelfAssessment selfAssessment;
    int infectedPercentage = 0;

    public RiskCalculator(SelfAssessment selfAssessment) {
        this.selfAssessment = selfAssessment;
        calculateRisk();
    }

    public void calculateRisk() {
        if (selfAssessment == null)
            return;
        if (selfAssessment.symptomsList.size() == 0 && selfAssessment.contactWithPatient == false
                && selfAssessment.travelHistory == false) {
            this.infectedPercentage = 5;
            System.out.println("There is 5% chances that you are covid positive");
            return;

        }
        if (selfAssessment.symptomsList.size() != 0 && selfAssessment.contactWithPatient == true
                && selfAssessment.travelHistory == true) {

            this.infectedPercentage = 95;
            System.out.println("There is 95% chances that you are covid positive");
            return;
        } else if ((selfAssessment.symptomsList.size() != 0 && selfAssessment.contactWithPatient == true) ||
                (selfAssessment.symptomsList.size() != 0 && selfAssessment.travelHistory == true) ||
                (selfAssessment.contactWithPatient == true && selfAssessment.travelHistory == true)) {

            this.infectedPercentage = 75;
            System.out.println("There is 75% chances that you are covid positive");
            return;
        } else if (selfAssessment.symptomsList.size() != 0 || selfAssessment.contactWithPatient == true
                || selfAssessment.travelHistory == true) {

            this.infectedPercentage = 50;
            System.out.println("There is 50% chances that you are covid positive");
            return;
        }
    }

}
