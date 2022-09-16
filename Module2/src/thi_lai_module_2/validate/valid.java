package thi_lai_module_2.validate;

public class valid {
    public static boolean moreThan0(String val){
        return val.matches(".{1,10}");
    }

    public static boolean checkName(String name){
        return name.matches("SP[0-9]{1,5}");
    }
}
