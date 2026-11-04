package com.creatio.crm.framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfUtil {
public static String pdfReadData(String fileName,int startPage,int endPage) {
	
	String data="";
	
	try {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\Files\\"+fileName);
		PDDocument pd=  PDDocument.load(fis);
		//pd.load(fis);
		PDFTextStripper pdf = new PDFTextStripper();
		pdf.setStartPage(startPage);
		pdf.setEndPage(endPage);
		data=pdf.getText(pd);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return data;
	
}
}
