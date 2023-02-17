package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void square() {
        SQRService service = new SQRService();
        int actual = service.calculate(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
}
