import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTaskTest {

    @Test
    public void testGetTitle() {
        SimpleTask simpleTask = new SimpleTask(5, "Купить Хлеб");

        String actual = simpleTask.getTitle();
        String expected = "Купить Хлеб";

        Assertions.assertEquals(expected, actual);
    }

}