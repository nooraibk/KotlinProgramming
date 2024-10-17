package javaCode;

public class JavaSwitch {
    public static void main(String[] arg){
//        System.out.println("hello, World!");

//        String[] telusko.dsl.A = {"hello", "world"};
//        String[] telusko.dsl.B = telusko.dsl.A;
//
//
//        System.out.println("Array telusko.dsl.A = " + telusko.dsl.A[0]);


        char grade = 'C';

        //in java if one case returned true, and you didn't break the switch statement, it will execute the next case whether it returns false.
        switch(grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
//                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
        }
    }
}
