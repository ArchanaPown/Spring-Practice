import java.util.*;
public class BookCodes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringBuilder result=new StringBuilder();
        int n=sc.nextInt();
        char ch=sc.next().charAt(0);
        //Have only chars
        input=input.replaceAll("[^a-zA-Z]","").toUpperCase();
        if(input.isEmpty() || n<=0 || n>input.length()){
            System.out.println("Invalid input");
            return;
        }StringBuilder sb=new StringBuilder();
        int len=input.length();
        int start=len;
        while(start>0){
            int end=start;
            start=Math.max(0,start-n);
            String part=input.substring(start,end);
            sb.insert(0,part+ch);
        }String results=sb.substring(0,sb.length()-1);
        System.out.println(results);
    }
}
