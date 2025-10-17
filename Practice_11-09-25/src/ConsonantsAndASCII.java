public class ConsonantsAndASCII {
    public static void main(String[] args) {
        String s="Java Code";
        String str=s;
        s=s.toLowerCase();
        String result="";
        int value=1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!"aeiou\s".contains(String.valueOf(ch))){
                result+=ch;
                int temp=ch;
                value*=temp;
            }else if(!Character.isLetter(ch) && ch!=' '){
                System.out.println(str+" is an invalid sentence");
                return;
            }
        }if(value==1){
            System.out.println("No consonants present in the sentence");
            return;
        }
        System.out.println("The output string is "+result+""+value);
    }
}
