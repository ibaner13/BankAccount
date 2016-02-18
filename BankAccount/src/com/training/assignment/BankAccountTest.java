package com.training.assignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

	BankAccount bankacc = new BankAccount();
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Before Called *********");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Called *********");
	}

	@Test(expected = NullPointerException.class)
	public void testBankAccount() {
		bankacc = new BankAccount(0, null, 0.0);
	}

	@Test
	public void testBankAccountLongStringDouble() {
		//fail("Not yet implemented");
		bankacc = new BankAccount(100L, "Ishika", 5000.0);
		assertEquals(100L, bankacc.getAccountNumber());
		assertEquals(5000.0, bankacc.getBalance(), 0);
		assertEquals("Ishika", bankacc.getAccountHolderName());
	}

	@Test
	public void testDepositDoublePositive() {
		//fail("Not yet implemented");
		Double dep = 5000.0;
		assertEquals(dep.getClass(), new Double(bankacc.depositAmount(5000.0)).getClass());
		assertTrue("Balance Positive", bankacc.depositAmount(5000.0)>0);
	}
	
	@Test
	public void testWithdrawNegative() {
		//fail("Not yet implemented");
		bankacc = new BankAccount(100L, "Ishika", 5000.0);
		assertTrue("Balance Negative", bankacc.withdrawAmount(10000.0)<0);
	}
	
	@Test
	public void testDepositAmount() {
		//fail("Not yet implemented");
		bankacc = new BankAccount(100L, "Ishika", 5000.0);
		assertEquals(15000.0, bankacc.depositAmount(10000.0), 0);
	}

	@Test(timeout = 100)
  	public void testInfiniteLoop()
	{
		bankacc = new BankAccount(100L, "Ishika", 5000.0);
		bankacc.withdrawAmount(2000);
	} 
	
	@Test
	public void testWithdrawAmount() {
		fail("Not yet implemented");
	}

}
