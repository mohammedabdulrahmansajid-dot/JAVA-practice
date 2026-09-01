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
        


    
