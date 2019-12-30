import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.condition.JRE.*;

import com.example.generics.CustomList;
import com.example.generics.GenericsMethod;
import com.example.generics.MultiBox;
import org.junit.jupiter.api.*;

import com.example.generics.Box;
import org.junit.jupiter.api.condition.*;


class GenericsTests {

    /**
     * Test Assumptions
     */
    @Test
    void testAssumption() {
        assumeTrue("Linux".equals(System.getProperty("os.name")));
    }

    /**
     * Test dimaond operator
     * Using diamond operator, compiler determines the type of the parameter.
     * This operator is avalilable from Java SE 7 version onwards.
     */
    @Test
    @Tag("diamond")
    @EnabledOnJre({JAVA_8})
    void testDiamondOperator() {
        // JAVA7 diamond operator, compiler determines the type of the parameter.
        Box<String> stringBox = new Box<>();
        stringBox.setT("asdf");
        assertEquals("class com.example.generics.Box", stringBox.getClass().toString());
        assertEquals("class java.lang.String", stringBox.getT().getClass().toString());
    }

    /**
     * Test MultiBox
     */
    @Test
    @Tag("multitypes")
    void testMultibox() {
        MultiBox<Integer, String> box = new MultiBox<Integer, String>();
        box.add(Integer.valueOf(10), "Hello World");
        assertEquals(10, box.getFirst());
        assertEquals("Hello World", box.getSecond());
    }

    /**
     * Test List
     */
    @Test
    @Tag("CustomList")
    void testCustomList() {
        CustomList<Integer> integerList = new CustomList<>();
        integerList.addItem(3);
        integerList.addItem(4);
        integerList.addItem(1);

        assertEquals(3, integerList.getSize());
        assertEquals("class java.lang.Integer", integerList.getItem(0).getClass().toString());
    }

    /**
     *
     */
    @Test
    void testGenericsMethod(){
        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O', 1 };

        GenericsMethod.printArray(intArray);   // pass an Integer array

        GenericsMethod.printArray(doubleArray);   // pass a Double array

        GenericsMethod.printArray(charArray);   // pass a Character array

    }
}
