package task;

import java.util.Scanner;

public class Methods {
    private int a,b;
    private double sum;
    Scanner sc = new Scanner(System.in);

    void checkForException(){

    }


    void adding( int a, int b) {
        try {
            System.out.println("Adding:");
            if (a<0&&b<0){
                throw new IllegalArgumentException();
            } else if ((a==0&&b!=0)||(a!=0&&b==0)){
                throw new ArithmeticException();
            } else if (a==0&&b==0){
                throw new IllegalAccessException();
            } else if (a>0&&b>0){
                throw new MyException();
            }
            sum = a + b;
            System.out.println(sum);
        }
        catch (IllegalArgumentException exc){
            System.out.println("found IllegalArgumentException");
        }
        catch (ArithmeticException exc){
            System.out.println("found ArithmeticException");
        }
        catch (IllegalAccessException exc){
            System.out.println("found IllegalAccessException");
        }
        catch (MyException exc){
            System.out.println("found MyException");
        }

    }

    void subtraction(int a, int b){
        try {
            System.out.println("subtraction:");
            if (a<0&&b<0){
                throw new IllegalArgumentException();
            } else if ((a==0&&b!=0)||(a!=0&&b==0)){
                throw new ArithmeticException();
            } else if (a==0&&b==0){
                throw new IllegalAccessException();
            } else if (a>0&&b>0){
                throw new MyException();
            }
            sum = a - b;
            System.out.println(sum);
        }
        catch (IllegalArgumentException exc){
            System.out.println("found IllegalArgumentException");
        }
        catch (ArithmeticException exc){
            System.out.println("found ArithmeticException");
        }
        catch (IllegalAccessException exc){
            System.out.println("found IllegalAccessException");
        }
        catch (MyException exc){
            System.out.println("found MyException");
        }
    }

    void multiplication(int a,int b){
        try {
            System.out.println("multiplication:");
            if (a<0&&b<0){
                throw new IllegalArgumentException();
            } else if ((a==0&&b!=0)||(a!=0&&b==0)){
                throw new ArithmeticException();
            } else if (a==0&&b==0){
                throw new IllegalAccessException();
            } else if (a>0&&b>0){
                throw new MyException();
            }
            sum = a * b;
            System.out.println(sum);
        }
        catch (IllegalArgumentException exc){
            System.out.println("found IllegalArgumentException");
        }
        catch (ArithmeticException exc){
            System.out.println("found ArithmeticException");
        }
        catch (IllegalAccessException exc){
            System.out.println("found IllegalAccessException");
        }
        catch (MyException exc){
            System.out.println("found MyException");
        }
    }

    void division(int a, int b){
        try {
            System.out.println("division:");
            if (a<0&&b<0){
                throw new IllegalArgumentException();
            } else if ((a==0&&b!=0)||(a!=0&&b==0)){
                throw new ArithmeticException();
            } else if (a==0&&b==0){
                throw new IllegalAccessException();
            } else if (a>0&&b>0){
                throw new MyException();
            }
            sum = a / b;
            System.out.println(sum);
        }
        catch (IllegalArgumentException exc){
            System.out.println("found IllegalArgumentException");
        }
        catch (ArithmeticException exc){
            System.out.println("found ArithmeticException");
        }
        catch (IllegalAccessException exc){
            System.out.println("found IllegalAccessException");
        }
        catch (MyException exc){
            System.out.println("found MyException");
        }
    }
}
