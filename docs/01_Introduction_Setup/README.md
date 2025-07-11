[⬅️ Back to Home](../index.md)

# 01 - Introduction & Setup

## Welcome to DeepLearning4j (DL4J)

DeepLearning4j (DL4J) is a powerful, open-source deep learning library for the Java Virtual Machine (JVM). It is designed for production environments and integrates seamlessly with Java, Scala, and big data tools like Hadoop and Spark. If you are an experienced Java developer, DL4J allows you to leverage your existing skills to build, train, and deploy state-of-the-art neural networks and machine learning models.

---

## Why DeepLearning4j?
- **Native Java/Scala:** No need to switch languages; use your Java expertise.
- **Production-Ready:** Built for scalability, performance, and integration with enterprise systems.
- **GPU & Distributed Support:** Train models on CPUs, GPUs, or across clusters with Spark.
- **Flexible:** Supports feedforward, convolutional, and recurrent networks, as well as transfer learning and custom layers.
- **Ecosystem:** Integrates with ND4J (numerical computing), DataVec (ETL), RL4J (reinforcement learning), and Arbiter (hyperparameter tuning).

---

## What You Will Learn
This module covers:
- The role of deep learning in modern AI
- DL4J's architecture and ecosystem
- Setting up your Java project for DL4J
- Running your first ND4J array operations

---

## Deep Learning in Modern AI
Deep learning is a subset of machine learning that uses neural networks with many layers ("deep" networks) to model complex patterns in data. It powers applications like image recognition, natural language processing, recommendation systems, and more. DL4J brings these capabilities to the JVM, making it accessible to Java developers.

---

## DL4J Architecture & Ecosystem
- **DL4J Core:** Neural network API and training engine
- **ND4J:** N-dimensional arrays for Java (like NumPy for Python)
- **DataVec:** Data import, transformation, and ETL
- **RL4J:** Reinforcement learning
- **Arbiter:** Hyperparameter optimization

---

## Setting Up Your Environment

### Prerequisites
- Java 8 or higher (JDK)
- Apache Maven (for dependency management)

### 1. Install Java
Download and install the JDK from [Oracle](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://adoptium.net/). Verify with:
```sh
java -version
```

### 2. Install Maven
Download from [Maven](https://maven.apache.org/download.cgi) and add to your PATH. Verify with:
```sh
mvn -version
```

### 3. Create a Maven Project
```sh
mvn archetype:generate -DgroupId=com.springdemo -DartifactId=JAVA_AI -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
cd JAVA_AI
```

### 4. Add DL4J and ND4J Dependencies
Edit your `pom.xml`:
```xml
<dependencies>
  <dependency>
    <groupId>org.deeplearning4j</groupId>
    <artifactId>deeplearning4j-core</artifactId>
    <version>1.0.0-M2.1</version>
  </dependency>
  <dependency>
    <groupId>org.nd4j</groupId>
    <artifactId>nd4j-native-platform</artifactId>
    <version>1.0.0-M2.1</version>
  </dependency>
</dependencies>
```
Run:
```sh
mvn clean install
```

---

## Your First ND4J Array Operation
ND4J is the numerical backbone of DL4J. Here's a quick example to get you started:

```java
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class ND4JQuickStart {
    public static void main(String[] args) {
        INDArray arr = Nd4j.create(new float[]{1, 2, 3, 4, 5});
        System.out.println("ND4J Array: " + arr);
        INDArray arr2 = arr.add(10);
        System.out.println("Array after adding 10: " + arr2);
    }
}
```

---

## Next Steps
- Explore ND4J's API for more array operations
- Move on to building your first neural network with DL4J

---

**References:**
- [DeepLearning4j Documentation](https://deeplearning4j.konduit.ai/)
- [ND4J Documentation](https://deeplearning4j.konduit.ai/nd4j/overview)
- [DataVec Documentation](https://deeplearning4j.konduit.ai/datavec/overview)
- [DL4J Examples](https://github.com/deeplearning4j/deeplearning4j-examples)
