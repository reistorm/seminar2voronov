package org.example.seminar2;

/*Задача на ООП:
1) общий класс (Vector)
описание Vecto3D
Задача:
Создайте класс, который описывает вектор (в трёхмерном пространстве).
У него должны быть:
•	конструктор с параметрами в виде списка координат x, y, z
•	метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt(): vectorLength
•	метод, вычисляющий скалярное произведение: vectorScal
•	метод, вычисляющий векторное произведение с другим вектором: vectorProduct
•	метод, вычисляющий угол между векторами (или косинус угла): vectorCos
косинус угла между векторами равен скалярному
произведению векторов, деленному на произведение модулей (длин) векторов: vector

•	методы для суммы и разности: vectorSum, vectorDiff
•	статический метод, который принимает целое число N,
и возвращает массив случайных векторов размером N. vectorRandom

Если метод возвращает вектор, то он должен возвращать новый объект, а не менять базовый.
То есть, нужно реализовать шаблон "Неизменяемый объект"

 */
public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @return длину вектора
     */
    public double vectorLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @return скалярное произвдение вектора
     */
    public double vectorScal(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    /**
     * @return векторное произведение векторов
     */
    public Vector vectorProduct(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);

    }

    /**
     * @return косинус угла
     */
    public double vectorCos(Vector vector) {
        return vectorScal(vector) / (vectorLength() * vector.vectorLength());
    }

    /**
     * @return сумма векторов
     */
    public Vector vectorSum(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z
        );

    }
    /**
     * @return разница векторов
     */
    public Vector vectorDiff(Vector vector) {
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );

    }
    /**
     * @return рандомный массив векторов
     */
    public static Vector[] vectorRandom(int n) {
        Vector[] mass = new Vector[n];
        for (int i = 0; i < n; i++) {
            mass[i] = new Vector(
                    Math.random(),
                    Math.random(),
                    Math.random());
        }
        return mass;
    }

}

