package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;



public class CreateAddParagraph {
	public static void main(String[] args){
		Document document = new Document();	//�إߤ��ﹳ
		try {
			PdfWriter.getInstance(document, new FileOutputStream("c:\\Java�s�{����.pdf"));	//���p����H�P��X�y
			document.open();				//�}�Ҥ��
			Paragraph P1 = new Paragraph("Java programming dictionary");	
			//�إ߬q���üW�[���e
			document.add(P1);		//�V���W�[�q��
			Paragraph P2 = new Paragraph("The richest resource for learning");
			document.add(P2);		//�V���W�[�q��		
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (DocumentException e) {
				e.printStackTrace();
		}
		finally{
			document.close();		//�������	
		}
	}
}
