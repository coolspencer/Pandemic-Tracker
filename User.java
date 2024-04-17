public class User {
    String userName;
    String pincode;
    String userPhone;
    SelfAssessment selfAssessment;
    RiskCalculator riskCalculator;

    public User(String userName, String pincode, String userPhone) {
        this.userName = userName;
        this.pincode = pincode;
        this.userPhone = userPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public SelfAssessment getSelfAssessment() {
        return selfAssessment;
    }

    public void setSelfAssessment(SelfAssessment selfAssessment) {
        this.selfAssessment = selfAssessment;
    }

    public RiskCalculator getRiskCalculator() {
        return riskCalculator;
    }

    public void setRiskCalculator(RiskCalculator riskCalculator) {
        this.riskCalculator = riskCalculator;
    }

}