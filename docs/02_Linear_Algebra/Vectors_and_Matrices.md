[⬅️ Back to Section Home](../02_Linear_Algebra/README.md)

# Vectors and Matrices: Theory and Operations

## 1. Introduction
Vectors and matrices are the foundation of linear algebra and are used everywhere in deep learning. This section will walk you through the basic theory and provide step-by-step mathematical examples, just like you would see in a math class.

---

## 2. Vectors
A **vector** is an ordered list of numbers. You can think of it as a point or an arrow in space.

### Example Vector
Let **v** = [2, 3, 5]

### Vector Addition
If **w** = [1, 4, 2], then:

**v + w = [2+1, 3+4, 5+2] = [3, 7, 7]**

### Scalar Multiplication
If a = 3, then:

a·**v** = 3·[2, 3, 5] = [6, 9, 15]

### Dot Product
**v · w = (2*1) + (3*4) + (5*2) = 2 + 12 + 10 = 24**

### Vector Norm (Length)
||**v**|| = sqrt(2² + 3² + 5²) = sqrt(4 + 9 + 25) = sqrt(38) ≈ 6.16

---

## 3. Matrices
A **matrix** is a rectangular array of numbers arranged in rows and columns.

### Example Matrix
Let **A** =
| 1  2 |
| 3  4 |

Let **B** =
| 5  6 |
| 7  8 |

### Matrix Addition
**A + B =**
| 1+5  2+6 | = | 6  8 |
| 3+7  4+8 |   | 10 12 |

### Scalar Multiplication
2·**A** =
| 2*1  2*2 | = | 2  4 |
| 2*3  2*4 |   | 6  8 |

### Matrix Multiplication
**A × B =**
| (1*5 + 2*7)  (1*6 + 2*8) | = | 19  22 |
| (3*5 + 4*7)  (3*6 + 4*8) |   | 43  50 |

### Matrix Transpose
Aᵗ =
| 1  3 |
| 2  4 |

---

## 4. Applications in Deep Learning
- **Input data:** Each row of a matrix can represent a data sample.
- **Weights:** Connections between layers are stored as matrices.
- **Activations:** Outputs of layers are often vectors or matrices.

---

## 5. Further Reading
- [Khan Academy: Vectors and Matrices](https://www.khanacademy.org/math/linear-algebra)
- [3Blue1Brown: Essence of Linear Algebra](https://www.3blue1brown.com/essence-of-linear-algebra)
- [ND4J Documentation](https://deeplearning4j.konduit.ai/nd4j/overview)
