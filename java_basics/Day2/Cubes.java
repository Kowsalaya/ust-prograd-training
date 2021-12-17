public class Cubes {
    public static long sumCubes(long n) {
        long cube;
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            cube = i * i * i;
            sum = sum + cube;
        }
        return sum;
    }
}