package com.zzk;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class SetParagraphColor {
	public static void main(String[] args){
		Document document = new Document();// �إߤ��ﹳ
		try {
			PdfWriter.getInstance(document, new FileOutputStream("c:\\Java���O�w�ѦҤ�U.pdf"));// ���p����H�P��X�y
			document.open();// �}�Ҥ��
			Paragraph paragraph = new Paragraph(new Paragraph("JFrame Class Member List",FontFactory.getFont(FontFactory.HELVETICA, 30, BaseColor.BLUE )));// �إ߬q���w�q�r��üW�[���e
			paragraph.setFirstLineIndent(100); // �]�w�q�������Y��
			document.add(paragraph);// �V���W�[�q��
			document.close();// �������
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
