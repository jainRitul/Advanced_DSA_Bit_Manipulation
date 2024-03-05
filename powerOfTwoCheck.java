class powerOfTwoCheck {
    public static void main(String[] args) {
        int n = 126;
        System.out.println(checkPowerOfTwoOrNot(n));
    }
    static boolean checkPowerOfTwoOrNot(int n){
      if(n==0) return false;
       if((n & (n-1)) == 0) 
          return true;
        else return false;   
       
    }
}
