import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int number;
        int i;
        int total=0;
        System.out.println("Bir sayı giriniz: ");
        number=inp.nextInt();

        for(i=1;i<number;i++){
            if(number%i==0)
                total+=i;
        }
        if (total==number)
            System.out.println(total+" Mükemmel sayıdır.");
        else
            System.out.println(number+" Mükemmel sayı değildir.");
    }
}
