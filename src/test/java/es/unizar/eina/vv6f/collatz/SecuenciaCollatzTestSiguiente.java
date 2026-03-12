package es.unizar.eina.vv6f.collatz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class SecuenciaCollatzTestSiguiente {
        @Test
        public void valor40(){
            SecuenciaCollatz sig = new SecuenciaCollatz(50);
            assertEquals(20, sig.siguienteCollatz(40));
        }

        @Test
        public void valor20(){
            SecuenciaCollatz sig = new SecuenciaCollatz(50);
            assertEquals(40, sig.siguienteCollatz(13));
        }

    @ParameterizedTest(name = "siguienteCollatz({0}) debería ser {1}")
    @CsvSource({
            "20, 10",
            "10, 5",
            "16, 8",
            "5, 16",
            "8, 4",
            "4, 2",
            "2, 1"
    })
    public void testParam1(int input, int expected) {
        assertEquals(expected, SecuenciaCollatz.siguienteCollatz(input));
    }

    @ParameterizedTest(name = "siguienteCollatz({0}) debería ser {1}")
    @CsvFileSource(resources = "/salida.txt")
    public void testParam2(int input, int expected) {
        assertEquals(expected, SecuenciaCollatz.siguienteCollatz(input));
    }

    @TestFactory
    Collection<DynamicTest> generarTestsSecuencia() {
        final int[] SECUENCIA = new int[]{20,10,5,16,8,4,2, 1};
        List<DynamicTest> tests = new ArrayList<>();
        for (int i = 0; i < SECUENCIA.length - 1; i++) {
            final int testNumber = i;
            tests.add(dynamicTest("SecuenciaCollatz " + testNumber,
                    () -> assertEquals(SECUENCIA[testNumber + 1],
                           SecuenciaCollatz.siguienteCollatz(((SECUENCIA[testNumber]))))
            ));
        }
        return tests;
    }


}




