package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class SetPassWord {
	
	
	public static void main(String[] args) {
		Document document = new Document();// �إߤ��ﹳ
		try {
			PdfWriter writer = PdfWriter.getInstance(document,
					new FileOutputStream("C:\\�]�w�K�X.pdf"));// ���p����H�P��X�y
			writer.setEncryption("zzk".getBytes(), "123".getBytes(),
					PdfWriter.ALLOW_COPY, PdfWriter.STANDARD_ENCRYPTION_128);// �]�w�K�X�ѼƩM�`��
			document.open();// �}�Ҥ��
			document.add(new Paragraph("Set Encryption"));// �V���W�[���e
			document.close();// �������
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
