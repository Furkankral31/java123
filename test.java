import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
          int fiyat;
          float kdvli;
          float kdv;
          System.out.print("lutfen urunun fiyatini girin: ");
          fiyat= input.nextInt();
          if(fiyat<0)
          {
              System.out.print("lutfen 0 dan buyuk girin");
          }
          if(fiyat>=0 && fiyat<=1000)
          {
              kdv=fiyat*18/100;
              kdvli=kdv+fiyat;
              System.out.print("kdv'li fiyat=" + kdvli);
          }
          if(fiyat>1000)
          {
              kdv=fiyat*8/100;
              kdvli=kdv+fiyat;
              System.out.print("kdv'li fiyat=" + kdvli);
          }
    }
}
