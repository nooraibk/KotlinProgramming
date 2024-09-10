package codinginflow;public class TestClass {
    public static void main(String[] arg){
//        System.out.println("hello, World!");

//        String[] A = {"hello", "world"};
//        String[] B = A;
//
//
//        System.out.println("Array A = " + A[0]);


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
