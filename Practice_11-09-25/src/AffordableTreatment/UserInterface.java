package AffordableTreatment;

import java.util.*;

public class UserInterface {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lab test details to be added");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter lab test details");
        LabTestInfo obj=new LabTestInfo();
        for(int i=0;i<n;i++){
            String str=sc.nextLine();
            obj.addTestDetails(str);
            //sc.nextLine();
        }System.out.println("Enter the minimum cost");
        int minimumCost=sc.nextInt();
        System.out.println("Enter the maximum cost");
        int maximumCost=sc.nextInt();
        List<String> result=obj.getTestsWithinGivenCostRange(minimumCost,maximumCost);
        if(result.isEmpty()){
            System.out.println("No Tests found within the specified cost range");
            return;
        }for(String treatment:result){
            System.out.println(treatment);
        }
    }

}
