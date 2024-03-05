import java.util.*;
class TwoOddOccuering {
    public static void main(String[] args) {
        int arr[]={2,3,3,4,4,4,4,5};
        findOddOccueringHashMap(arr);
        findOddOccueringBitwise(arr);
    }
    static void findOddOccueringBitwise(int arr[]){
          int x = arr[0];
          for(int i=1;i<arr.length;i++){
            x ^= arr[i];
          }

          int k = (x & (~(x-1)));

          int res1 = 0,res2=0;
          for(int i=0;i<arr.length;i++){
            if((arr[i] & k) !=0)
              res1 ^= arr[i];
            else
              res2 ^= arr[i];   
          }System.out.println(res1 + " "+ res2);
    }
    static void findOddOccueringHashMap(int arr[]){
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i] , hm.getOrDefault(arr[i],0)+1);
        }

        for(Integer a : hm.keySet()){
            if(hm.get(a) % 2 != 0){
                System.out.println(a);
            }
        }
    }
}
