package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

public class SetSubSupScrip {
	public static void main(String[] args) {
		Document document = new Document();// �إߤ��ﹳ
		try {
			PdfWriter.getInstance(document, new FileOutputStream(
					"C:\\�]�w�W�ЩM����.pdf"));// ���p����H�P��X�y
			document.open();
			BaseFont Chinese = BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			Font fontChinese = new Font(Chinese, 20, Font.NORMAL);// ��ҤƦr�����O�P�]�w�r��j�p�ݩ�
			document.add(new Paragraph("�U���O�ϥΤW�Ъ��ĪG�G", fontChinese));// �W�[�q��
			Chunk chunk = new Chunk("X");// �إ߶�
			document.add(chunk);// �V���W�[���e
			chunk = new Chunk("2");// �إ߶�
			chunk.setTextRise(4.0f);// ���ɶ��¤�r
			document.add(chunk);// �W�[��
			chunk = new Chunk("+Y");// �إ߶�
			document.add(chunk);// �W�[��
			chunk = new Chunk("2");// �إ߶�
			chunk.setTextRise(4.0f);// ���ɶ��¤�r
			document.add(chunk);// �W�[��
			document.add(new Paragraph("�U���O�ϥί��ު��ĪG�G", fontChinese));// �W�[�q��
			chunk = new Chunk("M");// �إ߶�
			document.add(chunk);// �W�[��
			chunk = new Chunk("2");// �إ߶�
			chunk.setTextRise(-3.0f);// ���C���¤�r
			document.add(chunk);// �W�[��
			chunk = new Chunk("+N");// �إ߶�
			document.add(chunk);// �W�[��
			chunk = new Chunk("2");// �إ߶�
			chunk.setTextRise(-3.0f);// ���C���¤�r
			document.add(chunk);// �W�[��
			document.close();// �������
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