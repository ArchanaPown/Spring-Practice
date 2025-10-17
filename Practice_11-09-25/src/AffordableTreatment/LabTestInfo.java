package AffordableTreatment;

import java.util.*;

public class LabTestInfo {
    List<String> testList=new ArrayList<>();
    void addTestDetails(String testDetails){
        testList.add(testDetails);
        System.out.println(testList);
    }List<String> treatments=new ArrayList<>();
    List<String> getTestsWithinGivenCostRange(int minimumCost,int maximumCost){
        for(String temp:testList){
            String[] s=temp.split(":");
            int price=Integer.parseInt(s[1]);
            if(price>minimumCost && price<maximumCost){
                treatments.add(s[0]);
            }
        }
        return treatments;
    }
}
