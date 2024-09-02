public class reverse {
        public static void main(String[] args) {
            int [] arr={1,4,7,2};
            int temp;
            int n = arr.length;
            for(int i =0; i<n-2; i++) {
         
            temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
            }
            System.out.println("Reversed Array:");  
          for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
          }
            
         
         }
       
    
}
