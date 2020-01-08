package ex;//anche se S59 e questo test non si trovano nella stessa folder, sono nello stesso package. Questo rende visibile i metodi protetti

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class S59Test2 {

	@Test
	void testMultiplicationTablePlain() {//plain=caso normale
		int [][] actual = S59.multiplicationTable(3);
		
		int [][] expected= {
				{1,2,3},
				{2,4,6},
				{3,6,9} };
		
		assertEquals(expected.length, actual.length); //mi aspetto che le righe di expected e di actual siano le stesse. nelle matrici la length è il numero di righe degli array		
		}
		
	}


