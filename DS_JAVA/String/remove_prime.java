import java.io.*;
import java.util.*;

public class remove_prime {

    public static boolean isprime(int n)
    {
        boolean isprime = true;
        for(int i=2; i*i<=n; i++)
        {
            if(n%i==0)
            {
                isprime = false;
                break;
            }
        }
        return isprime;
    }

	public static void solution(ArrayList<Integer> al){
        for(int i=0; i<al.size(); i++)
        {
            int a = al.get(i);
            boolean t = isprime(a);
            if(t==true){
                a1.remove(i);
                i--;
            }
        }
		// write your code here
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}