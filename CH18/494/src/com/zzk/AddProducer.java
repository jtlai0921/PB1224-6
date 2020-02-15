package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class AddProducer {

	public static void main(String[] args) {
		Document document = new Document();// �إߤ��ﹳ
		try {
			PdfWriter.getInstance(document, new FileOutputStream(
					"C:\\�W�[PDF���s�@��.pdf"));// ���p����H�P��X�y
			document.addProducer();// �V��󤤼W�[�s�@��
			document.open();// �}�Ҥ��
			document.add(new Paragraph("Add Producer."));// �V��󤤼W�[���e
			document.close();// �������
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
