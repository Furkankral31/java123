import java.util.Scanner;
public class test {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     int domates;
     int patlican;
     int muz;
     int armut;
     int elma;
     System.out.print("domates gir: ");
      domates= input.nextInt();
        System.out.print("armut gir: ");
        armut= input.nextInt();
        System.out.print("muz gir: ");
        muz=input.nextInt();
        System.out.print("elma gir: ");
        elma=input.nextInt();
        System.out.print("patlican gir: ");
        patlican=input.nextInt();

       double tutar;
       tutar=2.14*armut+3.67*elma+1.11*domates+0.95*muz+5*patlican;
        System.out.print(tutar);
    }
}
