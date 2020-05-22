package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeVerifierTest {
	
	@Test
	public void givenAString_WhenIsSingle_ThenTrue() {
		
		//Given
		String input = "a";
		boolean expectedResult = true;
		
		//When
		boolean result = PalindromeVerifier.verify(input);
		
		//Then
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	public void givenTwoDifferentCharactes_whnVerify_thenFalse() {
		
		//Given
		String input = "ab";
		boolean expectedResult = false;
				
		//When
		boolean result = PalindromeVerifier.verify(input);
				
		//Then
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void givenTwoEqualCharacters_whneVerify_thenTrue() {
		
		//Given
		String input = "aa";
		boolean expectedResult = true;
						
		//When
		boolean result = PalindromeVerifier.verify(input);
						
		//Then
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void givenThreeLetterWordPalindrome_Whenverify_thenTrue() {
		
		//Given
		String input = "aba";
		boolean expectedResult = true;
								
		//When
		boolean result = PalindromeVerifier.verify(input);
								
		//Then
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	public void givenASentencePalindrome_whenVerify_thenTrue() {
		
		//Given
		String input = "A man nos how";
		boolean expectedResult = true;
		
		//When
		boolean result = PalindromeVerifier.verify(input);
		
		//Then
		assertEquals(expectedResult, result);
	}

}
