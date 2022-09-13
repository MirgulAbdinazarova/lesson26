import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        method(new  String[]{"Argen","hjhjj","jhdfgj","uytyt"});
        method(new Integer[]{1,5,6,6,4,8,9,2,1});
    }

    public  static <T>void method(T []arr) {
        System.out.println(arr[0]+" ;"+arr[arr.length-1]);
        for (T element:arr) {
            System.out.println(element);
        }
    }
}