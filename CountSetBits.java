
/**
 * CountSetBits
 */
class CountSetBits {
   static int tbl[]= new int[256];
   public static void main(String[] args) {
    initalize();
    int n  = 7;
    int ans = countSet(n);
    System.out.println(ans);
   }
   static int countSet(int n){
      return tbl[n & 255]
       + tbl[(n>>8) & 255] 
       + tbl[(n>>16) & 255]
        + tbl[(n>>24)];
   }
   static void initalize(){
       tbl[0] = 0;
       for(int i=1;i<256;i++){
         tbl[i] = tbl[i & (i-1)] +1;
       }

   }
    
}