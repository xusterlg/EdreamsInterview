package com.edreams.interview;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewApplication {

	static String[][] MATRIX ={
		{"1","A","5","7","B","N"},
		{"2","B","6","8","K","R"},
		{"5","Q","N","3","B","1"}
	};
		
	
	public static void main(String[] args) {
		StringBuilder output = new StringBuilder();
        int width = MATRIX[0].length;
        int height = MATRIX.length;
        int iterations = width + height - 1;
        //This loop is dynamyc in the case that the matrix being longer
        for (int widthIterator = 0; widthIterator < iterations; widthIterator++){
            String diagonal = "";
            for (int heightIterator = Math.max(widthIterator - (width - 1), 0);
                 heightIterator <= Math.min(widthIterator, height - 1);
                 heightIterator++){
                diagonal += MATRIX[heightIterator][widthIterator - heightIterator];
            }
            output.append(diagonal + " ");
        }
        System.out.println(output.toString().trim());
    }

}
