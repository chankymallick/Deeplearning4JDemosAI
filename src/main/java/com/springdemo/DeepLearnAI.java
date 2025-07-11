package com.springdemo;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import org.nd4j.linalg.ops.transforms.Transforms;

public class DeepLearnAI {
    /**
     * Example 1: Demonstrates basic usage of ND4J by creating an array and performing a simple operation.
     * Prints the original array and the result after adding 1 to each element.
     */
    public static void exampleCreateAndAddArray() {
        // Create a simple ND4J array (vector)
        INDArray array = Nd4j.create(new float[]{1, 2, 3, 4, 5});
        System.out.println("Hello, DeepLearning4j!");
        System.out.println("ND4J Array: " + array);
        // Perform a simple operation
        INDArray result = array.add(1);
        System.out.println("Array after adding 1: " + result);
    }

    /**
     * Example 2: Demonstrates creating a 2D ND4J array (matrix) and performing matrix multiplication.
     * Prints the original matrices and the result of their multiplication.
     */
    public static void exampleMatrixMultiplication() {
        // Create two 2D ND4J arrays (matrices)
        INDArray matrixA = Nd4j.create(new float[][]{
            {1, 2},
            {3, 4}
        });
        INDArray matrixB = Nd4j.create(new float[][]{
            {5, 6},
            {7, 8}
        });
        System.out.println("Matrix A:\n" + matrixA);
        System.out.println("Matrix B:\n" + matrixB);
        // Perform matrix multiplication
        INDArray result = matrixA.mmul(matrixB);
        System.out.println("Result of A x B:\n" + result);
    }

    /**
     * Example 3: Demonstrates applying an activation function (ReLU) to an ND4J array.
     * Shows how non-linearities are introduced in neural networks.
     * Prints the original array and the result after applying ReLU.
     */
    public static void exampleApplyReLUActivation() {
        // Create an ND4J array with both positive and negative values
        INDArray array = Nd4j.create(new float[]{-2, -1, 0, 1, 2});
        System.out.println("Original Array: " + array);
        // Apply ReLU activation using ND4J's Transforms class
        INDArray relu = Transforms.relu(array);
        System.out.println("Array after ReLU activation: " + relu);
    }

    /**
     * Example 4: Demonstrates the Softmax function, commonly used in classification tasks.
     * Softmax converts raw scores (logits) into probabilities that sum to 1.
     * Prints the original array and the result after applying Softmax.
     */
    public static void exampleApplySoftmax() {
        // Create an ND4J array representing raw scores (logits)
        INDArray logits = Nd4j.create(new float[]{2.0f, 1.0f, 0.1f});
        System.out.println("Original logits: " + logits);
        // Apply Softmax activation
        INDArray softmax = Transforms.softmax(logits);
        System.out.println("Probabilities after Softmax: " + softmax);
    }

    /**
     * Example 5: Demonstrates reshaping an ND4J array (tensor).
     * Shows how to change the shape of an array, which is common in deep learning workflows.
     * Prints the original array and the reshaped array.
     */
    public static void exampleReshapeArray() {
        // Create a 1D ND4J array (vector)
        INDArray array = Nd4j.create(new float[]{1, 2, 3, 4, 5, 6});
        System.out.println("Original Array (1D): " + array);
        // Reshape to 2x3 matrix
        INDArray reshaped = array.reshape(2, 3);
        System.out.println("Reshaped Array (2x3):\n" + reshaped);
    }

    /**
     * Example 6: Demonstrates calculating the mean squared error (MSE) loss between two arrays.
     * MSE is commonly used as a loss function for regression tasks in machine learning.
     * Prints the predicted values, true values, and the calculated MSE.
     */
    public static void exampleMeanSquaredError() {
        // Create ND4J arrays for predicted and true values
        INDArray predicted = Nd4j.create(new float[]{2.5f, 0.0f, 2.1f, 7.8f});
        INDArray actual = Nd4j.create(new float[]{3.0f, -0.5f, 2.0f, 7.0f});
        System.out.println("Predicted values: " + predicted);
        System.out.println("True values:      " + actual);
        // Calculate mean squared error
        INDArray diff = predicted.sub(actual);
        INDArray squaredDiff = diff.mul(diff);
        double mse = squaredDiff.meanNumber().doubleValue();
        System.out.println("Mean Squared Error (MSE): " + mse);
    }

    /**
     * Example 7: Demonstrates element-wise operations (addition, multiplication) on ND4J arrays.
     * Shows how to perform basic arithmetic between arrays, which is common in neural network computations.
     * Prints the original arrays and the results of the operations.
     */
    public static void exampleElementWiseOperations() {
        // Create two ND4J arrays
        INDArray array1 = Nd4j.create(new float[]{1, 2, 3, 4});
        INDArray array2 = Nd4j.create(new float[]{10, 20, 30, 40});
        System.out.println("Array 1: " + array1);
        System.out.println("Array 2: " + array2);
        // Element-wise addition
        INDArray sum = array1.add(array2);
        System.out.println("Element-wise Sum: " + sum);
        // Element-wise multiplication
        INDArray product = array1.mul(array2);
        System.out.println("Element-wise Product: " + product);
    }

    public static void main(String[] args) {
        exampleElementWiseOperations();
    }
}
