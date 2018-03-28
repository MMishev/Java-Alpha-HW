import java.util.Scanner;

public class AlphaNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        for(int i=0; i< 7; i++){
            n = scanner.nextInt();
            if(isAlpha(n)){
                System.out.println(n);
            }
        }
    }
    public static boolean isAlpha(int number){
        boolean isAlpha = true;
        int firstDigit = number/100;
        int thirdDigit = number%10;
        int secondDigit = (number/10)%10;

        int ab = Math.abs(firstDigit-secondDigit);
        int ac = Math.abs(firstDigit-thirdDigit);
        int bc = Math.abs(secondDigit-thirdDigit);

        int temp = 0;
        temp = Math.max(temp,ab);
        temp = Math.max(temp,ac);
        temp = Math.max(temp,bc);


        int sum = firstDigit+secondDigit+thirdDigit;
        int lastDigit = sum%10;

        if(temp<=lastDigit){
            isAlpha = false;
        }


        return isAlpha;

    }
}
