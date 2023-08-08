// printing pattern 

// public class basics{
//     public static void main (String [] args){
//         for(int i=0; i<5; i++){
//             for(int j=0; j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
// }
// }

// finding sum

// import java.util.Scanner;

// public class basics{
//     public static void main (String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two numbers:");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a+b;
//         System.out.println("the sum is: " + sum);
//     }
// }

// printing 2nd table 

// public class basics{
//     public static void main(String [] args){
//         int a =2;
//         for (int i=1; i<=10; i++){
//             int k = a * i ;
//             System.out.println("2 * " + i + " = " +k);
//         }
//     }
// }

// building a calculator

// import java.util.Scanner;
// public class basics{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println("Enter the operation: ");
//         int op = sc.nextInt();

//         switch(op){
//             case 1:
//             System.out.println(a+b);
//             break;

//             case 2:
//             System.out.println(a-b);
//             break;

//             case 3:
//             System.out.println(a*b);
//             break;

//             case 4:
//             System.out.println(a/b);
//             break;

//             default:
//             System.out.println("Enter a valid operation.");
//         }
//     }
// }

// checking if the num is prime or not

// import java.util.Scanner;
// public class basics{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int a = sc.nextInt();
//         boolean flag = false;

//         for(int i=2; i<= a/2 ; i++){
//             if(a%i == 0){
//                 flag = true;
//                 break ;
//             }
//         }

//         if(flag == true){
//             System.out.println(a + " is not a prime number");
//         }
//         else{
//             System.out.println(a + " is a prime number");
//         }
//     }
// }

// patterns
// 1. rectangle

// public class basics{
//     public static void main(String [] args){
//         for(int i=1; i<5; i++){
//             for(int j=1; j<=5; j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }

// 2. hollow rectangle

// public class basics{
//     public static void main (String [] args){
//         for(int i=1;i<5;i++){
//             for(int j=1;j<6;j++){
//                 if((i==1) || (i==4)){
//                     System.out.print("*");
//                 }
//                 else if(((i==2) && (j==1)) || ((i==2) && (j==5))){
//                     System.out.print("*");
//                 }
//                 else if(((i==3) && (j==1)) || ((i==3) && (j==5))){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println("");
//         }
//     }
// }

//3. inverted half pyramid

// public class basics{
//     public static void main(String [] args){
//         for(int i=4;i>0;i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }

//4. inverted half pyramid rotated by 180 deg -- not done

// public class basics{
//     public static void main (String [] args){
//         for(int i=1;i>=4;i++){
//             for(int j=1;j<=(4-i);j++){
//                 System.out.print(" ");
//             }

//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }

// 5. number pattern

// public class basics{
//     public static void main (String [] args){
//         for (int i=1; i<=5; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+ " ");
//             }
//             System.out.println("");
//         }
//     }
// }

//6. inverted half pyramid with numbers

// public class basics{
//     public static void main(String[] args){
//         for(int i=5; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println("");
//         }
//     }
// }


//7. Floyd's triangle

// public class basics{
//     public static void main(String [] args){
//         int num = 1;

//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(num + " ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }

//8. 0-1 triangle

// public class basics{
//     public static void main(String[] args){
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=i; j++){
//                 if((i+j)%2==0){
//                     System.out.print("1" + " ");
//                 }
//                 else{
//                     System.out.print("0" + " ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

//9. butterfly pattern

// public class basics{
//     public static void main(String [] args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }

//             int spaces = 2 * (n-i);
//             for(int j=1; j<=spaces; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for(int i=n;i>=1;i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }

//             int spaces = 2 * (n-i);
//             for(int j=1; j<=spaces; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//10. rhombus

// public class basics{
//     public static void main(String [] args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=5;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// printing name using function

// import java.util.Scanner;
// public class basics{

//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }

//     public static void main (String [] args){
//         Scanner sc = new Scanner (System.in);
//         String name = sc.next();
//         printMyName(name);
//     }
// }

// Function to print the sum of two numbers

// import java.util.Scanner;
// public class basics{
    
//     public static void sumOfTwoNumbers(int a, int b){
//         int sum = a+ b;
//         System.out.println(sum);
//         return;
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two integers:");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         sumOfTwoNumbers(a,b);
//     }
// }

// Function to print the product of two numbers

// import java.util.Scanner;
// public class basics{
    
//     public static int productOfTwoNumbers(int a, int b){
//         int product = a * b;
//         return product;
//     }
//     public static void main (String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two integers:");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int product = productOfTwoNumbers(a,b);
//         System.out.println("The product of two numbers is: " + product);
//     }
// }

// function to print factorial of the number

// import java.util.Scanner;
// public class basics{
    
//     public static void findFactorial(int n){
//         int factorial =1;
//         for(int i=n;i>=1;i--){
//             factorial = factorial * i;
//         }
//         System.out.println(factorial);
//     }
//     public static void main(String []args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a integer: ");

//         int n = sc.nextInt();
//         findFactorial(n); 
//     }
// }

// function to print avg of the 3 numbers

// import java.util.Scanner;
// public class basics{

//     public static void avgOfNumbers(int a, int b, int c){
//         float avg = (a+b+c)/3 ;
//         System.out.println(avg);
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter three numbers: ");

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         avgOfNumbers(a,b,c);
//     }
// }

// function to print sum of odd numbers from 1 to n

// import java.util.Scanner;
// public class basics{
    
//     public static void sumOfOddNumbers(int n){
//         int sum =0;
//         for(int i=1;i<=n;i++){
//             if(i%2 != 0){
//                 sum = sum + i;
//             }
//         }
//         System.out.println("The sum odd numbers from 1 to "+ n + " is "+ sum);
//     }

//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of n: ");
//         int n = sc.nextInt();
//         sumOfOddNumbers(n);
//     }
// }

// function to print greatest number

// import java.util.Scanner;
// public class basics{
    
//     public static void printGreaterNumber(int a, int b) {
//         if(a>b){
//             System.out.println(a + " is greater than " + b);
//         }
//         else{
//             System.out.println(b + " is greater than " + a);
//         }
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter two numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         printGreaterNumber(a, b);
//     }
// }

// function to print circumference of a circle

// import java.util.Scanner;
// public class basics{

//     public static void circumferenceOfCircle(int r){
//         double circumference = 2 * 3.14 * r ;

//         System.out.println("The circumference of circle with radius "+ r + " is: " + circumference);
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the radius of circle: ");
//         int r = sc.nextInt();

//         circumferenceOfCircle(r);
//     }
// }

// function to print eligibility to vote

// import java.util.Scanner;
// public class basics{
    
//     public static void eligibilityToVote(int age){
//         if(age<=18){
//             System.out.println("You are not eligible to vote");
//         }
//         else{
//             System.out.println("You are eligible to vote");
//         }
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your age: ");
//         int age = sc.nextInt();

//         eligibilityToVote(age);
//     }
// }

// infinite loop to print using do while loop

// public class basics{
//     public static void main(String [] args){
//         int i = 10;
//         do{
//             System.out.println("Hello");
//         } while(i>0);
//     }
// }

//program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

// import java.util.Scanner;
// public class basics{
//     public static void main(String [] args) {
//         Scanner sc = new Scanner(System.in);
//         int positive =0, negative =0, zeroes = 0;
//         System.out.println("Press 1 to continue and 0 to stop:");
//         int input = sc.nextInt();

//         while(input==1){
//             System.out.println("Enter your number: ");
//             int number = sc.nextInt();
//             if(number>0){
//                 positive++ ;
//             }
//             else if(number<0){
//                 negative++;
//             }
//             else{
//                 zeroes ++ ;
//             }

//             System.out.println("Press 1 to continue and 0 to stop:");
//             input=sc.nextInt();
//         }

//         System.out.println("Positives: "+positive);
//         System.out.println("Negatives: "+negative);
//         System.out.println("Zeroes: "+zeroes);
//     }
// }

//function to find the value of one number raised to the power of another i.e. x^n

// import java.util.Scanner;
// import java.lang.Math;

// public class basics{
    
//     public static void findPower(int x, int n){
//         int power = (int) Math.pow(x, n);
//         System.out.println(x + " ^ " + n + " = " + power );
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter two numbers:");
//         int x = sc.nextInt();
//         int n = sc.nextInt();
//         findPower(x, n);
//     }
// }

// taking string input

// import java.util.Scanner;
// public class basics{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println("Your name is: "+ name);
//     }
// }

// CONCATENATION IN STRINGS

// public class basics{
//     public static void main (String[] args){

//     String firstName = "Anvitha";
//     String lastName = "Maram";
//     String fullName = firstName + " " + lastName;
//     System.out.println(fullName);
//     System.out.println(fullName.length());

//     //charAt

//     for(int i=0;i<fullName.length();i++){
//         System.out.println(fullName.charAt(i));
//     }

//     }
// }

// Comapre in strings

// public class basics{
//     public static void main(String [] args){
//         String name1 = "Anvitha";
//         String name2 = "Maram";

//         //1. s1>s2 ==> +ve value
//         //2. s1==s2 ==> 0
//         //3. s1<s2 ==> -ve value

//         if(name1.compareTo(name2) == 0){
//             System.out.println("Strings are equal");
//         }
//         else{
//             System.out.println("Strings are not equal");
//         }
//     }
// }

// sub strings

// public class basics{
//     public static void main(String [] args){
//         String sentence = "My name is Anvitha";
//         //sub string ==> (beginning index, end index)

//         String name = sentence.substring(11, sentence.length());
//         System.out.println(name);
//     }
// }

// ParseInt method of integer class

// public class basics{
//     public static void main(String [] args){
//         //here the string 123 is successfully parsed into integer value 123
//         String str = "123";
//         int number = Integer.parseInt(str);
//         System.out.println(number);

//         // // here string abc cannot be parsedas integer and throws a numberformatexception
//         // String name = "abc";
//         // int numbers = Integer.parseInt(name);
//         // System.out.println(numbers);
        
//         // here the string 1000 is parsed as a binary number (base2) and gives it int value as output
//         String binaryString ="1000";
//         int binaryNumber = Integer.parseInt(binaryString, 2);
//         System.out.println(binaryNumber);

//         //here, string FF is parsed as a hexadecimal number, results in its int value as output
//         String hexString = "FF";
//         int hexNumber = Integer.parseInt(hexString, 16);
//         System.out.println(hexNumber);
//     }
// }

// taking array of strings as input anf finding combined len of strings

// import java.util.Scanner;
// public class basics{
//     public static void main (String [] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         String array[] = new String[size];
//         int totalLength = 0;

//         for(int i=0; i<size;i++){
//             array[i] = sc.next();
//             totalLength += array[i].length();
//         }

//         System.out.println(totalLength);
//     }
// }

// repplacing the letter e in the original string with letter i

// import java.util.Scanner;
// public class basics{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);

//         String name = sc.next();
//         String result = "" ;
//         for(int i=0; i<name.length();i++){
//             if(name.charAt(i)=='e'){
//                 result += 'i';
//             }
//             else{
//                 result += name.charAt(i);
//             }
//         }

//         System.out.println(result);
//     }
// }

// String builder

// public class basics{
//     public static void main(String [] args){
//         StringBuilder sb = new StringBuilder("Anvitha");
//         System.out.println(sb);
//         // CharAt

//         System.out.println(sb.charAt(0));
// // set CharAt 

//         sb.setCharAt(0, 'S');

//         System.out.println(sb);

//         //Insert

//         sb.insert(4,'S');
//         System.out.println(sb);

//         //delete

//         sb.delete(0, 2);
//         System.out.println(sb);

//         StringBuilder name = new StringBuilder("h");
//         name.append("e");
//         name.append("l");
//         name.append("l");
//         name.append("o");
//         System.out.println(name);
//     }
// }  

// Reverse a string

// public class basics{
//     public static void main (String [] args){
//         StringBuilder sb = new StringBuilder("Hello");

//         for(int i=0; i<sb.length()/2;i++){
//             int front = i;
//             int back = sb.length()-1-i;

//             char frontChar = sb.charAt(front);
//             char backChar = sb.charAt(back);

//             sb.setCharAt(front, backChar);
//             sb.setCharAt(back, frontChar);
//         }

//         System.out.println(sb);

//     }
// }

// pre increment

// public class basics{
//     public static void main(String [] args){
//         int a = 10;
//         int b = 0;
//         b = ++a ;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }

// post increment

// public class basics{
//     public static void main(String [] args){
//         int a = 10;
//         int b = 0;
//         b = a++ ;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }

// BIT MANIPULATION ==> GET

// public class basics{
//     public static void main(String[] args){
//         int n = 5; // 0101
//         int pos = 2;
//         int bitMask = 1<<pos;

//         if((bitMask & n) == 0){
//             System.out.println("bit was zero");
//         }
//         else{
//             System.out.println("Bit was one");
//         }
//     }
// }

// BIT MANIPULATION ==> SET

// public class basics{
//     public static void main(String[] args){
//         int n = 5; // 0101
//         int pos = 1;
//         int bitMask = 1<<pos;

//         int newNumber = bitMask | n ;
//         System.out.println(newNumber);
//     }
// }

// BIT MANIPULATION ==> CLEAR

// public class basics{
// public static void main(String[] args){
//     int n = 5; // 0101
//     int pos = 2;
//     int bitMask = 1<<pos;

//     int notBitMask = ~(bitMask);
//     int newNumber = notBitMask & n;
//     System.out.println(newNumber);
//     }
// }

// BIT MANIPULATION ==> UPDATE

// import java.util.Scanner;
// public class basics{
//     public static void main (String [] args){
//         Scanner sc = new Scanner (System.in);
//         int oper = sc.nextInt();
//         // oper =1 : set ,,, oper =0 : clear
//         int n =5; //0101
//         int pos = 1;

//         int bitMask = 1<<1;
//         if(oper==1){
//             // set
//             int newNumber = bitMask | n;
//             System.out.println(newNumber);
//         }
//         else{
//             int newBitMask = ~(bitMask);
//             int newNumber = newBitMask & n;
//             System.out.println(newNumber);
//         }
//     }
// }

// Write a program to find if a number is a power of 2 or not.
// Write a program to toggle a bit a position = “pos” in a number “n”.
// Write a program to count the number of 1’s in a binary representation of the number.
// Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. 

// program to count no of 1s in a number

// import java.util.Scanner;
// public class basics{
//     public static void main (String[] args){
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter a number: "); 
//         int n = sc.nextInt();

//         int count =0;
//         while(n>0){
//             count+= n&1 ;
//             n>>=1;
//         }
//         System.out.println(count);
        
//     }
// }

// Bubble sort ==> O(n^2)

// public class basics{
    
//     public static void printArray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
//     }

//     public static void main (String[] args){
//         int arr[] = {7,8,3,1,2};

//         //bubble sort
//         for(int i=0; i<arr.length-1; i++){
//             for(int j=0; j<arr.length-i-1; j++){
//                 if(arr[j]>arr[j+1]){
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp ;
//                 }
//             }
//         }
//         printArray(arr);
//     }
// }

// Selection sort ==> O(n^2);

// public class basics{
    
//     public static void printArray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
//     }

//     public static void main (String[] args){
//         int arr[] = {7,8,3,1,2};

//         //selection sort
//         for(int i=0; i<arr.length-1; i++){
//             int smallest = i;
//             for(int j=i+1;j<arr.length; j++){
//                 if(arr[smallest] > arr[j]){
//                     smallest = j;
//                 }
//             }
//             int temp = arr[smallest] ;
//             arr[smallest] = arr[i];
//             arr[i] = temp ;
//         }
//         printArray(arr);
//     }
// }

// Insertion sort ==> O(N^2)

// public class basics{
    
//     public static void printArray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
//     }
//     public static void main (String[] args){
//     int arr[] = {7,8,3,1,2};

//     //insertion sort
//     for(int i=1;i<arr.length;i++){
//         int current = arr[i];
//         int j = i=1;
//         while(j>=0 && current<arr[j]){
//             arr[j+1] = arr[j];
//             j--;
//         } 

//         // placement
//         arr[j+1] = current;
//     }
//     printArray(arr);
    
//     }
// }

// RECURSION

// Printing numbers from 5 to 1 
// i) without recursion

// public class basics{
//     public static void main(String [] args){
//         for(int i=5;i>0; i--){
//             System.out.print(i + " ");
//         }
//     }
// }

// ii) with recursion

// public class basics{
    
//     public static void printNumb(int n){
//         if(n==0){
//             return ;
//         }
//         System.out.print(n + " ");
//         printNumb(n-1);
//     }
//     public static void main(String [] args){
//         int n =5;
//         printNumb(n);
//     }
// }

// print numbers from 1 to 5 using recursion

// public class basics {
    
//     public static void printNumb(int n){
//         if(n>5){
//             return ;
//         }
//         System.out.print(n + " ");
//         printNumb(n+1);
//     }
//     public static void main (String [] args){
//         int n = 1;
//         printNumb(n);
//     }
// }

// print sum of first n natural numbers using recursion

// public class basics{
    
//     public static void findSum(int i, int n, int sum){
//         if(i==n){
//             sum = sum + i;
//             System.out.println(sum);
//             return;
//         }
//         sum = sum+i;
//         findSum(i+1, n, sum);
//     }

//     public static void main(String [] args)
//     {
//         findSum(1, 10, 0);
//     }
// }

// find factorial of number n using recursion

// public class basics{
    
//     public static void findFactorial(int i, int n, int fact){
//         if(n == i){ 
//             fact = fact *n;
//             System.out.println(fact);
//             return;
//         }
//         fact = fact *n ;
//         findFactorial(i, n-1, fact);
//     }
//     public static void main(String [] args){
//         findFactorial(1, 5, 1);
//     }
// }

// print fibonacci series till nth term using recursion

// public class basics{
    
//     public static void printFibonacci(int a, int b, int n){
//         if(n==0){
//             return;
//         }
//         int c = a+b ;
//         System.out.println(c);
//         printFibonacci(b, c, n-1);

//     }
//     public static void main(String [] args){
//         int a = 0;
//         int b = 1;
//         int n = 7;
//         System.out.println(a);
//         System.out.println(b);
//         printFibonacci(a, b, n-2);
//     }
// }

// print x^n using recursion

// public class basics{
//     public static int calPower(int x, int n){
//         if(n==0){
//             return 1;
//         }
//         if(x==0){
//             return 0;
//         }
//         int xPownm1 = calPower(x, n-1);
//         int xPown = x * xPownm1;
//         return xPown;
//     }

//     public static void main (String [] args){
//         int x = 2, n=5 ;
//         int ans = calPower(x,n);
//         System.out.println(ans);
//     }
// }

// Tower of hanoi

// public class basics{
    
//     public static void towerOfHanoi(int n, String src, String helper, String dest){
//         if(n==1){
//             System.out.println("transfer disk "+n+ " from " +src+ " to " +dest) ;
//             return;
//         }
//         towerOfHanoi(n-1, src, dest, helper);
//         System.out.println("transfer disk "+n+ " from " +src+ " to " +dest);
//         towerOfHanoi(n-1, helper, src, dest);
//     }
//     public static void main (String [] args){
//         int n =3;
//         towerOfHanoi(n, "S", "H", "D");
//     }
// }

// print a string in reverse using recursion 
// ==> time complexity: O(n) where, n is length of the string

// public class basics{
    
//     public static void printRev(String str, int indx){
//         if(indx==0){
//             System.out.print(str.charAt(indx));
//             return;
//         }
//         System.out.print(str.charAt(indx));
//         printRev(str, indx-1);
//     }
//     public static void main (String [] args){
//         String str = "abcd";
//         printRev(str, str.length()-1);
//     }
// }

// find first and last occurence of an element in string using recursion
// time complexity ==> O(n) where, n is length of string

// public class basics{
    
//     public static int first = -1;
//     public static int last = -1;

//     public static void findOccur(String str, int indx, char element){
//         if(indx==str.length()){
//             System.out.println("index of first occurence of "+element+ " is " +first);
//             System.out.println("index of last occurence of "+element+ " is " +last);
//             return;
//         }
//         char currChar = str.charAt(indx);
//         if(currChar == element){
//             if(first == -1){
//                 first = indx;
//             }
//             else{
//                 last = indx;
//             }
//         }
//         findOccur(str, indx+1, element);

//     }
//     public static void main(String [] args){
//         String str = "abcdefaaghbdacba";
//         findOccur(str, 0, 'a');
//     }
// }

// Check if an  array is sorted (Strictly increasing)

// public class basics{

//     public static boolean isSorted(int arr[], int indx){
        
//         if(indx == arr.length-1){
//             return true;
//         }
//         if (arr[indx]<arr[indx+1]){
//             return isSorted(arr, indx+1);
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main (String [] args){
//         int arr[] = {1, 3, 4, 5};
//         System.out.println(isSorted(arr, 0));
//     }
// } 

// move all 'x' in the string to the end of the string
// time complexity ==> O(n)

// public class basics{

//     public static void moveAllX(String str, int indx, int count, String newString){

//         if(indx == str.length()){
//             for(int i=0; i<count ; i++){
//                 newString = newString + 'x';
//             }
//             System.out.print(newString);
//             return;
//         }
//         char currChar = str.charAt(indx);
//         if (currChar == 'x'){
//             count = count +1 ;
//             moveAllX(str, indx+1, count, newString);
//         }
//         else{
//             newString = newString + currChar;
//             moveAllX(str, indx+1, count, newString);
//         }
//     }
//     public static void main(String [] args){
//         String str = "axxbcxd" ;
//         moveAllX(str, 0, 0, "");
//     }
// }

// remove duplicates in a string

// public class basics{

//     public static boolean [] map= new boolean [26];

//     public static void removeDuplicates(String str, int indx, String newString){
        
//         if(indx == str.length()){
//             System.out.println(newString);
//             return ;
//         }

//         char currChar = str.charAt(indx);
//         if(map[currChar - 'a']){
//             removeDuplicates(str, indx+1, newString);
//         }
//         else{
//             newString = newString + currChar ;
//             map[currChar - 'a'] = true;
//             removeDuplicates(str, indx+1, newString);
//         }
//     }
//     public static void main(String [] args){
//         String str = "abcdaaabcdefgab";
//         removeDuplicates(str, 0, "");
//     }
// }

// print all the subsequences of a string