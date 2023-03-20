package StringClass;

public class StringClass {
    /**
     * @param arg
     */
    public static void main(String arg[]){
        String str1="Mr.Vishal Vishwakarma";
        // System.out.println(str1.startsWith("Mr."));
        //It will return true
        // System.out.println(str1.startsWith("rr."));
        //It will return false
        System.out.println(str1.startsWith("Vish",3));
        //It will return true
        System.out.println(str1.charAt(4));
        //It will return "i";
        for(int i=0;i<=str1.length();i++){
          System.out.println(str1.charAt(i));
        }
    }
    
}
