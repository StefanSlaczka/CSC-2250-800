public class main {
    public static void main(String[] args) {
        // '0' is a char and adding an int promotes it to an int.
        System.out.println('0' + 0);
        System.out.println('0' + '0');
        // This is string concatenation not math
        System.out.println("0" + '0');
        System.err.println((1+2 == 3));
        // Floating point issue
        System.err.println((.1+.2 == .3));
        System.err.println(Byte.SIZE);
        Byte x = Byte.MAX_VALUE;
        System.err.println(x);
        // This happens because of overloading
        System.err.println(++x);
    }
}
