package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class SetParagraphFontSize {
			
	
	public static void main(String[] args){
		Document document = new Document();// �إߤ��ﹳ
		try {
			PdfWriter.getInstance(document, new FileOutputStream("c:\\�ӤH²��.pdf"));// ���p����H�P��X�y
			document.open();// �}�Ҥ��
			document.add(new Paragraph("Personal Resumes",FontFactory.getFont(FontFactory.HELVETICA,50,Font.BOLDITALIC)));// �w�q�q���r���ݩʨüW�[���e
			document.close();// �������
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
