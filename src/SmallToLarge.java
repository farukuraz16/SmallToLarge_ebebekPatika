import java.util.Scanner;

public class SmallToLarge {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);//ask for three numbers from user
        System.out.println("pls enter 1. number: ");
        int num1 = dat.nextInt();
        System.out.println("pls enter 2. number: ");
        int num2 = dat.nextInt();
        System.out.println("pls enter 3. number: ");
        int num3 = dat.nextInt();
        System.out.println("you entered these numbers= " + num1 + ", " + num2 + ", " + num3);

        if (num1 > num2 && num1 > num3) {//first condition .. biggest is num1
            if (num2 > num3) {
                System.out.println(num1 + ">" + num2 + ">" + num3);
            } else if (num3 > num2) {
                System.out.println(num1 + ">" + num3 + ">" + num2);
            }
        }

        else if (num2 > num1 && num2 > num3) {//second condition .. biggest is num2
            if (num1 > num3) {
                System.out.println(num2 + ">" + num1 + ">" + num3);
            } else if (num3 > num1) {
                System.out.println(num2 + ">" + num3 + ">" + num1);
            }
        }

        else if (num3 > num1 && num3 > num2) {//third condition .. biggest is num3
            if (num1 > num2) {
                System.out.println(num3 + ">" + num1 + ">" + num2);
            } else if (num2 > num1) {
                System.out.println(num3 + ">" + num2 + ">" + num1);
            }
        }



    }
}
