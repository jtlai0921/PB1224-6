package com.zzk;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

public class EditPdfDocumentDemo {
	public static void main(String[] args) {
		createOldFile();// �إ߭��ɮ�
		editOldFile();// �s����ɮ�
	}

	public static void createOldFile() {// �إ߭��ɮת���k
		Document document = new Document();// �إߤ��ﹳ
		try {
			PdfWriter
					.getInstance(document, new FileOutputStream("c:\\����.pdf"));// ���p����H�P��X�y
			document.open();// �}�Ҥ��
			document.add(new Paragraph("First")); // �V��󤤼W�[���e
			document.newPage();
			document.add(new Paragraph("Second")); // �V��󤤼W�[���e
			document.newPage();
			document.add(new Paragraph("Third")); // �V��󤤼W�[���e
			document.close();// �������ﹳ
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

	public static void editOldFile() {// �s����ɮת���k
		try {
			PdfReader reader = new PdfReader("c:\\����.pdf");// �إߡu����.pdf�v��PdfReader�ﹳ
			int totalPages = reader.getNumberOfPages();// ��o�`����
			PdfStamper stamp = new PdfStamper(reader, new FileOutputStream(
					"c:\\�s������{���ɮ�.pdf"));// �إ�PdfStamper�ﹳ
			BaseFont chinese = BaseFont.createFont("STSong-Light",
					"UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);// �w�q�r��
			PdfContentByte under = null;
			for (int i = 1; i <= totalPages; i++) {
				under = stamp.getUnderContent(i);// ��o�C�@�������e
				under.beginText();// �аO�¤�r�}�l
				under.setFontAndSize(chinese, 18);// �]�w�r��M�r��
				under.setTextMatrix(200, 810);// �]�w���X����ܦ�m
				under.showText("��" + i + "��");// �W�[���}
				under.endText();// �аO�¤�r����
				under.beginText();// �аO�¤�r�}�l
				under.setFontAndSize(chinese, 32);// �]�w�r��M�r��
				under.setTextMatrix(100, 750);// �]�w�¤�r����ܦ�m
				under.showText("�s�W�[�����e" + i);// �W�[�s�¤�r
				under.endText();// �аO�¤�r����
			}
			stamp.close();// PdfStamper��H�A�N�q�u����.pdf�v��Ū�������W�[���X��g�J�u�s������{���ɮ�.pdf�v
			File oldFile = new File("c:\\����.pdf");// �إ߭��ɮת�File�ﹳ
			oldFile.delete();// �R�����ɮ�
			File tempFile = new File("c:\\�s������{���ɮ�.pdf");// �إ��{���ɮת�File�ﹳ
			tempFile.renameTo(oldFile);// ���R�W�{���ɮ׬����ɮצW
			tempFile.delete();// �R���{���ɮ�
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