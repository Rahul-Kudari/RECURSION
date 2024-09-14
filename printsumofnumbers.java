public class printsumofnumbers{
    public static void printsum(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }else{
           sum=+n;
            printsum(n-1,sum);
            
        }
    

        
        
    }
    public static void main(String[] args){
   
    
        printsum(5,0);
    }
}