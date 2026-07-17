package Method;

import static java.awt.AWTEventMulticaster.add;

public class Returntypemethod {
        public static int add(int a,int b){

            return a+b;

        }

        public static void main(String[] args){

            int result = add(10,20);

            System.out.println(result);

        }
    }
