public class OperatorDemo {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Integer Division
        System.out.println("a % b = " + (a % b));  // Modulus
        System.out.println();

        // Assignment Operators
        int c = a;
        System.out.println("Assignment Operators:");
        c += b;   System.out.println("c += b : " + c); // c = c + b
        c -= b;   System.out.println("c -= b : " + c); // c = c - b
        c *= b;   System.out.println("c *= b : " + c); // c = c * b
        c /= b;   System.out.println("c /= b : " + c); // c = c / b
        c %= b;   System.out.println("c %= b : " + c); // c = c % b
        System.out.println();

        // Unary Operators
        int d = 5;
        System.out.println("Unary Operators:");
        System.out.println("d++ = " + (d++)); // Post-increment
        System.out.println("After d++, d = " + d);
        System.out.println("++d = " + (++d)); // Pre-increment
        System.out.println("d-- = " + (d--)); // Post-decrement
        System.out.println("After d--, d = " + d);
        System.out.println("--d = " + (--d)); // Pre-decrement
        System.out.println("-d = " + (-d));   // Unary minus
        System.out.println("+d = " + (+d));   // Unary plus
        System.out.println("~d = " + (~d));   // Bitwise NOT
        boolean bool = true;
        System.out.println("!bool = " + (!bool)); // Logical NOT
        System.out.println();

        // Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println();

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y : " + (x && y)); // AND
        System.out.println("x || y : " + (x || y)); // OR
        System.out.println("!x     : " + (!x));     // NOT
        System.out.println();

        // Bitwise Operators and Shift Operators
        int m = 5, n = 3;
        System.out.println("Bitwise and Shift Operators:");
        System.out.println("m & n  = " + (m & n));  // AND
        System.out.println("m | n  = " + (m | n));  // OR
        System.out.println("m ^ n  = " + (m ^ n));  // XOR
        System.out.println("~m     = " + (~m));     // NOT
        System.out.println("m << 1 = " + (m << 1)); // Left shift
        System.out.println("m >> 1 = " + (m >> 1)); // Right shift
        System.out.println("m >>> 1 = " + (m >>> 1));// Unsigned right shift
        System.out.println();

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Ternary Operator:");
        System.out.println("max = (a > b) ? a : b = " + max);
        System.out.println();

        // instanceof Operator
        String s = "Hello";
        System.out.println("instanceof Operator:");
        System.out.println("s instanceof String : " + (s instanceof String));
    }
}
