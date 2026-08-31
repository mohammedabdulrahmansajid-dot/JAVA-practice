public class pre_questions {
    public static void main(String[] args){
    String [] [] names = new String [2] [3];
    names[0] [0] = "Harry";
    names[0] [1] = "Mars";
    names[0] [2] = "Ali";
    names[1] [0] = "Virat";
    names[1] [1] = "Owais";
    names[1] [2] = "Khasanov";

    for(int i = 0; i< names.length; i++){
        for(int j = 0; j<names[i].length; j++){

        System.out.print(names[i][j]);
        System.out.print(" ");
        }
       System.out.println("");
    }









    }
}
