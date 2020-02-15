package com.zzk;

import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

public class ImportAddNewPageContent {
	public static void main(String[] args) {
		try {
			PdfReader reader = new PdfReader("c:\\�إ߲Ĥ@��PDF���.pdf");// �פJ���
			PdfStamper stamp = new PdfStamper(reader, new FileOutputStream(
					"c:\\�פJ�üW�[�s���M���e.pdf"));// ���p���P��X�y
			BaseFont Chinese = BaseFont.createFont("STSong-Light",
					"UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);// �w�q��¦�r��
			PdfContentByte cb = stamp.getOverContent(1);// ��o�Ĥ@�����e
			cb.beginText();// �g���e
			cb.setFontAndSize(Chinese, 25);// �]�w�r���ݩ�
			cb.setTextMatrix(15, 15);// �]�w�x�}(�y��)
			cb.showText("�Ĥ@��");// �x�}�B��ܯ¤�r
			cb.showTextAligned(Element.ALIGN_CENTER, "�s�W�����e�C", 180, 760, 0);// �]�w�¤�r����A���e�A��m�M���ਤ��
			cb.endText();// ���e����
			stamp.insertPage(2, PageSize.A4);// �W�[�s��
			cb = stamp.getOverContent(2);// ��o��2�����e
			cb.beginText();// �g���e
			cb.setFontAndSize(Chinese, 20);// �]�w�r���ݩ�
			cb.showTextAligned(Element.ALIGN_LEFT, "�b�s�W�������W�[�����e�C", 100, 600, 0);// �]�w�¤�r����A���e�A��m�M���ਤ��
			cb.endText();// ���e����
			stamp.close();// ����
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
