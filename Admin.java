import java.util.*;

public class Admin {
    HashMap<User, Boolean> userMap = new HashMap<>();
    String name, phoneNumber;

    public Admin(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public User registerUser(String userName, String pincode, String userPhone) {
        User u1 = new User(userName, pincode, userPhone);
        userMap.put(u1, false);
        System.out.println(userName + " is successfully registered");
        return u1;
    }

    public void addSelfAssesment(User u, List<Symptoms> symptomsList, boolean travelHistory,
            boolean contactWithPatient) {
        System.out.println(u.getUserName() + "," + " has mobile number : " +
                u.getUserPhone() + " is from " + u.getPincode());
        if (symptomsList == null) {
            symptomsList = new ArrayList<>();
        }
        SelfAssessment selfAssessment = new SelfAssessment(symptomsList, travelHistory, contactWithPatient);
        u.setSelfAssessment(selfAssessment);
        RiskCalculator r = new RiskCalculator(selfAssessment);
        u.setRiskCalculator(r);
        System.out.println("\n");
    }

    public void getStatusOfPatient(String phoneNumber) {
        for (User u : userMap.keySet()) {
            if (u.getUserPhone().equals(phoneNumber)) {
                System.out.println(userMap.get(u));
                return;
            }
        }
    }

    public void markStatueOfPatient(String phoneNumber, String recovered) {
        for (User u : userMap.keySet()) {
            if (u.getUserPhone().equals(phoneNumber)) {
                if (u.getSelfAssessment() == null) {
                    userMap.put(u, false);
                    System.out.println(u.getUserName() + "," + " has mobile number : " +
                            u.getUserPhone() + " is from " + u.getPincode()
                            + " do not have any assessment history, so he is not infected");
                    return;
                }
                if (recovered.equals("Y")) {
                    userMap.put(u, false);
                    u.selfAssessment = null;
                    u.setRiskCalculator(null);
                    System.out
                            .println(u.getUserName() + "," + "has mobile number : " + u.getUserPhone() + " is from "
                                    + u.getPincode() + " has been recovered");
                    return;
                } else {
                    userMap.put(u, true);
                    System.out.println(u.getUserName() + "," + "has mobile number : " + u.getUserPhone() + "is from "
                            + u.getPincode() + " is covid positive");
                    return;
                }
            }
        }
    }

}
