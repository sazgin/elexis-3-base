package ch.elexis.ebanking;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import ch.elexis.ebanking.parser.Camt054Parser;


public class Test_Camt054Format {
	
	@Test
	public void testAmountFormat(){
		Assert.assertEquals(null, new Camt054Parser().formatAmount(null));
		
		Assert.assertEquals("0", new Camt054Parser().formatAmount(BigDecimal.ZERO));
		Assert.assertEquals("100", new Camt054Parser().formatAmount(new BigDecimal("1")));
		Assert.assertEquals("1000", new Camt054Parser().formatAmount(new BigDecimal("10")));
		Assert.assertEquals("21900", new Camt054Parser().formatAmount(new BigDecimal("219")));
		Assert.assertEquals("21900", new Camt054Parser().formatAmount(new BigDecimal("219.0")));
		Assert.assertEquals("21900", new Camt054Parser().formatAmount(new BigDecimal("219.00")));
		Assert.assertEquals("13050", new Camt054Parser().formatAmount(new BigDecimal("130.5")));
		Assert.assertEquals("13050", new Camt054Parser().formatAmount(new BigDecimal("130.50")));
		Assert.assertEquals("25100", new Camt054Parser().formatAmount(new BigDecimal("251")));
	}
}
