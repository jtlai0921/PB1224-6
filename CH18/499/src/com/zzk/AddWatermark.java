package com.zzk;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

public class AddWatermark {
	public static void main(String[] args) {
		Document document = new Document();// �إߤ��ﹳ
		try {
			PdfWriter.getInstance(document, new FileOutputStream(
					"c:\\tempWatermark.pdf"));// ���p����H�P�{���ɮת���X�y
			document.open();// �}�Ҥ��
			document.add(new Paragraph(" ")); // �V��󤤼W�[���e
			document.close();// �������ﹳ
			PdfReader reader = new PdfReader("c:\\tempWatermark.pdf");// �إߡutempWatermark.pdf�v��PdfReader�ﹳ
			PdfStamper stamp = new PdfStamper(reader, new FileOutputStream(
					"c:\\�W�[���L.pdf"));// �إ�PdfStamper�ﹳ
			Image img = Image.getInstance("image/watermark.jpg");// �إ߹ϧιﹳ
			img.setAbsolutePosition(50, 385);// �w��Ϥ��ﹳ
			PdfContentByte under = stamp.getUnderContent(1);// ��o�Ĥ@�������e
			under.addImage(img);// �W�[�Ϥ�,�������L�\��
			BaseFont chinese = BaseFont.createFont("STSong-Light",
					"UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);// �w�q�r��
			under.beginText();// �аO�¤�r�}�l
			under.setFontAndSize(chinese, 42);// �]�w�r��M�r��
			under.setTextMatrix(70, 550);// �]�w�W�[���e����ܦ�m
			under.showText("�U���O�W�[�����L�Ϥ�.");// �W�[���e
			under.endText();// �аO�¤�r����
			stamp.close();// PdfStamper��H�A�N�q�utempWatermark.pdf�v��Ū�������W�[���L��g�J�u�W�[���L.pdf�v
			File file = new File("c:\\tempWatermark.pdf");// �إ��{���ɮת�File�ﹳ
			file.delete();// �R���{���ɮ�
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