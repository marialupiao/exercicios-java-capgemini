/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package exercicio5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test void appHasAGreeting() {
       Mainp classUnderTest = newMainp();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
