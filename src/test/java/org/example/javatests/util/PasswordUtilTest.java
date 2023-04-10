package org.example.javatests.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_whe_has_less_than_8_letters() {
        assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void weak_whe_has_less_than_letters() {
        assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("abcdef"));
    }

    @Test
    public void weak_whe_has_less_than_letters_and_numbers() {
        assertEquals(PasswordUtil.SecurityLevel.MEDIUM, PasswordUtil.assessPassword("abcdef123"));
    }

    @Test
    public void weak_whe_has_less_than_letters_and_numbers_and_symbolos() {
        assertEquals(PasswordUtil.SecurityLevel.STRONG, PasswordUtil.assessPassword("abcdef123!"));
    }

}