package com.cifpcarballeira.katas.TestFizzBuzz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.cifpcarballeira.katas.FizzBuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alex
 */
public class TestFizzBuzz {
    
    public TestFizzBuzz() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test1devuelve1() {
    FizzBuzz fb = new FizzBuzz();
    String result = fb.getFizzBuzz(1);
    assertEquals("1",result);
    
    }
    
    @Test
    public void test2devuelve2() {
    FizzBuzz fb = new FizzBuzz();
    String result = fb.getFizzBuzz(2);
    assertEquals("2",result);
    
    }
}
