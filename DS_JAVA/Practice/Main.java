
// str = "24-amazing 7-pepcoders 11-are"

public static String solve(String str){
    String[] arr=str.split(" ");

    Arrays.sort(arr,(String a,String b)->{
        String num1=a.split("-")[0];
        String num2=b.split("-")[0];

        return Integer.parseInt(num1) - Integer.parseInt(num2);
    });

    StringBuilder ans=new StringBuilder();

    for(int i=0; i<arr.length; i++){
        String word=arr[i].split("-")[1];
        ans.append(word);
        ans.append(" ");
    }

    return ans.toString();
}