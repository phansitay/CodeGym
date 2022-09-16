package case_study.model;

import java.util.Scanner;

public class Customer extends Person{
    private int idCustomer;
    private String typeCustomer;
    private String address;

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    Scanner kb = new Scanner(System.in);
    public void typeCustomer(){
        int choose;
        do{
            System.out.println("-----------Loai khach hang-------------");
            System.out.println("\n1. Diamond" +
                    "\n2. Platinium" +
                    "\n3. Gold" +
                    "\n4. Silver" +
                    "\n5. Member");
            System.out.println("Moi ban nhap so tuong ung voi loai khach");
            choose=kb.nextInt();
            if (choose==1){
                setTypeCustomer("Diamond");
            }else {
                if(choose==2){
                    setTypeCustomer("Platinium");
                }else {
                    if(choose==3){
                        setTypeCustomer("Gold");
                    }else {
                        if(choose==4){
                            setTypeCustomer("Silver");
                        }else {
                            if(choose==5){
                                setTypeCustomer("Member");
                            }
                        }
                    }
                }
            }
        }while (choose<1||choose>5);
    }
    public void input(){
        System.out.println("Moi ban nhap ma khach hang : ");
        idCustomer =kb.nextInt();
        super.input();
        typeCustomer();
        kb.nextLine();
        System.out.println("Nhap dia chi khach hang :");
        address=kb.nextLine();
    }

    public String output(){
        String stringCustomer;
        stringCustomer="\nMa khach hang la :"+getIdCustomer()
                +super.output()
                +"\nLoai khach hang : "+getTypeCustomer()
                +"\nDia chi khach hang la : "+getAddress();
        return stringCustomer;
    }
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.input();
        System.out.println(customer.output());
    }
}
