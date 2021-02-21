package com.avp.homework3_wrappers;
/*
Для любых двух классов-оберток примитивного типа:

1. создать экземпляр используя
- конструктор
- литерал
- valueOf()
- parse()

2. Присвоейте значение другому классу, используя присвоение ("="). Продемонтрируйте разнию присвоения по ссылке, или вызовом метода value().

3. Преобразуйте в двоичное, шестнадцатеричное и восьмеричное представление, в строку.

4. Сравните передаваемые разными способами значения, используя "==" и equals(). Используйте пограничные и экстремальные значения (нижний предел, ниже нижнего предела, верхний предел, выше верхнего предела).

5. Напишите тест доказывающий, что классы-оболочки являются неизменяемыми.
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WrappersTest {

    @Test
    void compareTrue() {
        Byte a = 127;
        assertTrue((byte)127 == a);
        assertFalse((byte)135 == a);

        Byte c = -128;
        assertEquals((byte) -128, c);
        assertFalse(c.equals((byte)-130));

//        Byte j = 12;
//        Byte i = j;
//        assertTrue(i == j);

        Byte k = new Byte((byte)12);
        Byte l = new Byte(k);
        Byte d = new Byte(k);
        assertTrue(d.equals(l));
    }
}
