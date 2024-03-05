class checkKthBit {
    public static void main(String[] args) {
        
    
    int n = 9;
    int k = 5;
    boolean ans = methodThree(n,k);

    System.out.println(ans);
   }
   static boolean checkKthBitSetOrNot(int n,int k){
          int x = 1;
          for(int i = 0;i<(k-1);i++)
            x = x*2;

          if((n & x )!= 0){
              return true;
          }  
          return false;
   }
   static boolean methodtwo(int n,int k){
       
       for(int i = 0;i<(k-1);i++)
         n = n/2;

       if((n & 1)!= 0){
           return true;
       }  
       return false;
   }
   static boolean methodThree(int n,int k){
       
       int x= 1 << k-1;
       if(( n & x)!= 0){
           return true;
       }  
       return false;
   }
}

