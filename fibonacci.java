
public class fibbanoci 
 {
    public static void fibonnaci(int n,int a,int b){
if(n==0){
    return;
    
}
else{
    int c=a+b;
   
    System.out.println(c);
    fibonnaci(n-1, b, c);


    
}
    }

public static void main(String[] args){
   fibonnaci(5, 0, 1);
   
}
}

