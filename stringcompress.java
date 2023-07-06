import java.util.*;
public class stringcompress{
    public static String compress(String str){
        String newstr="";//New string
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1&& str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;

            }
            newstr+=str.charAt(i);
            if(count>1){
                newstr+=count.toString();
            }
        }
        return newstr;
    }
    public static void main(String args[]){
        String str="aaabbbbbcccccccccccddd";
        System.out.println(compress(str));
    }
}