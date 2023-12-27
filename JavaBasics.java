import java.util.Scanner;

// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();  
//         int b = sc.nextInt();
//         int sum = a + b;
//         //System.out.println(sum);   
//     }
    
// }

// public class JavaBasics {
//     Scanner sc = new Scanner(System.in);
//     float rad = sc.nextFloat();
//     float area = 3.14f * rad * rad;
//     System.out.print(area);
// }
public class JavaBasics{
   public static void printFactorial(int n) {
    if(n<0){
        System.out.println("invalid number");
        
    }
    int factorial = 1;
    for (int i = n; i>=1; i--) {
        factorial = factorial*i;

    }
    System.out.println(factorial);

}
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
        printFactorial(n);
    }

} 
}

