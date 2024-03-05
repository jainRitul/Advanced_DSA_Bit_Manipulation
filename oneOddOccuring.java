import java.util.*;
import java.util.Map.Entry;

class oneOddOccuring {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,4,5,5,3,2,3,3};
        System.out.println(oneOddOccuringInArrHashMap(arr));
        System.out.println(naiveApprocah(arr));
        System.out.println(efficientApprocahBitWise(arr));
    }
    static int efficientApprocahBitWise(int arr[]){
       int res = 0;
       for(int i=0;i<arr.length;i++){
          res ^= arr[i];
       }return res;
    }
    static int naiveApprocah(int arr[]){
        for(int i =0;i<arr.length;i++){
            int count =0;
            for(int j=0;j<arr.length;j++)
                if(arr[i] == arr[j])
                 count ++;
            
            if(count % 2 != 0) 
              return arr[i];
        }
        return -1;
    }
    static int oneOddOccuringInArrHashMap(int arr[]){
        HashMap<Integer,Integer>hm = new HashMap<>();
        int ans = 0; 
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
       
        for(Entry<Integer, Integer> m : hm.entrySet())
        {
            if(m.getValue() % 2 != 0) 
              ans =  m.getKey();
        }
        return ans;
    }

    
}
