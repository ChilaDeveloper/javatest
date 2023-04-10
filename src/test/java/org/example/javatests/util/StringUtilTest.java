package org.example.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeat() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_once() {
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtil.repeat("hola", -1);
    }


    //Metodo isEmpty

    @Test
    public void no_empty_string() {
        Assert.assertFalse(StringUtil.isEmpty(" hola"));
    }

    @Test
    public void empty_string() {
        Assert.assertTrue(StringUtil.isEmpty(" "));
    }

    @Test
    public void empty_string_null() {
        Assert.assertTrue(StringUtil.isEmpty(null));
    }

}