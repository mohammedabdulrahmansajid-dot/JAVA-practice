public class practice_set6cont{
    public static void main(String[] args){
    // int [] [] mat1 = {{2 , 4 , 6},
    //                   {9 , 1 , 7}};
    
    // int [] [] mat2 = {{8 , 0 , 4},
    //                  {91 , 5 , 5}};

    // int [] [] result = {{0 , 0 , 0},
    //                     {0 , 0 , 0}}; 

    // for(int i = 0; i<mat1.length; i++){
    //     for(int j = 0; j<mat2[i].length; j++){
    //         result[i] [j] = mat1[i] [j] + mat2[i] [j]; 
    //         System.out.print(result[i][j]);
    //         System.out.print(" ");

    //     }
    //     System.out.println("");
    // }           
      
    // PROBLEM 5: 
    // int [] data = {98, 74, 656, 938, 03,};
    // for(int i = data.length-1; i>=0; i--){
    //     System.out.print(data[i]);
    //     System.out.print(" ");
        
    // }  
    // Other Important Method For reversing:
    int[] arr = {12 , 87 , 9 , 1 , 34};
    int l = arr.length;
    int n = Math.floorDiv(l , 2);
    int temp;
    for(int i = 0; i<n; i++){
        temp = arr[i];
        arr[i] = arr[l-1-i];
        arr[l-1-i] = temp;}
        for(int j = 0; j<arr.length; j++){
            System.out.print(arr[j]);
            System.out.print(" ");}
        


    











    }
}