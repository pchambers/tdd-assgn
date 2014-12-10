/*******************************************************************************
 * Copyright (c) 2012 Gary F. Pollice All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html * Contributors:
 * gpollice rpdabrowski
 *******************************************************************************/

package tdd;

/**
 * <p>
 * This class implements a converter that takes a string that represents a number in either Arabic
 * or Roman numeral form and offers methods that will return either the integer value or a string
 * representing the value in Roman numeral form.
 * </p>
 * <p>
 * Roman numerals are specified and presented as strings according to the <a
 * href="http://en.wikipedia.org/wiki/Roman_numerals#Reading_Roman_numerals"> Reading Roman
 * Numerals</a> section of the Wikipedia Roman Numerals Page.
 * </p>
 * <p>
 * <strong>NOTE</strong>:<br/>
 * You will not need to handle alternate forms like "IIII" etc. Also, the acceptable range of values
 * for numbers is 1..3999.
 *
 * @author rpdabrowski, gpollice
 * @version 2.0.1
 */
public class RomanArabicConverter {
    /**
     * Constructor that takes in a string. The string should contain either a valid Roman numeral or
     * a valid Arabic numeral. The string can have leading and/or trailing spaces. There are no
     * spaces within the actual number characters. If the string represents an Arabic number, it may
     * be positive or negative. It will never be larger than a value that can fit into an int.
     *
     * @param value the string representing the Roman or Arabic number.
     * @throws MalformedNumberException if the string (less leading and trailing spaces) does not
     *         represent a valid Roman or Arabic number. <strong>NOTE</strong>: an Arabic number may
     *         be out of the acceptable range and will still be accepted by this constructor.
     */

    /** The Arabic Character value */
    Integer arabic;

    /** The Roman Character value */
    String roman;

    public RomanArabicConverter(String value) throws MalformedNumberException {
        validateValue(value);

        System.out.println(value);
        roman = value;
        // System.out.println("Roman: " + roman);
        arabic = Integer.parseInt(value);
        System.out.println("Arabic: " + arabic.toString());
    }


    public void validateValue(String value) throws MalformedNumberException {
        if (value.equals("")) {
            throw new MalformedNumberException("ERROR: Cannot convert empty input.");
        }


    }

    /**
     * @return the integer value of the number given
     */
    public int toArabic() {
        // TODO: Convert numbers to Arabic
        return 1;
    }

    /**
     * @return the string that represents the value of the number as a Roman numeral.
     * @throws ValueOutOfBoundsException if the number is too small or too large to be represented
     *         using Roman numerals as specified in <a
     *         href="http://en.wikipedia.org/wiki/Roman_numerals#Reading_Roman_numerals"> Reading
     *         Roman Numerals</a>
     */
    public String toRoman() throws ValueOutOfBoundsException {
        // TODO: Convert numbers to Roman numerals
        return "I";
    }
}
