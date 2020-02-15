package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class SetParagraphSpacingAfter {
	public static void main(String[] args){
		Document document = new Document();		//�إߤ��ﹳ
		try {
			PdfWriter.getInstance(document, new FileOutputStream("c:\\Java.pdf"));// ���p����H�P��X�y
			document.open();					//�}�Ҥ��
			Paragraph paragraph1 = new Paragraph("Java resource");	//�إ߬q���W�[���e
			paragraph1.setSpacingBefore(10); 	//�]�w�q���W��Z
			paragraph1.setSpacingAfter(30); 	//�]�w�q���U��Z
			document.add(paragraph1);			//�V���W�[�q��
			Paragraph paragraph2 = new Paragraph("Java classes introduce");			//�إ߬q���W�[���e
			paragraph2.setSpacingAfter(30); 	//�]�w�q���U��Z
			document.add(paragraph2);			//�V���W�[�q��
			document.close();					//�������
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
