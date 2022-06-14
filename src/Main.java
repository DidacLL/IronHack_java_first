public class Main {
    public static void main(String[] args) {
        System.out.println(productFormatter(" Any cool name  ","21/03/2020"));
    }
    public static String productFormatter(String productName, String date){
        return (productName.trim().replace(' ','_')+date).toUpperCase();
    }
}