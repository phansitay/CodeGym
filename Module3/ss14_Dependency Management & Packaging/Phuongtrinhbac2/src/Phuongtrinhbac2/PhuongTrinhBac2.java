package Phuongtrinhbac2;

public class PhuongTrinhBac2 {

    public static void main(String[] args) {
        ptBac2(0,3,6);
    }
    public static void ptBac2(int a,int b, int c){
        if (a==0){
            System.out.println("Phuong trinh co nghiem x = "+(-c/b));
        }else {
            double denta = b*b-4*a*c;
            if (denta==0){
                System.out.println("Phuong trinh co nghiem kep x= "+(-b/2*a));
            }else {
                if (denta<0){
                    System.out.println("Phuong trinh vo nghiem ");
                }else
                {
                    System.out.println("Phuong trinh co 2 nghiem x1 = "+((-b+Math.sqrt(denta))/2*a)+"\nx2= "+((-b+Math.sqrt(denta))/2*a));
                }
            }
        }
    }
}
