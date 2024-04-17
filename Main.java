import java.util.*;

public class Main {
    static List<Admin> adminList = new ArrayList<>();

    public static void main(String[] args) {
        Admin ram = new Admin("Rishab Agarwal", "12344");
        adminList.add(ram);
        User u1 = ram.registerUser("Simmy", "500", "12345");
        List<Symptoms> s1 = new ArrayList<>();
        s1.add(Symptoms.COUGH);
        s1.add(Symptoms.FEVER);
        s1.add(Symptoms.HEADACHE);

        User u2 = ram.registerUser("Sujan", "500", "12346");
        List<Symptoms> s2 = new ArrayList<>();
        s2.add(Symptoms.COUGH);

        User u3 = ram.registerUser("Sanskriti", "500", "12347");

        User u4 = ram.registerUser("Akansha", "500", "12348");
        User u5 = ram.registerUser("Subhash", "501", "12349");
        User u6 = ram.registerUser("Sanskar", "501", "12350");
        List<Symptoms> s6 = new ArrayList<>();
        s6.add(Symptoms.COUGH);

        User u7 = ram.registerUser("Sam", "502", "12351");
        User u8 = ram.registerUser("Sooraj", "502", "12352");
        User u9 = ram.registerUser("Sanjana", "502", "12353");
        User u10 = ram.registerUser("ss", "502", "12354");

        System.out.println("===========================================\n\n");
        ram.addSelfAssesment(u1, s1, true, true);
        ram.addSelfAssesment(u2, s2, false, false);
        ram.addSelfAssesment(u3, null, false, false);
        ram.addSelfAssesment(u4, null, false, true);
        ram.addSelfAssesment(u5, null, false, false);
        ram.addSelfAssesment(u6, s6, true, true);
        ram.addSelfAssesment(u7, s1, false, false);
        ram.addSelfAssesment(u8, s1, false, true);
        ram.addSelfAssesment(u9, s1, true, true);
        System.out.println("===========================================\n\n");
        ram.markStatueOfPatient("12345", "Y");
        ram.markStatueOfPatient("12346", "N");
        ram.markStatueOfPatient("12347", "N");
        ram.markStatueOfPatient("12348", "Y");
        ram.markStatueOfPatient("12349", "Y");
        ram.markStatueOfPatient("12350", "N");
        ram.markStatueOfPatient("12351", "N");
        ram.markStatueOfPatient("12352", "Y");
        ram.markStatueOfPatient("12353", "Y");
        System.out.println("===========================================\n\n");
        alertZone();

    }

    public static void alertZone() {
        Map<String, Integer> map = new HashMap<>();
        for (Admin ad : adminList) {
            for (User u : ad.userMap.keySet()) {
                if (ad.userMap.get(u) == true)
                    map.put(u.pincode, map.getOrDefault(u.pincode, 0) + 1);
            }
        }
        for (String pinCode : map.keySet()) {
            System.out.print(pinCode + " pincode and the color is ");
            int value = map.get(pinCode);
            if (value <= 0)
                System.out.println("Green " + value);
            else if (value <= 2)
                System.out.println("Orange " + value);
            else if (value <= 4)
                System.out.println("Red " + value);
        }
    }

}
