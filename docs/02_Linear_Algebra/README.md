[⬅️ Back to Home](../index.md)

# 02 - Linear Algebra for Deep Learning

## Introduction
Linear algebra is the backbone of deep learning. Every neural network operation—whether it’s a simple feedforward pass, backpropagation, or optimization—relies on efficient manipulation of vectors, matrices, and higher-dimensional tensors. As an experienced Java developer, mastering these concepts in ND4J will empower you to build and debug deep learning models with confidence.

---

## 📄 Detailed Topics
- [Vectors and Matrices: Theory and Operations](./Vectors_and_Matrices.md)
- [Tensors: Theory and Basic Operations](./Tensors.md)

---

## Why Linear Algebra Matters in Deep Learning
- **Data Representation:** Inputs (images, text, signals) are represented as vectors or matrices.
- **Model Parameters:** Weights and biases are stored as matrices/tensors.
- **Computation:** Forward and backward passes are matrix operations (dot products, transposes, etc.).
- **Optimization:** Gradients and updates are computed using linear algebra.

---

## ND4J: Java’s Numerical Computing Library
ND4J (N-Dimensional Arrays for Java) is the numerical engine behind DeepLearning4j. It provides:
- Fast, native operations on CPU and GPU
- NumPy-like API for Java
- Support for vectors, matrices, and tensors

---

## Core Concepts
### 1. Vectors
A vector is a 1D array. In ND4J:
```java
INDArray vector = Nd4j.create(new float[]{1, 2, 3});
System.out.println("Vector: " + vector);
```

### 2. Matrices
A matrix is a 2D array (rows x columns):
```java
INDArray matrix = Nd4j.create(new float[][]{{1, 2}, {3, 4}});
System.out.println("Matrix:\n" + matrix);
```

### 3. Tensors
A tensor is an N-dimensional array:
```java
INDArray tensor = Nd4j.create(new float[][][]{{{1,2},{3,4}},{{5,6},{7,8}}});
System.out.println("Tensor shape: " + Arrays.toString(tensor.shape()));
```

---

## Essential Operations in ND4J
### Addition & Subtraction
```java
INDArray a = Nd4j.create(new float[]{1, 2, 3});
INDArray b = Nd4j.create(new float[]{4, 5, 6});
INDArray sum = a.add(b); // [5, 7, 9]
INDArray diff = a.sub(b); // [-3, -3, -3]
```

### Element-wise Multiplication & Division
```java
INDArray product = a.mul(b); // [4, 10, 18]
INDArray quotient = b.div(a); // [4, 2.5, 2]
```

### Dot Product
```java
double dot = Nd4j.getBlasWrapper().dot(a, b); // 32
```

### Matrix Multiplication
```java
INDArray m1 = Nd4j.create(new float[][]{{1, 2}, {3, 4}});
INDArray m2 = Nd4j.create(new float[][]{{5, 6}, {7, 8}});
INDArray result = m1.mmul(m2); // [[19, 22], [43, 50]]
```

### Transpose
```java
INDArray m = Nd4j.create(new float[][]{{1, 2, 3}, {4, 5, 6}});
INDArray t = m.transpose();
```

### Reshaping
```java
INDArray arr = Nd4j.create(new float[]{1, 2, 3, 4, 5, 6});
INDArray reshaped = arr.reshape(2, 3); // 2x3 matrix
```

### Broadcasting
Broadcasting allows operations between arrays of different shapes:
```java
INDArray a = Nd4j.create(new float[]{1, 2, 3});
INDArray b = Nd4j.ones(3, 3);
INDArray result = b.addRowVector(a); // Adds 'a' to each row of 'b'
```

---

## Practical Example: Forward Pass in a Neural Network
Suppose you have an input vector and a weight matrix:
```java
INDArray input = Nd4j.create(new float[]{1, 2, 3}); // shape: [3]
INDArray weights = Nd4j.create(new float[][]{{0.2f, 0.8f, -0.5f}, {1.0f, -1.0f, 2.0f}}); // shape: [2,3]
INDArray output = weights.mmul(input.transpose()); // shape: [2]
System.out.println("Output: " + output);
```
This is the core of a feedforward layer: output = weights × input.

---

## Exercises
1. Create a 3x3 matrix and compute its transpose.
2. Multiply two matrices and verify the result manually.
3. Use broadcasting to add a vector to each row of a matrix.
4. Simulate a simple neural network layer using matrix multiplication.

---

## Further Reading
- [ND4J Linear Algebra Guide](https://deeplearning4j.konduit.ai/nd4j/overview)
- [DeepLearning4j Documentation](https://deeplearning4j.konduit.ai/)
- [NumPy for Java Developers](https://deeplearning4j.konduit.ai/nd4j/tutorials/numpy-for-java)
- [Matrix Math for Deep Learning](https://machinelearningmastery.com/linear-algebra-for-machine-learning/)
