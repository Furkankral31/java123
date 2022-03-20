import java.util.Scanner;
public class deneme {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double pi;
        pi=3.14;
        double r;
        System.out.print("yaricap giriniz: ");
        r=input.nextDouble();
        double aci;
        System.out.print("aci giriniz: ");
        aci=input.nextDouble();
        double alan;
        alan=(pi*r*r)*aci/360;
        System.out.print(alan);
    }
    }

