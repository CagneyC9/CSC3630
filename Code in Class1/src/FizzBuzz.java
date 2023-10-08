public class FizzBuzz {
    public static void main(String[] args) {
        int num1 = 2;
        for (int i=0;i<=num1;i++) {
            int Randomnum = GenerateRandom();
            int FizzBuzz = getFizzBuzz(Randomnum);
            System.out.printf("\nRandomNumber:%s, FizzBuzz:%s", Randomnum, FizzBuzz);
        }
            System.out.printf("\nMath:%s");
        double random = Math.random() * 100;
    }
  private static int GenerateRandom() {
//        This method generates a random number from the ranges that are provided
            int min = 1;
            int max = 100;
            System.out.println("Random value in int from " + min + " to " + max + ":");
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println(random_int);
      return random_int;
  }
    private static int getFizzBuzz(int num) {
//        This is the heart of fizzbuzz
//        This answers the cases of whether the number is divisible by both numbers by handling the most constrictive case first
//        and then the other separate cases
//        This calculates it by getting the mod of 3 and 5. Mod gives you back the remainder, so if it is not 0, then it is not
//        divisible
        if(num % 3 == 0 && num % 5 ==0){
            System.out.printf("FizzBuzz");
        } else if (num % 5 == 0){
            System.out.printf("Buzz");
        } else if (num % 3 == 0){
            System.out.printf("Fizz");
        } else {
            System.out.printf("No FIzzBuzz");
        }
        return num;
    }

}
