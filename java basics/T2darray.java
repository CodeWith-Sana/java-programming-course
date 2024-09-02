public class T2darray {
    public static void main(String[] args){
        int [][] arr = new int[4][4];
        int a =0;
        for(int i=0 ; i< 4 ;i++){
            for(int j=0 ; j<4 ; j++){
                arr[i][j] = a; 
                a++;
            }
        }
        for(int i=0 ; i< 4 ; i++){
            for(int j=0 ; j<4 ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
    
    }
}}
