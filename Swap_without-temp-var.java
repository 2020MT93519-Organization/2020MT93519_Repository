import java.util.*;
import java.lang.*;
import java.io.*;

public class Swap_Two_Numbers {

    public static void main(String[] args) {

        int value1 = 100;
        int value2 = 200;
        
        value1 = value1 - value1;
        value1 = value1 + value2;
        value1 = value2 - value1;

        System.out.println("--After swap--");
        System.out.println("Value 1 = " + value1);
        System.out.println("Value 2 = " + value2);
    }
}