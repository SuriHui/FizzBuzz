public class FizzBuzz
{
    public static void main(String[] args)
    {
        int Fizz = 0;
        int Buzz = 0;
        int i = 0;

        if (Fizz == 3 && Buzz == 5) {
            System.out.print("FizzBuzz");
        } else if (Fizz == 3) {
            System.out.print("Fizz");
        } else if (Buzz == 5) {
            System.out.print("Buzz");
        } else {
            System.out.print(i);
        }

        for (i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}