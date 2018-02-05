package com.example.demo.emma;

public class CrunchifyFibonacci {

	public static int fibonacciRecusion(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2);
	}

	public static int fibonacciLoop(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 3; i < number; i++) {
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
		}
		return fibonacci;
	}

}
