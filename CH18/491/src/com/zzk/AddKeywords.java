package com.zzk;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class AddKeywords {
	public static void main(String[] args){
		Document document=new Document();// �إߤ��ﹳ
		 try {
			PdfWriter.getInstance(document, new FileOutputStream("C:\\Java�s�{����.pdf"));//���p����H�P��X�y
			document.addKeywords("�o�O�@�MJava�}�o�H�����ƪ��ǲ߸귽��Ʈw!");// �V��󤤼W�[����r	
			document.open();// �}�Ҥ��
			document.add(new Paragraph("Keywords"));// �V��󤤼W�[���e	
	        document.close();// �������
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	   }
}
