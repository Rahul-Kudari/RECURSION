public class realnumbers{}
public static void printNumber(int n){
    if(n<0){
        System.out.println("enter positive number");
        return;
    }else
    {
      
        System.out.println(n);
       printNumber(n-1);
    }
    }
   

    public static void main(String[] args){
        
        printNumber(5);

    }

