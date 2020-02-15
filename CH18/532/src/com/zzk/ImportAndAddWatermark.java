package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

public class ImportAndAddWatermark {
	public static void main(String[] args) {
		Document document = new Document();// �إߤ��ﹳ
		try {
			PdfWriter.getInstance(document, new FileOutputStream("c:\\���L.pdf"));// ���p����H�P��X�y
			document.open();// �}�Ҥ��
			document.add(new Paragraph("No. One.")); // �V��󤤼W�[���e
			document.add(new Paragraph("No. Two.")); // �V��󤤼W�[���e
			document.add(new Paragraph("No. Three.")); // �V��󤤼W�[���e
			document.add(new Paragraph("No. Four.")); // �V��󤤼W�[���e
			document.add(new Paragraph("No. Five.")); // �V��󤤼W�[���e
			document.close();// �������ﹳ
			PdfReader reader = new PdfReader("c:\\���L.pdf");// �إߡu���L.pdf�v��PdfReader�ﹳ
			PdfStamper stamp = new PdfStamper(reader, new FileOutputStream("c:\\�פJ�üW�[���L.pdf"));// �إ�PdfStamper�ﹳ
			Image img = Image.getInstance("image/watermark.jpg");// �g�W���e
			img.setAbsolutePosition(30, 385);// �w��Ϥ��ﹳ
			PdfContentByte under = stamp.getUnderContent(1);// ��o�Ĥ@�������e
			under.addImage(img);// �W�[�Ϥ�,�������L�\��
			stamp.close();// PdfStamper��H�A�N�q�u���L.pdf�v��Ū�������W�[���L��g�J�u�פJ�üW�[���L.pdf�v
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
