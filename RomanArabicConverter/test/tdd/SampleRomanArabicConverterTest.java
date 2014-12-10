/*******************************************************************************
 * Copyright (c) 2012 Gary F. Pollice All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html Contributors:
 * gpollice rpdabrowski
 *******************************************************************************/

package tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Sample test cases for the RomanArabicConverter class.
 *
 * @author rpdabrowski
 * @version Nov 30, 2014
 */
public class SampleRomanArabicConverterTest {

    @Test
    public void input_1_() throws Exception {
        assertEquals(1, new RomanArabicConverter(" 1 ").toArabic());
        assertEquals("I", new RomanArabicConverter(" 1 ").toRoman());
    }

    @Test(expected = MalformedNumberException.class)
    public void inputEmptyString() throws Exception {
        new RomanArabicConverter("");
    }

    @Test(expected = MalformedNumberException.class)
    public void inputIIII() throws Exception {
        new RomanArabicConverter("IIII");
    }

    @Test(expected = MalformedNumberException.class)
    public void inputLowCase() throws Exception {
        new RomanArabicConverter("iii");
    }
}
