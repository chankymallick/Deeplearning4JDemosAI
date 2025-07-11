# DeepLearning4j Crash Course

## 1. Introduction & Setup

### What is DeepLearning4j?
DeepLearning4j (DL4J) is an open-source, distributed deep learning library for the Java Virtual Machine (JVM). It is designed for business environments and integrates with Hadoop and Apache Spark. DL4J allows you to build, train, and deploy deep neural networks in Java and Scala.

**Key Features:**
- Written for Java and Scala
- Supports CPUs and GPUs
- Integrates with big data tools (Hadoop, Spark)
- Production-ready and scalable

### Use Cases
- Image recognition
- Natural language processing
- Time series analysis
- Recommendation systems

### Installing Java, Maven, and Setting Up a DL4J Project

#### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Apache Maven

#### Steps
1. **Install Java:**
   - Download and install the JDK from [Oracle](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://adoptopenjdk.net/).
   - Verify installation:
     ```sh
     java -version
     ```
2. **Install Maven:**
   - Download from [Maven website](https://maven.apache.org/download.cgi).
   - Add Maven to your system PATH.
   - Verify installation:
     ```sh
     mvn -version
     ```
3. **Create a Maven Project:**
   - In your terminal:
     ```sh
     mvn archetype:generate -DgroupId=com.springdemo -DartifactId=JAVA_AI -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
     ```
   - Navigate to the project directory:
     ```sh
     cd JAVA_AI
     ```
4. **Add DL4J and ND4J Dependencies:**
   - Edit `pom.xml` and add:
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
   - Run:
     ```sh
     mvn clean install
     ```

### Understanding ND4J
ND4J (N-Dimensional Arrays for Java) is the numerical computing library used by DL4J. It provides data structures and operations for vectors, matrices, and tensors, similar to NumPy in Python.

**Example:**
```java
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class ND4JExample {
    public static void main(String[] args) {
        INDArray array = Nd4j.create(new float[]{1, 2, 3, 4, 5});
        System.out.println("ND4J Array: " + array);
    }
}
```

### Running Your First ND4J Array Operations
- Compile and run your Java class.
- Try basic operations: addition, multiplication, reshaping, etc.

**Next Steps:**
- Explore more ND4J operations
- Move on to building your first neural network with DL4J

---

**References:**
- [DeepLearning4j Documentation](https://deeplearning4j.konduit.ai/)
- [ND4J Documentation](https://deeplearning4j.konduit.ai/nd4j/overview)
- [Maven Getting Started](https://maven.apache.org/guides/getting-started/)

