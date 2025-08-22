public class main {
    public static void main(String[] args) {
        // I think '0' is a 48 chareter and sents were adding it the output will come out as a number
        System.out.println('0' + 0);
        System.out.println('0' + '0');
        // I think this is happening becasue the program catches its self on the "0" or just adds it as a string sents there is no number
        System.out.println("0" + '0');
        System.err.println((1+2 == 3));
        // I think this is becaus it thinks it is .4 because of a bit
        System.err.println((.1+.2 == .3));
        System.err.println(Byte.SIZE);
        Byte x = Byte.MAX_VALUE;
        System.err.println(x);
        // This happens because of overloading
        System.err.println(++x);
    }
}
