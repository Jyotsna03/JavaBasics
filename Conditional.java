import java.util.*;
// public class Conditional{public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int number = sc.nextInt();
//     if (number % 2 ==0){
//         System.out.println("Even");

//     } else {
//         System.out.println("Odd");
//     }
// }

// }
public class Conditional
{
    public static void main(String[] args) {
        int number = 45;
        String type = ((number %2)==0) ? "even" : "odd";
        System.out.println(type);
    

}
}