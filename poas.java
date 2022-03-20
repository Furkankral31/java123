impot java.util.Scanner;
public class poas {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int kenar1;
        int kenar2;
        int kenar3;
        System.out.print("kenar1 gir: ");
        kenar1= input.nextInt();
        System.out.print("kenar2 gir: ");
        kenar2= input.nextInt();
        System.out.print("kenar 3 gir: ");
        kenar3=input.nextInt();
        int u;
        u=(kenar1+kenar2+kenar3)/2;
        double alan;
        alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.print(alan);
    }
}
