package JavaSession23;

public class DataTypes {

	public static void main(String[] args) {
		// Data Types:
				// strict type

				// 1. primitive Data Types: Don't need any object
				// 1. Boolean type
				// 2. Numeric Type:
				// 1. character type: char
				// 2. Integral Type:
				// 1. Integer: byte, short, int, long
				// 2. Floating-point: float, double

				// 2. Non Primitive Data Types: need to create the object--oop
				// String, Array, Interface, Classes

				// 1.byte:
				// size: 1 byte = 8 bits
				// range: -128 to 127
				byte b = 10;
				b = 20;
				b = 30;
				byte b1 = 30;
				byte b3 = 127;
				System.out.println(b1);
				System.out.println(b + b3);

				// 2. short:
				// size: 2 bytes =16 bits
				// range: -32768 to 32767
				short s1 = 1234;
				short s2 = 123;
				System.out.println(s1);

				// 3. int:
				// size: 4 bytes = 32 bits
				// range: -2147483648 to 2147483647
				int i = 23145;
				int i1 = -123;
				int k = 1;

				// 4.long:
				// size: 8 bytes = 64 bits
				// range: -9223372036854775808 to 9223372036854775807
				long g = 12345789155l;
				System.out.println(g);

				// 5.float:
				// size: 4 bytes = 32 bits
				// range: after point(.) (upto 7 decimal digits)
				float f1 = 12.33f;
				float f2 = (float) 35.45;
				System.out.println(f1);
				System.out.println(f2);
				System.out.println(f1 + f2);
				f2 = (float) 1234567.7;
				System.out.println(f2);
				System.out.println(f1 + f2);

				// 6.double:
				// size: 8 bytes = 64 bits
				// range: after . (upto 16 decimal digits)
				double d = 12.33;
				double d1 = 34.555;
				double d3 = 1.1;

				// 7. char:
				// size: 2 bytes = 16 bits
				// single digit value
				char c1 = 'a'; // a-z A-Z
				char c2 = '1'; // 0-9
				char c3 = '$';
				System.out.println(c1);

				// 8. boolean: true/false
				// size: ~1 bit
				boolean flag = true;
				boolean flag1 = false;
				System.out.println(flag);
				System.out.println(flag1);


	}

}
