package com.uepb.tcc.tennis.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test001");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str19 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str24 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Vitoria para jogador2" + "'", str19.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Vitoria para jogador2" + "'", str24.equals("Vitoria para jogador2"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test002");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Vitoria para jogador2" + "'", str11.equals("Vitoria para jogador2"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test004");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str18 = tennisGame1_2.getPontuacao();
        java.lang.String str19 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Vitoria para jogador2" + "'", str18.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Vitoria para jogador2" + "'", str19.equals("Vitoria para jogador2"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test005");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str19 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str22 = tennisGame1_2.getPontuacao();
        java.lang.String str23 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Vitoria para jogador2" + "'", str19.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Vitoria para jogador2" + "'", str22.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Vitoria para jogador2" + "'", str23.equals("Vitoria para jogador2"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test006");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test007");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test009");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Vitoria para jogador2", "Love-Quarenta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test010");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-All");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test014");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test015");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str19 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Vitoria para jogador2" + "'", str19.equals("Vitoria para jogador2"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str18 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Vitoria para jogador2" + "'", str18.equals("Vitoria para jogador2"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test018");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test019");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str18 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Vitoria para jogador2" + "'", str18.equals("Vitoria para jogador2"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test022");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Vitoria para jogador2" + "'", str11.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str16 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test026");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Vitoria para jogador2" + "'", str12.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test027");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Trinta" + "'", str11.equals("Love-Trinta"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test031");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quarenta", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str16 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str19 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Vitoria para jogador2" + "'", str19.equals("Vitoria para jogador2"));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test034");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test036");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test037");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-All" + "'", str6.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quinze" + "'", str9.equals("Love-Quinze"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test038");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test039");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str16 = tennisGame1_2.getPontuacao();
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        java.lang.String str18 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Vitoria para jogador2" + "'", str18.equals("Vitoria para jogador2"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test040");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test043");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test044");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test045");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str16 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str19 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Vitoria para jogador2" + "'", str19.equals("Vitoria para jogador2"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test048");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test049");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Vitoria para jogador2", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test052");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Trinta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        java.lang.String str18 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Vitoria para jogador2" + "'", str18.equals("Vitoria para jogador2"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("hi!");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test056");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-Quarenta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test059");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test062");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str21 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Vitoria para jogador2" + "'", str21.equals("Vitoria para jogador2"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test065");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test066");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test067");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Love-Quarenta" + "'", str13.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Love-Quarenta" + "'", str14.equals("Love-Quarenta"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test070");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Vitoria para jogador2" + "'", str12.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test074");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test075");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Vitoria para jogador2" + "'", str12.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str20 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Vitoria para jogador2" + "'", str20.equals("Vitoria para jogador2"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test080");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str20 = tennisGame1_2.getPontuacao();
        java.lang.String str21 = tennisGame1_2.getPontuacao();
        java.lang.String str22 = tennisGame1_2.getPontuacao();
        java.lang.String str23 = tennisGame1_2.getPontuacao();
        java.lang.String str24 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Vitoria para jogador2" + "'", str20.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Vitoria para jogador2" + "'", str21.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Vitoria para jogador2" + "'", str22.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Vitoria para jogador2" + "'", str23.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Vitoria para jogador2" + "'", str24.equals("Vitoria para jogador2"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test082");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Trinta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test083");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test084");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Trinta" + "'", str11.equals("Love-Trinta"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test089");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Vitoria para jogador2" + "'", str12.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test091");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test093");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Love-Quarenta" + "'", str13.equals("Love-Quarenta"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str19 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str22 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str25 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Vitoria para jogador2" + "'", str19.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Vitoria para jogador2" + "'", str22.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Vitoria para jogador2" + "'", str25.equals("Vitoria para jogador2"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test097");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test098");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str19 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str22 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Vitoria para jogador2" + "'", str19.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Vitoria para jogador2" + "'", str22.equals("Vitoria para jogador2"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test099");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("hi!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quarenta", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Quinze" + "'", str8.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quinze" + "'", str9.equals("Love-Quinze"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test102");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str16 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Vitoria para jogador2" + "'", str11.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test103");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("hi!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test107");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Love-Quarenta" + "'", str13.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Love-Quarenta" + "'", str14.equals("Love-Quarenta"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test109");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Quinze" + "'", str8.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Trinta" + "'", str11.equals("Love-Trinta"));
    }
}

