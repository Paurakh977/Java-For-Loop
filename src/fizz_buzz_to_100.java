//This program return fizz on the multiple of 3 , buzz on multiple of 5
//and fizz-buzz on multiple of both from 1-100
public class fizz_buzz_to_100 {
    public static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            if (i%3==0 & i%5==0){
                System.out.println(i+" fizzBUzz");
            } else if (i%3==0 & i%5!=0) {
                System.out.println(i+"fizz");
            } else if (i%3!=0 & i%5==0) {
                System.out.println(i+" Buzz");
            }
            else {
                System.out.println(i+" NONE");
            }


        }
    }
}
