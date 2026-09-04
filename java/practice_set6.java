public class practice_set6 {
    public static void main(String[] args){
        // problem 6:
//     int[] arr = {13, 234, 34, 4, 23};
//     int max = 0;
//     for(int i = 0; i<arr.length; i++){
//         if(arr[i]>max){
//             max = arr[i];
//         }
//     }         
// System.out.println("The maximum value in the array is "+ max);

      // problem 7:
    
// int [] data = {79,90,8,87,7};
// int min = Integer.MAX_VALUE;
// for(int i: data){
//     if(i<min){
//         min = i;
//     }
// }    

// System.out.println("The minimum value in the array is "+ min);

    // problem 8:

int [] arr = {2,3,4,5,6,9,90};
boolean sorted = true;
for(int i = 0; i<arr.length-1; i++){
if(arr[i]>arr[i+1]){
    sorted = false;
    break;
}}
if(sorted == false){
    System.out.println("The Array is not sorted");}
else{
    System.out.println("The Array is sorted");
}















    }
}
