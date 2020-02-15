package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class SetParagraphLeftRightIndent {
	
	
	public static void main(String[] args){
		Document document = new Document();// �إߤ��ﹳ
		try {
			PdfWriter.getInstance(document, new FileOutputStream("C:\\Java�s�{����.pdf"));// ���p����H�P��X�y
			document.open();// �}�Ҥ��
			Paragraph paragraph1 = new Paragraph("The Paragraph IndentLeft");// ��ҤƬq���üW�[���e
			paragraph1.setIndentationLeft(100);// �q�����Y��
			document.add(paragraph1);// �V��󤤼W�[�q��
			Paragraph paragraph2 = new Paragraph("The Paragraph IndentRight");// ��ҤƬq���üW�[���e
			paragraph2.setIndentationRight(100);// �q���k�Y��
			document.add(paragraph2);// �V��󤤼W�[�q��
			document.close();// �������
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}