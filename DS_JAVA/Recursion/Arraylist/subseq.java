import java.util.*;

public class subseq{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        ArrayList<String> s = gss(str);

        System.out.print(s);
    }

    public static ArrayList<String> gss(String str){

        if(str.length()==0)
        {
            ArrayList<String> dsr = new ArrayList<>();
           String t = "" ;
            dsr.add(t);
            return dsr;
        }

        char ch = str.charAt(0);     
 
        String s = str.substring(1);    

        ArrayList<String> is = gss(s);  
        ArrayList<String> ns = new ArrayList<>();  

        for(String cs : is){
            ns.add("-"+cs);     
        }
        for(String cs: is){
            ns.add(ch + cs);    
        }

        return ns;             

    }
}