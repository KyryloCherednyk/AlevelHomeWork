package ua.cherednyk.hw7;

import java.util.Random;

public class Vector3D {
    public double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3D crossProduct(Vector3D otherVector) {
        return new Vector3D(
                y * otherVector.z - z * otherVector.y,
                z * otherVector.x - x * otherVector.z,
                x * otherVector.y - y * otherVector.x
        );
    }

    public double dotProduct(Vector3D otherVector) {
        return x * otherVector.x + y * otherVector.y + z * otherVector.z;
    }

    public double angleCosine(Vector3D otherVector) {
        double dotProduct = dotProduct(otherVector);
        double magnitudeProduct = length() * otherVector.length();
        if (magnitudeProduct == 0) {
            throw new IllegalArgumentException("Cannot compute angle cosine with a zero-length vector.");
        }
        return dotProduct / magnitudeProduct;
    }

    public Vector3D vectorSum(Vector3D otherVector) {
        return new Vector3D(x + otherVector.x, y + otherVector.y, z + otherVector.z);
    }

    public Vector3D vectorDifference(Vector3D otherVector) {
        return new Vector3D(x - otherVector.x, y - otherVector.y, z - otherVector.z);
    }

    public static Vector3D[] generateRandomVectors(int N) {
        Vector3D[] randomVectors = new Vector3D[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            randomVectors[i] = new Vector3D(
                    random.nextDouble() * 20 - 10,
                    random.nextDouble() * 20 - 10,
                    random.nextDouble() * 20 - 10
            );
        }
        return randomVectors;
    }

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public static void main(String[] args) {
        Vector3D vector1 = new Vector3D(1, 2, 3);
        Vector3D vector2 = new Vector3D(4, 5, 6);

        System.out.println("Vector 1 length: " + vector1.length());
        System.out.println("Vector 2 length: " + vector2.length());

        System.out.println("Vector 1 + Vector 2: " + vector1.vectorSum(vector2));
        System.out.println("Vector 1 - Vector 2: " + vector1.vectorDifference(vector2));

        System.out.println("Cross product: " + vector1.crossProduct(vector2));
        System.out.println("Dot product: " + vector1.dotProduct(vector2));

        System.out.println("Angle cosine: " + vector1.angleCosine(vector2));

        Vector3D[] randomVectors = Vector3D.generateRandomVectors(3);
        for (int i = 0; i < randomVectors.length; i++) {
            System.out.println("Random Vector " + (i + 1) + ": " + randomVectors[i]);
        }
    }
}

