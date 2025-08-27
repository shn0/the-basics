package org.example.utils;

import org.example.utils.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    void testReverseNormal() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }
    @Test
    void testReverseEmpty() {
        assertEquals("", StringUtils.reverse(""));
    }
    @Test
    void testReverseNull() {
        assertNull(StringUtils.reverse(null));
    }
}