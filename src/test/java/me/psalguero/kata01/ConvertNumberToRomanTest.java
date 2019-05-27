package me.psalguero.kata01;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class ConvertNumberToRomanTest {

  private ConvertNumberToRoman convertNumberToRoman;

  @Before
  public void beforeTest() {
    convertNumberToRoman = new ConvertNumberToRoman();
  }

  @Test
  public void convert0InRoman() {
    String convertRoman = convertNumberToRoman.convert(0);
    assertEquals("", convertRoman);
  }

  @Test
  public void convert1InRoman() {
    String convertRoman = convertNumberToRoman.convert(1);
    assertEquals("I", convertRoman);
  }

  @Test
  public void convert2InRoman() {
    String convertRoman = convertNumberToRoman.convert(2);
    assertEquals("II", convertRoman);
  }

  @Test
  public void convert3InRoman() {
    String convertRoman = convertNumberToRoman.convert(3);
    assertEquals("III", convertRoman);
  }

  @Test
  public void convert4InRoman() {
    String convertRoman = convertNumberToRoman.convert(4);
    assertEquals("IV", convertRoman);
  }

  @Test
  public void convert5InRoman() {
    String convertRoman = convertNumberToRoman.convert(5);
    assertEquals("V", convertRoman);
  }

  @Test
  public void convert6InRoman() {
    String convertRoman = convertNumberToRoman.convert(6);
    assertEquals("VI", convertRoman);
  }

  @Test
  public void convert7InRoman() {
    String convertRoman = convertNumberToRoman.convert(7);
    assertEquals("VII", convertRoman);
  }

  @Test
  public void convert8InRoman() {
    String convertRoman = convertNumberToRoman.convert(8);
    assertEquals("VIII", convertRoman);
  }

  @Test
  public void convert9InRoman() {
    String convertRoman = convertNumberToRoman.convert(9);
    assertEquals("IX", convertRoman);
  }

  @Test
  public void convert10InRoman() {
    String convertRoman = convertNumberToRoman.convert(10);
    assertEquals("X", convertRoman);
  }

  @Test
  public void convert11InRoman() {
    String convertRoman = convertNumberToRoman.convert(11);
    assertEquals("XI", convertRoman);
  }

  @Test
  public void convert12InRoman() {
    String convertRoman = convertNumberToRoman.convert(12);
    assertEquals("XII", convertRoman);
  }

  @Test
  public void convert13InRoman() {
    String convertRoman = convertNumberToRoman.convert(13);
    assertEquals("XIII", convertRoman);
  }

  @Test
  public void convert14InRoman() {
    String convertRoman = convertNumberToRoman.convert(14);
    assertEquals("XIV", convertRoman);
  }

  @Test
  public void convert15InRoman() {
    String convertRoman = convertNumberToRoman.convert(15);
    assertEquals("XV", convertRoman);
  }

  @Test
  public void convert16InRoman() {
    String convertRoman = convertNumberToRoman.convert(16);
    assertEquals("XVI", convertRoman);
  }

  @Test
  public void convert17InRoman() {
    String convertRoman = convertNumberToRoman.convert(17);
    assertEquals("XVII", convertRoman);
  }

  @Test
  public void convert18InRoman() {
    String convertRoman = convertNumberToRoman.convert(18);
    assertEquals("XVIII", convertRoman);
  }

  @Test
  public void convert19InRoman() {
    String convertRoman = convertNumberToRoman.convert(19);
    assertEquals("XIX", convertRoman);
  }

  @Test
  public void convert20InRoman() {
    String convertRoman = convertNumberToRoman.convert(20);
    assertEquals("XX", convertRoman);
  }

  @Test
  public void convertFrom20to30InRoman() {
    List<Integer> naturalNumbers = Arrays.asList(20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30);

    List<String> romansConvert = naturalNumbers.stream()
        .map(number -> convertNumberToRoman.convert(number))
        .collect(Collectors.toList());

    assertEquals(romansConvert.get(0), "XX");
    assertEquals(romansConvert.get(1), "XXI");
    assertEquals(romansConvert.get(2), "XXII");
    assertEquals(romansConvert.get(3), "XXIII");
    assertEquals(romansConvert.get(4), "XXIV");
    assertEquals(romansConvert.get(5), "XXV");
    assertEquals(romansConvert.get(6), "XXVI");
    assertEquals(romansConvert.get(7), "XXVII");
    assertEquals(romansConvert.get(8), "XXVIII");
    assertEquals(romansConvert.get(9), "XXIX");
    assertEquals(romansConvert.get(10), "XXX");
  }

  @Test
  public void convertFrom31to40InRoman() {
    List<Integer> naturalNumbers = Arrays.asList(31, 32, 33, 34, 35, 36, 37, 38, 39, 40);

    List<String> romansConvert = naturalNumbers.stream()
        .map(number -> convertNumberToRoman.convert(number))
        .collect(Collectors.toList());

    assertEquals(romansConvert.get(0), "XXXI");
    assertEquals(romansConvert.get(1), "XXXII");
    assertEquals(romansConvert.get(2), "XXXIII");
    assertEquals(romansConvert.get(3), "XXXIV");
    assertEquals(romansConvert.get(4), "XXXV");
    assertEquals(romansConvert.get(5), "XXXVI");
    assertEquals(romansConvert.get(6), "XXXVII");
    assertEquals(romansConvert.get(7), "XXXVIII");
    assertEquals(romansConvert.get(8), "XXXIX");
    assertEquals(romansConvert.get(9), "XL");
  }

  @Test
  public void convertFrom40to90InRoman() {
    List<Integer> naturalNumbers = Arrays.asList(40, 50, 55, 60, 65, 66, 70, 80, 90, 98);

    List<String> romansConvert = naturalNumbers.stream()
        .map(number -> convertNumberToRoman.convert(number))
        .collect(Collectors.toList());

    assertEquals(romansConvert.get(0), "XL");
    assertEquals(romansConvert.get(1), "L");
    assertEquals(romansConvert.get(2), "LV");
    assertEquals(romansConvert.get(3), "LX");
    assertEquals(romansConvert.get(4), "LXV");
    assertEquals(romansConvert.get(5), "LXVI");
    assertEquals(romansConvert.get(6), "LXX");
    assertEquals(romansConvert.get(7), "LXXX");
    assertEquals(romansConvert.get(8), "XC");
    assertEquals(romansConvert.get(9), "XCVIII");
  }

  @Test
  public void convertFrom400to980InRoman() {
    List<Integer> naturalNumbers = Arrays.asList(400, 500, 550, 600, 650, 660, 700, 800, 900, 980);

    List<String> romansConvert = naturalNumbers.stream()
        .map(number -> convertNumberToRoman.convert(number))
        .collect(Collectors.toList());

    assertEquals(romansConvert.get(0), "CD");
    assertEquals(romansConvert.get(1), "D");
    assertEquals(romansConvert.get(2), "DL");
    assertEquals(romansConvert.get(3), "DC");
    assertEquals(romansConvert.get(4), "DCL");
    assertEquals(romansConvert.get(5), "DCLX");
    assertEquals(romansConvert.get(6), "DCC");
    assertEquals(romansConvert.get(7), "DCCC");
    assertEquals(romansConvert.get(8), "CM");
    assertEquals(romansConvert.get(9), "CMLXXX");
  }

}
