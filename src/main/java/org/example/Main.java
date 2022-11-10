package org.example;

public class Main {
    public static void main(String[] args) {
        int ans = getLargestPrime(7);
        System.out.println(ans);
    }

    public static int getLargestPrime(int num){
        int largestPrime = -1;
        boolean isPrime = true;     // flag to track the divisor is prime number or not

        // Check if the input is valid or not
        // the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers
        if(num <=1)
            return largestPrime;

        for (int i=2;i<=num;i++){
            // Check if i is a num divisor
            if(num % i == 0){
                // Check if i is a prime number or not
                for (int j=2;j<=(long) Math.sqrt(i);j++){
                    if (i % j == 0) {
                        isPrime = false;    // Set the flag to false and break the loop
                        break;
                    }
                }
                // if the divisor is prime number, set the largest prime to the number (i)
                if(isPrime)
                    largestPrime = i;
            }
            isPrime = true;     // reset the flag
        }

        return largestPrime;
    }
}