package com.zzk; 

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class AddTitle {
		
	
	public static void main(String[] args){
		Document document=new Document();//�إߤ��ﹳ
		try {
			PdfWriter.getInstance(document, new FileOutputStream("C:\\�W�[���D.pdf"));// ���p����H�P��X�y
			document.addTitle("Java�s�{����");// �V��󤤼W�[���D
			document.open();// �}�Ҥ��
			document.add(new Paragraph("Add Title"));// �V��󤤼W�[���e
			
			document.close();// �������
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}      
	}
}
