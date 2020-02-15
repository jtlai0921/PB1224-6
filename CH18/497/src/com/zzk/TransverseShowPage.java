package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;

public class TransverseShowPage {

	public static void main(String[] args) {
		Document document = new Document();// �إߤ��ﹳ�]�w���j�p
		try {
			PdfWriter.getInstance(document, new FileOutputStream("c:\\������ܭ���.pdf"));// ���p����H�P��X�y
			Rectangle pageSize= new Rectangle(150,220);// �]�w�����j�p
			pageSize = pageSize.rotate();
			document.setPageSize(pageSize); // �]�w�����j�p
			document.open();// �}�Ҥ��
			document.add(new Paragraph("Page Size"));// �V��󤤼W�[���e   
	        document.close();// �������  
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (DocumentException e1) {
			e1.printStackTrace();
		}			          
	}
}
