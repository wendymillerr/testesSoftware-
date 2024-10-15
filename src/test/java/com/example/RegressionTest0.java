package com.example;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        java.lang.Class<?> wildcardClass1 = carrinhoDeCompras0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        java.lang.Class<?> wildcardClass7 = carrinhoDeCompras0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        com.example.Produto produto7 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto8 = null;
        carrinhoDeCompras0.removerProduto(produto8);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = carrinhoDeCompras0.calcularTotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(produto7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        int int1 = carrinhoDeCompras0.getNumeroDeProdutos();
        double double2 = carrinhoDeCompras0.calcularTotal();
        java.lang.Class<?> wildcardClass3 = carrinhoDeCompras0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        int int1 = carrinhoDeCompras0.getNumeroDeProdutos();
        // The following exception was thrown during execution in test generation
        try {
            com.example.Produto produto2 = carrinhoDeCompras0.getPrimeiroProduto();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        com.example.Produto produto7 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto8 = null;
        carrinhoDeCompras0.removerProduto(produto8);
        com.example.Produto produto10 = carrinhoDeCompras0.getPrimeiroProduto();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = carrinhoDeCompras0.calcularTotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(produto7);
        org.junit.Assert.assertNull(produto10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        com.example.Produto produto7 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto8 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto9 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto10 = carrinhoDeCompras0.getPrimeiroProduto();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = carrinhoDeCompras0.calcularTotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(produto7);
        org.junit.Assert.assertNull(produto8);
        org.junit.Assert.assertNull(produto9);
        org.junit.Assert.assertNull(produto10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        com.example.Produto produto7 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto8 = carrinhoDeCompras0.getPrimeiroProduto();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = carrinhoDeCompras0.calcularTotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(produto7);
        org.junit.Assert.assertNull(produto8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        double double1 = carrinhoDeCompras0.calcularTotal();
        com.example.Produto produto2 = null;
        carrinhoDeCompras0.removerProduto(produto2);
        com.example.Produto produto4 = null;
        carrinhoDeCompras0.removerProduto(produto4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        int int1 = carrinhoDeCompras0.getNumeroDeProdutos();
        double double2 = carrinhoDeCompras0.calcularTotal();
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.removerProduto(produto3);
        java.lang.Class<?> wildcardClass5 = carrinhoDeCompras0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = carrinhoDeCompras0.calcularTotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        com.example.Produto produto7 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto8 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto9 = carrinhoDeCompras0.getPrimeiroProduto();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = carrinhoDeCompras0.calcularTotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(produto7);
        org.junit.Assert.assertNull(produto8);
        org.junit.Assert.assertNull(produto9);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        double double1 = carrinhoDeCompras0.calcularTotal();
        double double2 = carrinhoDeCompras0.calcularTotal();
        double double3 = carrinhoDeCompras0.calcularTotal();
        // The following exception was thrown during execution in test generation
        try {
            com.example.Produto produto4 = carrinhoDeCompras0.getPrimeiroProduto();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        // The following exception was thrown during execution in test generation
        try {
            com.example.Produto produto1 = carrinhoDeCompras0.getPrimeiroProduto();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        com.example.Produto produto7 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto8 = null;
        carrinhoDeCompras0.removerProduto(produto8);
        com.example.Produto produto10 = null;
        carrinhoDeCompras0.removerProduto(produto10);
        com.example.Produto produto12 = null;
        carrinhoDeCompras0.removerProduto(produto12);
        org.junit.Assert.assertNull(produto7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        com.example.Produto produto7 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto8 = null;
        carrinhoDeCompras0.removerProduto(produto8);
        java.lang.Class<?> wildcardClass10 = carrinhoDeCompras0.getClass();
        org.junit.Assert.assertNull(produto7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        int int1 = carrinhoDeCompras0.getNumeroDeProdutos();
        com.example.Produto produto2 = null;
        carrinhoDeCompras0.adicionarProduto(produto2);
        java.lang.Class<?> wildcardClass4 = carrinhoDeCompras0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.removerProduto(produto3);
        double double5 = carrinhoDeCompras0.calcularTotal();
        java.lang.Class<?> wildcardClass6 = carrinhoDeCompras0.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        com.example.Produto produto7 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto8 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto9 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto10 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto11 = null;
        carrinhoDeCompras0.adicionarProduto(produto11);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = carrinhoDeCompras0.calcularTotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(produto7);
        org.junit.Assert.assertNull(produto8);
        org.junit.Assert.assertNull(produto9);
        org.junit.Assert.assertNull(produto10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        com.example.Produto produto7 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto8 = null;
        carrinhoDeCompras0.removerProduto(produto8);
        com.example.Produto produto10 = null;
        carrinhoDeCompras0.removerProduto(produto10);
        com.example.Produto produto12 = null;
        carrinhoDeCompras0.adicionarProduto(produto12);
        int int14 = carrinhoDeCompras0.getNumeroDeProdutos();
        com.example.Produto produto15 = carrinhoDeCompras0.getPrimeiroProduto();
        org.junit.Assert.assertNull(produto7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(produto15);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        int int7 = carrinhoDeCompras0.getNumeroDeProdutos();
        com.example.Produto produto8 = null;
        carrinhoDeCompras0.adicionarProduto(produto8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        int int7 = carrinhoDeCompras0.getNumeroDeProdutos();
        com.example.Produto produto8 = null;
        carrinhoDeCompras0.removerProduto(produto8);
        com.example.Produto produto10 = null;
        carrinhoDeCompras0.removerProduto(produto10);
        com.example.Produto produto12 = null;
        carrinhoDeCompras0.adicionarProduto(produto12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        int int1 = carrinhoDeCompras0.getNumeroDeProdutos();
        int int2 = carrinhoDeCompras0.getNumeroDeProdutos();
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.removerProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.removerProduto(produto5);
        // The following exception was thrown during execution in test generation
        try {
            com.example.Produto produto7 = carrinhoDeCompras0.getPrimeiroProduto();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        int int1 = carrinhoDeCompras0.getNumeroDeProdutos();
        int int2 = carrinhoDeCompras0.getNumeroDeProdutos();
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.removerProduto(produto3);
        java.lang.Class<?> wildcardClass5 = carrinhoDeCompras0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        com.example.Produto produto7 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto8 = null;
        carrinhoDeCompras0.removerProduto(produto8);
        com.example.Produto produto10 = null;
        carrinhoDeCompras0.removerProduto(produto10);
        com.example.Produto produto12 = null;
        carrinhoDeCompras0.adicionarProduto(produto12);
        int int14 = carrinhoDeCompras0.getNumeroDeProdutos();
        int int15 = carrinhoDeCompras0.getNumeroDeProdutos();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = carrinhoDeCompras0.calcularTotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(produto7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        com.example.Produto produto7 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto8 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto9 = carrinhoDeCompras0.getPrimeiroProduto();
        java.lang.Class<?> wildcardClass10 = carrinhoDeCompras0.getClass();
        org.junit.Assert.assertNull(produto7);
        org.junit.Assert.assertNull(produto8);
        org.junit.Assert.assertNull(produto9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        double double1 = carrinhoDeCompras0.calcularTotal();
        com.example.Produto produto2 = null;
        carrinhoDeCompras0.removerProduto(produto2);
        java.lang.Class<?> wildcardClass4 = carrinhoDeCompras0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        com.example.Produto produto7 = null;
        carrinhoDeCompras0.removerProduto(produto7);
        java.lang.Class<?> wildcardClass9 = carrinhoDeCompras0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = carrinhoDeCompras0.getPrimeiroProduto();
        int int6 = carrinhoDeCompras0.getNumeroDeProdutos();
        org.junit.Assert.assertNull(produto5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = carrinhoDeCompras0.calcularTotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.removerProduto(produto3);
        int int5 = carrinhoDeCompras0.getNumeroDeProdutos();
        double double6 = carrinhoDeCompras0.calcularTotal();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        int int3 = carrinhoDeCompras0.getNumeroDeProdutos();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        int int1 = carrinhoDeCompras0.getNumeroDeProdutos();
        double double2 = carrinhoDeCompras0.calcularTotal();
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.removerProduto(produto3);
        int int5 = carrinhoDeCompras0.getNumeroDeProdutos();
        // The following exception was thrown during execution in test generation
        try {
            com.example.Produto produto6 = carrinhoDeCompras0.getPrimeiroProduto();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        int int7 = carrinhoDeCompras0.getNumeroDeProdutos();
        com.example.Produto produto8 = carrinhoDeCompras0.getPrimeiroProduto();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(produto8);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        double double1 = carrinhoDeCompras0.calcularTotal();
        double double2 = carrinhoDeCompras0.calcularTotal();
        double double3 = carrinhoDeCompras0.calcularTotal();
        com.example.Produto produto4 = null;
        carrinhoDeCompras0.removerProduto(produto4);
        com.example.Produto produto6 = null;
        carrinhoDeCompras0.adicionarProduto(produto6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        double double1 = carrinhoDeCompras0.calcularTotal();
        com.example.Produto produto2 = null;
        carrinhoDeCompras0.removerProduto(produto2);
        com.example.Produto produto4 = null;
        carrinhoDeCompras0.adicionarProduto(produto4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        double double1 = carrinhoDeCompras0.calcularTotal();
        double double2 = carrinhoDeCompras0.calcularTotal();
        int int3 = carrinhoDeCompras0.getNumeroDeProdutos();
        double double4 = carrinhoDeCompras0.calcularTotal();
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto6 = null;
        carrinhoDeCompras0.removerProduto(produto6);
        org.junit.Assert.assertNull(produto5);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.removerProduto(produto1);
        int int3 = carrinhoDeCompras0.getNumeroDeProdutos();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.removerProduto(produto3);
        int int5 = carrinhoDeCompras0.getNumeroDeProdutos();
        int int6 = carrinhoDeCompras0.getNumeroDeProdutos();
        double double7 = carrinhoDeCompras0.calcularTotal();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        double double1 = carrinhoDeCompras0.calcularTotal();
        com.example.Produto produto2 = null;
        carrinhoDeCompras0.removerProduto(produto2);
        // The following exception was thrown during execution in test generation
        try {
            com.example.Produto produto4 = carrinhoDeCompras0.getPrimeiroProduto();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        double double1 = carrinhoDeCompras0.calcularTotal();
        double double2 = carrinhoDeCompras0.calcularTotal();
        int int3 = carrinhoDeCompras0.getNumeroDeProdutos();
        double double4 = carrinhoDeCompras0.calcularTotal();
        int int5 = carrinhoDeCompras0.getNumeroDeProdutos();
        double double6 = carrinhoDeCompras0.calcularTotal();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        com.example.Produto produto7 = null;
        carrinhoDeCompras0.removerProduto(produto7);
        int int9 = carrinhoDeCompras0.getNumeroDeProdutos();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.removerProduto(produto5);
        java.lang.Class<?> wildcardClass7 = carrinhoDeCompras0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        com.example.Produto produto7 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto8 = null;
        carrinhoDeCompras0.removerProduto(produto8);
        com.example.Produto produto10 = null;
        carrinhoDeCompras0.removerProduto(produto10);
        com.example.Produto produto12 = null;
        carrinhoDeCompras0.adicionarProduto(produto12);
        com.example.Produto produto14 = null;
        carrinhoDeCompras0.removerProduto(produto14);
        com.example.Produto produto16 = null;
        carrinhoDeCompras0.adicionarProduto(produto16);
        org.junit.Assert.assertNull(produto7);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        com.example.Produto produto7 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto8 = null;
        carrinhoDeCompras0.removerProduto(produto8);
        com.example.Produto produto10 = null;
        carrinhoDeCompras0.removerProduto(produto10);
        com.example.Produto produto12 = null;
        carrinhoDeCompras0.adicionarProduto(produto12);
        int int14 = carrinhoDeCompras0.getNumeroDeProdutos();
        int int15 = carrinhoDeCompras0.getNumeroDeProdutos();
        com.example.Produto produto16 = carrinhoDeCompras0.getPrimeiroProduto();
        org.junit.Assert.assertNull(produto7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNull(produto16);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        com.example.Produto produto7 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto8 = null;
        carrinhoDeCompras0.removerProduto(produto8);
        com.example.Produto produto10 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto11 = carrinhoDeCompras0.getPrimeiroProduto();
        org.junit.Assert.assertNull(produto7);
        org.junit.Assert.assertNull(produto10);
        org.junit.Assert.assertNull(produto11);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.adicionarProduto(produto5);
        com.example.Produto produto7 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto8 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto9 = carrinhoDeCompras0.getPrimeiroProduto();
        com.example.Produto produto10 = null;
        carrinhoDeCompras0.removerProduto(produto10);
        org.junit.Assert.assertNull(produto7);
        org.junit.Assert.assertNull(produto8);
        org.junit.Assert.assertNull(produto9);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        double double1 = carrinhoDeCompras0.calcularTotal();
        double double2 = carrinhoDeCompras0.calcularTotal();
        double double3 = carrinhoDeCompras0.calcularTotal();
        double double4 = carrinhoDeCompras0.calcularTotal();
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.removerProduto(produto5);
        double double7 = carrinhoDeCompras0.calcularTotal();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        com.example.Produto produto5 = null;
        carrinhoDeCompras0.removerProduto(produto5);
        int int7 = carrinhoDeCompras0.getNumeroDeProdutos();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.example.CarrinhoDeCompras carrinhoDeCompras0 = new com.example.CarrinhoDeCompras();
        com.example.Produto produto1 = null;
        carrinhoDeCompras0.adicionarProduto(produto1);
        com.example.Produto produto3 = null;
        carrinhoDeCompras0.adicionarProduto(produto3);
        int int5 = carrinhoDeCompras0.getNumeroDeProdutos();
        com.example.Produto produto6 = null;
        carrinhoDeCompras0.adicionarProduto(produto6);
        int int8 = carrinhoDeCompras0.getNumeroDeProdutos();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = carrinhoDeCompras0.calcularTotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }
}

