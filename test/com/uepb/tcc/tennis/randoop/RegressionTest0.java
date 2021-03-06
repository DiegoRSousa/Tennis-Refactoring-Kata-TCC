package com.uepb.tcc.tennis.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Vitoria para jogador2" + "'", str11.equals("Vitoria para jogador2"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quarenta", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-All");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quarenta", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-All");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("hi!");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
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
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Trinta");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        java.lang.String str16 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Quinze" + "'", str8.equals("Love-Quinze"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Love-Quarenta" + "'", str13.equals("Love-Quarenta"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quinze");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Quinze" + "'", str8.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Trinta" + "'", str11.equals("Love-Trinta"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Trinta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Trinta" + "'", str11.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Trinta" + "'", str12.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Vitoria para jogador2" + "'", str11.equals("Vitoria para jogador2"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-All");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-All" + "'", str6.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-All" + "'", str7.equals("Love-All"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-All" + "'", str6.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-All" + "'", str7.equals("Love-All"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
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
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str22 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Vitoria para jogador2" + "'", str22.equals("Vitoria para jogador2"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
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
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Vitoria para jogador2" + "'", str19.equals("Vitoria para jogador2"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        tennisGame1_2.ganhouPonto("");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quarenta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
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
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Vitoria para jogador2" + "'", str19.equals("Vitoria para jogador2"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Trinta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Trinta" + "'", str11.equals("Love-Trinta"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quarenta", "hi!");
        tennisGame1_2.ganhouPonto("Love-Trinta");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Vitoria para jogador2" + "'", str12.equals("Vitoria para jogador2"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
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
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Vitoria para jogador2" + "'", str12.equals("Vitoria para jogador2"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str18 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Vitoria para jogador2" + "'", str18.equals("Vitoria para jogador2"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Trinta" + "'", str11.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Love-Quarenta" + "'", str14.equals("Love-Quarenta"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        java.lang.String str16 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Vitoria para jogador2" + "'", str12.equals("Vitoria para jogador2"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quarenta", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-All" + "'", str6.equals("Love-All"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-All");
        tennisGame1_2.ganhouPonto("");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quarenta", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Trinta" + "'", str11.equals("Love-Trinta"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Vitoria para jogador2" + "'", str11.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str19 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Vitoria para jogador2" + "'", str19.equals("Vitoria para jogador2"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Vitoria para jogador2" + "'", str11.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        java.lang.String str18 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Vitoria para jogador2" + "'", str18.equals("Vitoria para jogador2"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quarenta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "Love-All");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Trinta" + "'", str11.equals("Love-Trinta"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Vitoria para jogador2" + "'", str11.equals("Vitoria para jogador2"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        java.lang.String str18 = tennisGame1_2.getPontuacao();
        java.lang.String str19 = tennisGame1_2.getPontuacao();
        java.lang.String str20 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Vitoria para jogador2" + "'", str18.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Vitoria para jogador2" + "'", str19.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Vitoria para jogador2" + "'", str20.equals("Vitoria para jogador2"));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Love-Quarenta" + "'", str13.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Love-Quarenta" + "'", str14.equals("Love-Quarenta"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quarenta", "Love-Quarenta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Vitoria para jogador2", "Love-Trinta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
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
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Vitoria para jogador2" + "'", str11.equals("Vitoria para jogador2"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Vitoria para jogador2" + "'", str11.equals("Vitoria para jogador2"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quarenta", "Vitoria para jogador2");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quarenta", "Love-Trinta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str16 = tennisGame1_2.getPontuacao();
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
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
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str22 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str25 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Vitoria para jogador2" + "'", str22.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Vitoria para jogador2" + "'", str25.equals("Vitoria para jogador2"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quarenta", "Love-Quinze");
        tennisGame1_2.ganhouPonto("");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Trinta" + "'", str11.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Trinta" + "'", str12.equals("Love-Trinta"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("hi!");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Vitoria para jogador2" + "'", str12.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "Love-Quarenta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Vitoria para jogador2", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Trinta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Trinta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Quinze" + "'", str8.equals("Love-Quinze"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "Love-All");
        tennisGame1_2.ganhouPonto("");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        java.lang.String str16 = tennisGame1_2.getPontuacao();
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-Quarenta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Vitoria para jogador2" + "'", str11.equals("Vitoria para jogador2"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        java.lang.String str16 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
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
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
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
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Vitoria para jogador2" + "'", str20.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Vitoria para jogador2" + "'", str21.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Vitoria para jogador2" + "'", str22.equals("Vitoria para jogador2"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Vitoria para jogador2", "Love-Quarenta");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Trinta");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str16 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Trinta");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Quinze" + "'", str8.equals("Love-Quinze"));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        java.lang.String str16 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Trinta" + "'", str11.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Trinta" + "'", str12.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Love-Quarenta" + "'", str15.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Love-Quarenta" + "'", str16.equals("Love-Quarenta"));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Vitoria para jogador2", "Love-All");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Vitoria para jogador2", "Love-Trinta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Vitoria para jogador2" + "'", str11.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Vitoria para jogador2" + "'", str12.equals("Vitoria para jogador2"));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Vitoria para jogador2", "Vitoria para jogador2");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Trinta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        java.lang.String str16 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Trinta" + "'", str11.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Trinta" + "'", str12.equals("Love-Trinta"));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quarenta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Vitoria para jogador2", "Love-Trinta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
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
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-All" + "'", str6.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quinze" + "'", str9.equals("Love-Quinze"));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-All");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Love-Quarenta" + "'", str13.equals("Love-Quarenta"));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-All");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Quinze" + "'", str8.equals("Love-Quinze"));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
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
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str20 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Vitoria para jogador2" + "'", str20.equals("Vitoria para jogador2"));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-Quarenta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Love-Quarenta" + "'", str13.equals("Love-Quarenta"));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        java.lang.String str16 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Trinta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Love-Quarenta" + "'", str13.equals("Love-Quarenta"));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
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
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "Love-Quarenta");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
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
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-All");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Trinta" + "'", str11.equals("Love-Trinta"));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quarenta", "Love-Quarenta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quarenta", "Love-Quarenta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quarenta", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        java.lang.String str16 = tennisGame1_2.getPontuacao();
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "Love-Quarenta");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Trinta" + "'", str11.equals("Love-Trinta"));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quarenta", "Love-Quarenta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-All" + "'", str6.equals("Love-All"));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quinze");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
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
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str19 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Vitoria para jogador2" + "'", str19.equals("Vitoria para jogador2"));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Quinze" + "'", str8.equals("Love-Quinze"));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        java.lang.String str16 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Vitoria para jogador2" + "'", str12.equals("Vitoria para jogador2"));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        java.lang.String str16 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
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
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str22 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Vitoria para jogador2" + "'", str22.equals("Vitoria para jogador2"));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
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
        tennisGame1_2.ganhouPonto("");
        java.lang.String str21 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Vitoria para jogador2" + "'", str21.equals("Vitoria para jogador2"));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "Love-All");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Vitoria para jogador2" + "'", str11.equals("Vitoria para jogador2"));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quarenta", "Love-Quarenta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str18 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Vitoria para jogador2" + "'", str18.equals("Vitoria para jogador2"));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Love-Quarenta" + "'", str13.equals("Love-Quarenta"));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-Quarenta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-All" + "'", str6.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-All" + "'", str7.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-All" + "'", str8.equals("Love-All"));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        java.lang.String str18 = tennisGame1_2.getPontuacao();
        java.lang.String str19 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Vitoria para jogador2" + "'", str18.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Vitoria para jogador2" + "'", str19.equals("Vitoria para jogador2"));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
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
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Vitoria para jogador2" + "'", str20.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Vitoria para jogador2" + "'", str21.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Vitoria para jogador2" + "'", str22.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Vitoria para jogador2" + "'", str23.equals("Vitoria para jogador2"));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
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
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Vitoria para jogador2" + "'", str12.equals("Vitoria para jogador2"));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        java.lang.String str16 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
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
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        java.lang.String str18 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Vitoria para jogador2" + "'", str18.equals("Vitoria para jogador2"));
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Quinze" + "'", str8.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quinze" + "'", str9.equals("Love-Quinze"));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        java.lang.String str18 = tennisGame1_2.getPontuacao();
        java.lang.String str19 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Vitoria para jogador2" + "'", str18.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Vitoria para jogador2" + "'", str19.equals("Vitoria para jogador2"));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        java.lang.String str14 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Vitoria para jogador2" + "'", str14.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Quinze" + "'", str8.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Love-Quarenta" + "'", str13.equals("Love-Quarenta"));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
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
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str22 = tennisGame1_2.getPontuacao();
        java.lang.String str23 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Vitoria para jogador2" + "'", str22.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Vitoria para jogador2" + "'", str23.equals("Vitoria para jogador2"));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Trinta" + "'", str11.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Trinta" + "'", str12.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Vitoria para jogador2" + "'", str12.equals("Vitoria para jogador2"));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Trinta");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Vitoria para jogador2", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
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
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str22 = tennisGame1_2.getPontuacao();
        java.lang.String str23 = tennisGame1_2.getPontuacao();
        java.lang.String str24 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Vitoria para jogador2" + "'", str22.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Vitoria para jogador2" + "'", str23.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Vitoria para jogador2" + "'", str24.equals("Vitoria para jogador2"));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Vitoria para jogador2" + "'", str12.equals("Vitoria para jogador2"));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str16 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Vitoria para jogador2" + "'", str16.equals("Vitoria para jogador2"));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Vitoria para jogador2", "Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Quinze" + "'", str8.equals("Love-Quinze"));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Quinze" + "'", str8.equals("Love-Quinze"));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Trinta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Vitoria para jogador2", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quarenta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Trinta");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str19 = tennisGame1_2.getPontuacao();
        java.lang.String str20 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Vitoria para jogador2" + "'", str19.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Vitoria para jogador2" + "'", str20.equals("Vitoria para jogador2"));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Quinze" + "'", str8.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Trinta" + "'", str11.equals("Love-Trinta"));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("hi!");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
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
        java.lang.String str25 = tennisGame1_2.getPontuacao();
        java.lang.String str26 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Vitoria para jogador2" + "'", str20.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Vitoria para jogador2" + "'", str21.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Vitoria para jogador2" + "'", str22.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Vitoria para jogador2" + "'", str23.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Vitoria para jogador2" + "'", str24.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Vitoria para jogador2" + "'", str25.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Vitoria para jogador2" + "'", str26.equals("Vitoria para jogador2"));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str17 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Vitoria para jogador2" + "'", str17.equals("Vitoria para jogador2"));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str15 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        tennisGame1_2.ganhouPonto("Love-Trinta");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-Quinze");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Quarenta" + "'", str10.equals("Love-Quarenta"));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Vitoria para jogador2" + "'", str12.equals("Vitoria para jogador2"));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Quinze" + "'", str8.equals("Love-Quinze"));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Vitoria para jogador2" + "'", str12.equals("Vitoria para jogador2"));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
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
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Vitoria para jogador2" + "'", str18.equals("Vitoria para jogador2"));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "hi!");
        tennisGame1_2.ganhouPonto("");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Quarenta" + "'", str9.equals("Love-Quarenta"));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Quarenta" + "'", str11.equals("Love-Quarenta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Quarenta" + "'", str12.equals("Love-Quarenta"));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quinze", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Quinze" + "'", str7.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
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
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str26 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Vitoria para jogador2" + "'", str15.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Vitoria para jogador2" + "'", str20.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Vitoria para jogador2" + "'", str21.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Vitoria para jogador2" + "'", str22.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Vitoria para jogador2" + "'", str23.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Vitoria para jogador2" + "'", str26.equals("Vitoria para jogador2"));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "");
        tennisGame1_2.ganhouPonto("");
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-Quinze" + "'", str5.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("hi!", "Love-All");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Love-Trinta" + "'", str11.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Love-Trinta" + "'", str12.equals("Love-Trinta"));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        tennisGame1_2.ganhouPonto("Love-Quinze");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-Trinta" + "'", str7.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Vitoria para jogador2" + "'", str12.equals("Vitoria para jogador2"));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Quarenta", "");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "hi!");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-Quinze" + "'", str6.equals("Love-Quinze"));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Vitoria para jogador2");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        java.lang.String str9 = tennisGame1_2.getPontuacao();
        java.lang.String str10 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Trinta" + "'", str8.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Love-Trinta" + "'", str9.equals("Love-Trinta"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Love-Trinta" + "'", str10.equals("Love-Trinta"));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-All", "Love-All");
        tennisGame1_2.ganhouPonto("Love-Trinta");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("Love-All");
        tennisGame1_2.ganhouPonto("hi!");
        java.lang.String str11 = tennisGame1_2.getPontuacao();
        java.lang.String str12 = tennisGame1_2.getPontuacao();
        java.lang.String str13 = tennisGame1_2.getPontuacao();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Vitoria para jogador2" + "'", str11.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Vitoria para jogador2" + "'", str12.equals("Vitoria para jogador2"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Vitoria para jogador2" + "'", str13.equals("Vitoria para jogador2"));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("", "Love-Quinze");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        java.lang.String str6 = tennisGame1_2.getPontuacao();
        java.lang.String str7 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Love-All" + "'", str6.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Love-All" + "'", str7.equals("Love-All"));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        com.uepb.tcc.tennis.TennisGame1 tennisGame1_2 = new com.uepb.tcc.tennis.TennisGame1("Love-Trinta", "Love-All");
        java.lang.String str3 = tennisGame1_2.getPontuacao();
        java.lang.String str4 = tennisGame1_2.getPontuacao();
        java.lang.String str5 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-All");
        java.lang.String str8 = tennisGame1_2.getPontuacao();
        tennisGame1_2.ganhouPonto("Love-Quarenta");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Love-All" + "'", str3.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Love-All" + "'", str4.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Love-All" + "'", str5.equals("Love-All"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Love-Quinze" + "'", str8.equals("Love-Quinze"));
    }
}

