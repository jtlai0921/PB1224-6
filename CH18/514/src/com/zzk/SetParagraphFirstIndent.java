package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class SetParagraphFirstIndent {
	public static void main(String[] args){
		Document document = new Document();// �إߤ��ﹳ
		try {
			PdfWriter.getInstance(document, new FileOutputStream("c:\\���q²��.pdf"));// ���p����H�P��X�y
			document.open();// �}�Ҥ��
			Paragraph P1 = new Paragraph("MR company was builded in 1999!");// �إ߬q���üW�[���e
			P1.setFirstLineIndent(20); 		//�]�w�q�������Y��
			document.add(new Paragraph(P1));//�V���W�[�q��
			Paragraph P2 = new Paragraph("Company own about for fifty employees.");//�إ߬q���üW�[���e
			document.add(P2);		//�V���W�[�q��
			document.close();		//�������
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
