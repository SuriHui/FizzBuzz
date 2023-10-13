public class FizzBuzz
{
    public static void main(String[] args)
    {
        int Fizz = 0;
        int Buzz = 0;
        int i = 1;
        
        for (i = 1; i <= 100; i++) { 
            Fizz++;
            Buzz++;
            if (Fizz == 3 && Buzz == 5) {
                System.out.println("FizzBuzz");
                Fizz = 0;
                Buzz = 0;
            }
            if (Fizz == 3) {
                System.out.println("Fizz");
                Fizz = 0;
            }
            if (Buzz == 5) {
                System.out.println("Buzz");
                Buzz = 0;
            } else {
                System.out.println(i);
            }
        }
    }
}