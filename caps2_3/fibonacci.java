class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        while (b <= 100) {
            System.out.println(b);
            b += a;
            a = b - a;
        }
    }
}