[⬅️ Back to Section Home](../02_Linear_Algebra/README.md)

# Tensors: Theory and Basic Operations

## 1. Introduction
A **tensor** is a generalization of vectors and matrices to higher dimensions. In deep learning, tensors are used to represent complex data structures such as images, sequences, and batches of data. Understanding tensors and their operations is crucial for working with modern neural networks.

---

## 2. What is a Tensor?
- **Scalar:** 0D tensor (a single number)
- **Vector:** 1D tensor (array of numbers)
- **Matrix:** 2D tensor (array of arrays)
- **Tensor:** nD array (n ≥ 3)

**Example shapes:**
- Scalar: ()
- Vector: (n,)
- Matrix: (m, n)
- 3D Tensor: (d₁, d₂, d₃)
- 4D Tensor: (batch, height, width, channels) — common for images

---

## 3. Why Tensors in Deep Learning?
- **Data Representation:** Images, videos, and text are naturally represented as tensors.
- **Batch Processing:** Neural networks process multiple samples at once using batch tensors.
- **Layer Operations:** Convolutions, pooling, and recurrent layers operate on tensors.

---

## 4. Basic Tensor Operations in ND4J
### Creating Tensors
```java
// 3D tensor (2 x 2 x 2)
INDArray tensor = Nd4j.create(new float[][][]{{{1,2},{3,4}},{{5,6},{7,8}}});
System.out.println("Shape: " + Arrays.toString(tensor.shape()));
```

### Indexing and Slicing
```java
// Get a sub-array (slice)
INDArray slice = tensor.slice(0); // First 2x2 matrix
```

### Reshaping
```java
INDArray reshaped = tensor.reshape(4, 2); // Change to 2D
```

### Broadcasting
```java
INDArray a = Nd4j.create(new float[]{1, 2, 3});
INDArray b = Nd4j.ones(2, 3);
INDArray result = b.addRowVector(a); // Adds 'a' to each row
```

### Element-wise Operations
```java
INDArray c = tensor.add(10); // Add 10 to every element
```

---

## 5. Practical Example: Mini-batch Processing
Suppose you have a batch of 10 grayscale images, each 28x28 pixels:
```java
INDArray images = Nd4j.rand(new int[]{10, 28, 28}); // Shape: [batch, height, width]
System.out.println("Batch shape: " + Arrays.toString(images.shape()));
```
You can process all images in parallel using tensor operations.

---

## 6. Further Reading
- [What is a Tensor? (DeepLearning4j)](https://deeplearning4j.konduit.ai/nd4j/overview#tensors)
- [Stanford CS231n: Tensors](http://cs231n.stanford.edu/)
- [ND4J Documentation](https://deeplearning4j.konduit.ai/nd4j/overview)

