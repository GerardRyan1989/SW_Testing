/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author t00189548
 */
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/** A sample parameterized test-case. 
 * @version $Id: ParameterizedTest.java 551 2010-03-06 11:37:34Z paranoid12 $
 */

@RunWith(value=Parameterized.class) 	
public class ParameterizedTest{
    private double expected; 	
   
    private double amount; 
    private double rate; 
    private int period; 

    @Parameters 			
    public static Collection<Object[]> getTestParameters() {
        return Arrays.asList(new Object[][] {
          {6374.11, 5000.0, 10.0, 5},  //expected,  amount, rate, period 
          {10000.11, 50000.0, 1.0, 0},
          {6374.11, 5000.0, 10.0, 5}, //expected,  amount, rate, period    
        });
           
   }
   
    public ParameterizedTest(double expected,  double amount, double rate, int period) {   
       this.expected = expected;
       this.amount = amount;
       this.rate = rate;
       this.period = period;
    }
    
    @Test			
    public void TestTotalPayment_Calc() {
        System.out.println("Test TotalPayment" + amount);
       Loan calc = new Loan(amount, rate, period);  
       assertEquals(expected, calc.getTotalPayment(), 0.5);     
    } 
}
 