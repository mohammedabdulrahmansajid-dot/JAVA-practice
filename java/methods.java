public class methods {
    // static int basis(int x, int y){
    //     int z;
    //     if(x>y){
    //         z = x+y;
    //     }
    //     else{
    //         z = x-y; 
    //     }
    //     return z;
    // }
    //     public static void main(String[] args){
    //         int a = 34;
    //         int b = 90;
    //        int c = basis(a , b);
    //        System.out.println(c);

    // Without Static method:

  int basis(int x, int y){
     int z;
         if(x>y){
             z = x+y;
         }
        else{
            z = x-y; 
        }
        return z;
    }
        public static void main(String[] args){
            int a = 34;
            int b = 90;
            int c;
            methods obj = new methods();
            c = obj.basis(a , b);
           System.out.println(c);

    
        }
    }
    
    
    

