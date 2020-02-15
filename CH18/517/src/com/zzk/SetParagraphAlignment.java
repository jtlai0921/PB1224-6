package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class SetParagraphAlignment {
	
	
	public static void main(String[] args){
		Document document = new Document();// �إߤ��ﹳ
		try {
			PdfWriter.getInstance(document, new FileOutputStream("c:\\Java.pdf"));// ���p����H�P��X�y
			document.open();// �}�Ҥ��
			Paragraph paragraph1 = new Paragraph("www.mingrosoft.com");// �إ߬q���üW�[���e
			paragraph1.setAlignment(Element.ALIGN_LEFT); // �����
			document.add(new Paragraph(paragraph1));     // �V���W�[�q��	
			Paragraph paragraph2 = new Paragraph("www.mingribook.com");// �إ߬q���üW�[���e
			paragraph2.setAlignment(Element.ALIGN_RIGHT);// �k���
			document.add(new Paragraph(paragraph2));	 // �V���W�[�q��
					
			Paragraph paragraph3 = new Paragraph("www.mingribccd.com"); // �إ߬q���üW�[���e
			paragraph3.setAlignment(Element.ALIGN_CENTER);// �~����� 
			document.add(new Paragraph(paragraph3));	  // �V���W�[�q��	
			document.close();// �������
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	 }
}

