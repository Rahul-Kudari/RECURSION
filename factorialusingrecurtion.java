
public class factorialusingrecurtion{
public static void  clcfact(int n,int fact){
    if(n==0){
        System.out.println(fact);
        return;
    }
    else{
       fact*=n; 
       clcfact(n-1,fact);
        
    }
}
    public static void main(String[] args){
        clcfact(5, 1);
    }
}

