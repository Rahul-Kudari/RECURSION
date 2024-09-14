public class printxn {
    public static int Clcpowern(int x,int n){
       
       if(n==0){
        return 1;
       }
        if(x==0){
            return 0;
        }
       
             int x_=Clcpowern(x,n-1);
             int xn=x*x_;
             return xn;
        

        }
        public static void main(String[] args){
           int pri= Clcpowern(7, 2);
           System.out.println(pri);
        }
    }

    
    

