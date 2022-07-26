public class Conversoes {
    public static void main(String[] args) {
        /* Tipo de Conversões
        - Upcast (implícito): de menor capacidade para de maior capacidade, não precisa informar o tipo
        - Downcast (explícito): de maior capacidade para de menor capacidade, pode perder informação, precisa informar o tipo
        */

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1; // downcast: short -> byte

        long l1;
        int i1 = 10;
        l1 = (int) i1; // upcast: int -> long

        int i2;
        long l2 = 100000000000L;
        i2 = (int) l2; // downcast: long -> int

        int i3;
        long l3 = 10000L;
        i3 = (int) l3; // downcast: long -> int

        double d1;
        float f1 = 10.5f;
        d1 = f1; // upcast: float -> double

        float f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2; // downcast: double -> float, não perde informação
        double d3 = 10000.00000000000000000000000000000000000000000000000000000000000000d;
        f3 = (float) d3; // downcast: double -> float, perde informação 

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4; // float -> int, perde informação, trunca o valor

        System.out.println("b1: " + b1);
        System.out.println("l1: " + l1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("d1: " + d1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("i4: " + i4);

        b1 = (byte) d3;

        System.out.println("b1: " + b1);
    }
}
