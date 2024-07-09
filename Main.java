import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.Write a program to find all of the longest word in a given dictionary.
       /*ArrayList<String> lon= new ArrayList<String>();
       lon.add("cat");
       lon.add("dog");
       lon.add("red");
       lon.add("is");
       lon.add("am");
        System.out.println(lon);
        System.out.println(dictionary(lon));

        */

        //2. Write a program that displays the number of occurrences of an element in the array.
       /* int array[] = {1, 1, 1, 3, 3, 5};
        int array2[] = {1, 3, 5, 9};


        occurrences(array, array2);

        */

        //3.Write a program to find the k largest elements in a given array. Elements in the array can be in any order.
       /* int[] arr = {1, 4, 17, 7, 25, 3, 100};
        System.out.print("Enter the number of largest elements to find: ");
        int n = scanner.nextInt();

       largE(arr, n);

        */
//4. Create a method to reverse an array of integers. Implement the method without creating a new array.
      /*  int arr[]={5,4,3,2,1};
        System.out.println("the original array:");
        print(arr);
        rev(arr);
        System.out.println("the reversed array :");
        print(arr);


       */

        //5. Write a menu driven Java program with following option:
        /*System.out.println("enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        boolean stop = false;
        while (!stop) {
            System.out.println("choose from the following menu:");
            System.out.println("1.  Accept elements of an array");
            System.out.println("2. Display elements of an array");
            System.out.println("3. Search the element within array");
            System.out.println("4. Sort the array");
            System.out.println("5. To stop");
            System.out.println(" ** enter your choice **");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    accept(array,scanner);
                    break;
                    case 2:
                        disply(array);
                        break;
                        case 3:
                            search(array,scanner);
                            break;
                            case 4:
                                sort(array);
                                break;
                                case 5:
                                    stop = true;
                                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }


         */
//6. Create a method that generates a random number within a given range. Allow the user to specify the range and call the method to display random numbers.
        /*System.out.println("enter the minimum value of the range: ");
        int min = scanner.nextInt();
        System.out.println("enter the maximum value of the range: ");
        int max = scanner.nextInt();
        System.out.println("enter the number of random numbers to generate : ");
        int numbers = scanner.nextInt();
        int[] randomNumbers = random(min, max, numbers);
        System.out.println("Random numbers within the specified range:");
        print2(randomNumbers);

         */
//7. Write a program that checks the strength of a password. Create a method that evaluates a password based on criteria like length, inclusion of special characters, and uppercase/lowercase letters.
       /* System.out.println("enter password: ");
        String password = scanner.nextLine();
        int total=calculate(password);
        if(total>=8){
            System.out.println("Your password is strong");
        }
        else if(total>=5){
            System.out.println("Password is moderately strong");
        }
        else System.out.println("Password is weak");



        */

        //8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
       /* System.out.println("Enter the number of Fibonacci terms to generate:");
        int n = scanner.nextInt();
        System.out.println("Fibonacci sequence with "+ n  +"terms");
        fibonacci(n);

        */
    }


    public static ArrayList<String> dictionary(ArrayList<String> words) {
        ArrayList<String> newwords = new ArrayList<>();
        int max = 0;


        for (String word : words) {
            int length = word.length();


            if (length > max) {
                max = length;

            }

            if (length == max) {
                newwords.add(word);
            }
        }

        return newwords;

    }


    public static void occurrences(int arr[], int arr2[]) {

        for (int c : arr2) {
            int count = 0;
            for (int i : arr) {
                if (i == c) {
                    count++;
                }
            }

            System.out.println(c + " " + "occures" + " " + count + " " + "times");
        }

    }


    public static void largE(int arr[], int n) {

        int largest[] = new int[n];
        for (int i = 0; i < n; i++) {
            largest[i] = Integer.MIN_VALUE;
        }

        for (int num : arr) {
            for (int i = 0; i < n; i++) {
                if (num > largest[i]) {
                    for (int j = n - 1; j > i; j--) {
                        largest[j] = largest[j - 1];
                    }
                    largest[i] = num;
                    break;
                }
            }

        }
        System.out.println(n + " largest elements of the said array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(largest[i] + " ");
        }


    }
    public static void rev(int arr[]){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
    }
    public static void print(int arr[] ) {
        for (int num : arr) {
            System.out.print(num);
        }
        System.out.println();
    }
    public static void accept(int arr[],Scanner scanner) {
        System.out.println("enter elements of array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("element "+ (i+1) + ": ");
            arr[i] = scanner.nextInt();

        }
    }
    public static void disply(int arr[]){
        System.out.println("element of the array :");
        for(int n:arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public static void search(int arr[],Scanner scanner) {
        System.out.println("enter elements to search:");
        int n = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("element" +n+"found at index "+i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("element not found");
        }
    }
    public static void sort(int arr[]){
        Arrays.sort(arr);
        System.out.println("array is sorted ");
    }
public static int []random (int min, int max, int count){
        Random random = new Random();
        int[] randomArray = new int[count];
        for (int i = 0; i < count; i++) {
            randomArray[i] =  random.nextInt(max - min+1)+min;
        }
        return randomArray;
    }
public static void print2(int random[]){
        for (int i = 0; i < random.length; i++) {
            System.out.print(random[i]+" ");
            if(i != random.length-1){
                System.out.print(" - ");
            }
        }
        System.out.println();
}
public static int checklength(int length){
        if(length>8){
            return 3;
        }else if(length>=6){
            return 2;
        } else
        return 0;

}
public static  int checkspecialch( String pass){
        for(int i=0;i<pass.length();i++){
            char ch=pass.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                return 2;
            }
        }
        return 0;
}
public static int checkUpperLower(String pass){
        boolean upperCase=false;
        boolean lowerCase=false;
        for(int i=0;i<pass.length();i++){
            char ch=pass.charAt(i);
            if(Character.isUpperCase(ch)){
                upperCase=true;
            }
            else if(Character.isLowerCase(ch)){
                lowerCase=true;
            }
        }
        if(upperCase&&lowerCase){
            return 3;
        }else
            return 0;
}
public static int calculate(String pass){
        int score=0;

    int lengths = checklength(pass.length());
    score += lengths;

    int specialc = checkspecialch(pass);
    score += specialc;

    int upperLowerScore = checkUpperLower(pass);
    score += upperLowerScore;

    return score;


}
public static void fibonacci(int nterms){
        int term1=0;
        int term2=1;
        for(int i=0;i<nterms;i++){
            if(i==0){
                System.out.print(" "+term1);
            }else if(i==1) {
                System.out.print(" " + term2);
            }
            else{
                int newterm=term1+term2;
                System.out.print(" "+newterm);
                term1=term2;
                term2=newterm;
            }
        }
    System.out.println();
}

}

