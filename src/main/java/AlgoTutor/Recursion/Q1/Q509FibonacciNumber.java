package AlgoTutor.Recursion.Q1;

/**
 *
 The Fibonacci numbers,
 commonly denoted F(n) form a sequence,
 called the Fibonacci sequence,
 such that each number is the sum of the two preceding ones,
 starting from 0 and 1. That is,

 F(0) = 0, F(1) = 1
 F(n) = F(n - 1) + F(n - 2), for n > 1.
 Given n, calculate F(n).

 https://leetcode.com/problems/fibonacci-number/
 */
public class Q509FibonacciNumber {
    int fib = 0;
    public int fib(int n) {
        if(n==1 || n==0){
            return n;
        }
        fib = fib(n-1) + fib(n-2);
        return fib;
    }
    public static void main(String[] args){
        Q509FibonacciNumber fibNum = new Q509FibonacciNumber();
        fibNum.fib(5);
    }
}
