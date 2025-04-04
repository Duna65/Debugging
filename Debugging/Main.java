/*
Error filled file created by
Kimg@techtrepacademy.com
modified by Dallin Lyman
*/
public class Main {//program that counts up to 10 twice, and then tells if i is equal to 0
    public static void main(String[] args) {//error 1, no main class
        int i = 0;//error 6
    
    System.out.println("hello everybody");
    System.out.println("am I doing this correctly");
    for (i=0;i<10;i++){
        System.out.println("the number i is "+i);//error 2, println
    }
//error 8, i>10 will never start (I found this later)
    for (i=0;i<10;i++){//errors 3,4,5 for is not capitalized, int is not capitalized, and it's a semicolon
        System.out.println("the new number i is "+i);
    }
    if (i==0){//error 6, i is not initialized
        System.out.print("i is equal to zero");

    }else {
        System.out.print("i is not equal to zero");//error 7, system is capitalized

    }
    //what other errors can I put into a source code file?
    }
}
