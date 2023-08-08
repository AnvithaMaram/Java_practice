// taking input from the user

// import java.util.Scanner;
// public class practice1 {
//     public static void main(String[] args) {

//         System.out.print("enter some text: "); 
//         Scanner var = new Scanner (System.in) ;
//         System.out.println(var.nextLine()); 
        
//     }
// }



// printing elements of an array

// public class practice1{
//     public static void main(String[] args) {
//     int[] numbers = {1,2,3,4,5};
//     System.out.println(numbers);

//     for (int i =0; i<numbers.length; i++){
//         System.out.print(numbers[i]+ " ") ;
//     }
// }
// }

// taking array input from user

// import java.util.Scanner;

// public class practice1{
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             int size = sc.nextInt();
//         int[] numbers = new int[size];

//         for(int i=0; i<size; i++){
//             numbers[i] = sc.nextInt();
//         }
       
    
//         for (int i =0; i<size; i++){
//             System.out.print(numbers[i]+ " ") ;
//         }
//     }
//     }

// taking array as input from user and finding the element and printing its index

// import java.util.Scanner;

// public class practice1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] numbers = new int[size];

//         for(int i=0; i<size; i++){
//             numbers[i] = sc.nextInt();
//         }

//         System.out.println("Enter the target integer: ") ;
//         int target = sc.nextInt();

//         for(int i=0; i<numbers.length; i++){
//             if(target == numbers[i]){
//                 System.out.println("target found at index: " +i);
//             }
//         }
        
// }
// }

// 1. take an array of names as input from the user and print them
// 2. find the max and min number in an array of integers
// 3. take an array of numbers as input and check if it is an array sorted in ascending order

//1.

// import java.util.Scanner;
// public class practice1{
//     public static void main (String [] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         String [] names = new String [size];

//         for (int i=0; i<size; i++){
//             names[i] = sc.next();
//         }

//         for (int i=0; i<size; i++){
//             System.out.println(names[i] + " ");
//         }
//     }
// }


// 2.

// import java.util.Scanner;

// public class practice1{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[]= new int [size];

//         for (int i=0; i<size; i++){
//             numbers[i]= sc.nextInt();
//         }

//         for(int i=0; i<size; i++){
//             System.out.print(numbers[i] + " ");
//         }

//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;

//         for(int i=0; i<size; i++){
//             if(numbers[i]<min){
//                 min = numbers[i];
//             }
//             if(numbers[i]>max){
//                 max = numbers[i];
//             }
//         }

//         System.out.println("the maximum value in the array is: " + max);
//         System.out.println("the minimum value in the array is: " + min);

//     }
// }

// 3.

import java.util.Scanner;

public class practice1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size]; 

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        boolean is_ascending = true;

        for(int i=0; i<size-1; i++){
            if(numbers[i]>numbers[i+1]){
                is_ascending = false;
            }
        }
        if(is_ascending){
            System.out.println("The give array is sorted in ascending order.");
        }
        else{
            System.out.println("The given array is not sorted in ascending order.");
        }
    }
}

// 2D arrays 
// printing 2d array

// import java.util.Scanner;

// public class practice1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in) ;
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();
//         int numbers [][] = new int [rows] [cols] ;

//         for(int i=0; i<rows; i++){
            
//             for(int j=0; j<cols; j++){
//                 numbers [i] [j] = sc.nextInt();
//             }
//         }

//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 System.out.print(numbers[i][j] + " ") ;
//             }
//             System.out.println();
//         }
//     }
// }

// taking array as input from user and finding the element and printing its index


// import java.util.Scanner ;

// public class practice1{
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();
//         int numbers [] [] = new int [rows] [cols];

//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 numbers[i] [j] = sc.nextInt();
//             }
//         }

//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 System.out.print(numbers[i][j] + " ");
//             }
//             System.out.println();
//         }

//         System.out.println("Enter the target integer: ");
//         int target = sc.nextInt();

//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 if(target == numbers[i][j]){
//                     System.out.println("target found at index: (" + i + ", " + j + ")");
//                 }
//             }
//         }
//     }
// }