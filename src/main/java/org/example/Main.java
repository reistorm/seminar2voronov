package org.example;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1,1,1);
        Vector vector2 = new Vector(2,1,2);
        System.out.println("length = " + vector1.vectorLength());
        System.out.println("scal = "+ vector1.vectorScal(vector2));
        System.out.println("vectorPr = "+ vector1.vectorProduct(vector2));
        System.out.println("cos = "+ vector1.vectorCos(vector2));
        System.out.println("sum = "+ vector1.vectorSum(vector2));
        System.out.println("diff = "+ vector1.vectorDiff(vector2));
        Vector[] massVec = Vector.vectorRandom(10);
        for (int i = 0; i < massVec.length; i++) {
            System.out.println("ii - " + massVec[i]);

        }
    }
}
