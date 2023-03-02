public class Casting {
    public static void main(String[] args) {
        char c = 'z';
        int cI = c; // casting implicito
        System.out.println("El valor de la variable c es: " + c + " y el de cI es: " + cI);

        int i = 250;
        long iL = i; // casting implicito
        short iS = (short) i; // casting explicito
        System.out.println("El valor de la variable i es: " + i + " y el de iL es: " + iL);
        System.out.println("El valor de la variable i es: " + i + " y el de iS es: " + iS);

        double d = 301.067;
        long dL = (long) d; // casting explicito
        System.out.println("El valor de la variable d es: " + d + " y el de dL es: " + dL);

        int i2 = 100;
        float i2F = (float) (i2 + 5000.66); // casting explicito
        System.out.println("El valor de la variable i2 es: " + i2 + " y el de i2F es: " + i2F);

        int i3 = 737;
        byte i3B = (byte) (i3 * 100);
        System.out.println("El valor de la variable i3 es: " + i3 + " y el de i3B es: " + i3B);

        double d2 = 298.638;
        long d2L =(long) (d2 / 25);
        System.out.println("El valor de la variable d2 es: " + d2 + " y el de d2L es: " + d2L);
    }
}
