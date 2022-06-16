public class Loops {

    public static void main(String[] args) {
        String retVal;

        for(int i=1;i<=100;i++){
            retVal="";
            if(i%3==0) retVal="Fizz ";
            if (i%5==0) retVal+="Buzz ";
            if (i%3!=0&&i%5!=0) retVal+=i;
            System.out.println(retVal);
        }
    }
}
