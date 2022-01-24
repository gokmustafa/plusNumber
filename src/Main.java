import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();
        int tempNumber;
        int modNumber;
        int plusNumber=0;

        tempNumber = number;
        while(tempNumber != 0){
            modNumber = tempNumber %10;
            plusNumber +=modNumber;
            tempNumber /= 10;
        }
        System.out.println(plusNumber);

    }
}
