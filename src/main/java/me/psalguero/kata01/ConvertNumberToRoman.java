package me.psalguero.kata01;

import java.util.Arrays;
import java.util.List;

import static java.lang.Character.getNumericValue;

public class ConvertNumberToRoman {

  private final static List<String> symbolsRomans = Arrays.asList("I", "V", "X", "L", "C", "D", "M");
  private final static String EMPTY = "";

  public String convert(final Integer naturalNumber) {
    char[] digits = naturalNumber.toString().toCharArray();
    String resultRoman = "";
    int increment = 0;

    for (int index = digits.length - 1; index >= 0; index--) {
      String roman = generateRomanFromNaturalNumber(getNumericValue(digits[index]), 0  + increment,
          1 + increment, 2 + increment);

      resultRoman = roman + resultRoman;
      increment += 2;
    }

    return resultRoman;
  }

  private String generateRomanFromNaturalNumber(final int naturalNumber, final int x, final int y, final int z) {
    switch (naturalNumber) {
      case 4:
        return symbolsRomans.get(x) + symbolsRomans.get(y);
      case 9:
        return symbolsRomans.get(x) + symbolsRomans.get(z);
    }

    if (naturalNumber <= 3) {
      return addXRomanFromNumberAndstartNumber(naturalNumber, 1, EMPTY, symbolsRomans.get(x));
    }

    if (naturalNumber <= 8) {
      return addXRomanFromNumberAndstartNumber(naturalNumber, 6, symbolsRomans.get(y), symbolsRomans.get(x));
    }

    return null;
  }

  private String addXRomanFromNumberAndstartNumber(final int naturalNumber, final int startNumber, final String startResult,
                                                   final String addCharacter) {
    String romanResult = startResult;
    for (int index = startNumber; index <= naturalNumber; index++) {
      romanResult += addCharacter;
    }

    return romanResult;
  }
}
