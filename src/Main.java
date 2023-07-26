import java.util.Arrays;

public class Main {

    static boolean isPalindrome(int sayi){
        sayi=Math.abs(sayi);

            char[] digits = String.valueOf(sayi).toCharArray();
            char[] digits1=new char[]{};


        for(int  i=0; i<digits.length; i++){
            digits1 = Arrays.copyOf(digits1, digits1.length + 1)   ;
            digits1[digits1.length - 1] = digits[digits.length-i-1];
                     }
        String str=String.valueOf(digits1);
        int x=Integer.parseInt(str);
        if(sayi==x){
            return true;
        }
        else
        {return false;
        }
        }
    static boolean isPerfectNumber (int sayi) {
        if (sayi < 0) {
            return false;
        }


        int testSayi = 0;


        for (int i = 1; i < sayi; i++) {

            if (sayi % i == 0) {
                testSayi += i;
            }
        }
        if (sayi == testSayi) {
            return true;
        } else {
            return false;
        }
    }

    static String numberToWords(int sayi){
        if (sayi < 0) {
            return "Invalid Value";
        }

        char[] digits = String.valueOf(sayi).toCharArray();
        String str="";
        for(char digit:digits){
            switch (digit) {
                case '1':
                    str+="One ";
                    break;
                case '2':
                    str+="Two ";
                    break;
                case '3':
                    str+="Three ";
                    break;
                case '4':
                    str+="Four ";
                    break;
                case '5':
                    str+="Five ";
                    break;
                case '6':
                    str+="Six ";
                    break;
                case '7':
                    str+="Seven ";
                    break;
                case '8':
                    str+="Eight ";
                    break;
                case '9':
                    str+="Nine ";
                    break;
                case '0':
                    str+="Zero ";
                    break;

            }

        }
        StringBuffer sb= new StringBuffer(str);
        sb.deleteCharAt(sb.length()-1);
        str=sb.toString();
        return str;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(212));
        System.out.println(isPerfectNumber(28));
        System.out.println(numberToWords(28));

    }
}