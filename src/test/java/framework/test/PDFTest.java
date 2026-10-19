package framework.test;

import framework.utilities.PdfUtil;

public class PDFTest {
public static void main(String[] args) {
	String data=PdfUtil.readData("Ramyaresume.pdf", 1, 2);
	System.out.println(data);
	
}
}
