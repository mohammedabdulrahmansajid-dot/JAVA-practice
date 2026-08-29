public class displaying_arrays{
    public static void main(String[] args){
   int [] marks = {21,56,77,88,90};
//    for(int a = 0; a< marks.length; a++){
//     System.out.println(marks[a]);
//    }

//   for(int a = marks.length-1; a>-1; a--){
//     System.out.println(marks[a]);
//   }
   
   for(int element: marks){
    System.out.println(element);
   }



    }
}