// public class numberinloops {

//     void number(){
//         // for(int i =1; i <=5;i++){
//         //     for(int j=1; j<=5;j++){
//         //         System.out.print(j +" ");
//         //     }
//         //     System.out.println();
//         // }
//         int i , j;
//         i=1 ; 
//         do{
//             j=1;
//             do{
//                 System.out.print(j +" ");
//                 j++;
//             }
//             while(j<=5);
//             System.out.println();
//             i++;

//         }
//         while(i<=5);
//     }
//     public static  void main(String[] args){
//         numberinloops obj = new numberinloops() ;
//           obj.number();
//     }
// }

public class numberinloops {
    public static void main(String[] args){
        int w , d;

        for(w =1 ; w<=3; w++){
            System.out.println("week is "+ w);
            for( d=1; d<=7;d++){
                System.out.println("Day is "+ d);
            }
            System.out.println();
        }
    }
}