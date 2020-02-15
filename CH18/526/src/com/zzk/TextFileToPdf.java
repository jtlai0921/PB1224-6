package com.zzk;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

public class TextFileToPdf {

	public static void main(String[] args) {
		// �N�¤�r�ɮ�oldTextFile.txt�ରPDF�ɮ�newPdfFile.pdf
		txtFileToPdfFile("textFile\\oldTextFile.txt", "C:\\newPdfFile.pdf");
	}

	/**
	 * �N�¤�r�ɮ��ରPDF�ɮת���k
	 * @param txtFile ��¤�r�ɮת����|
	 * @param pdfFile ����pdf�ɮת����|
	 */
	private static void txtFileToPdfFile(String txtFile, String pdfFile) {
		Document doc = new Document();// �إߤ��ﹳ
		try {
			FileReader fileRead = new FileReader(txtFile);// �إߦr�Ŭy�ﹳ
			BufferedReader read = new BufferedReader(fileRead);// �إߦr�Žw�Ĭy�ﹳ
			PdfWriter.getInstance(doc, new FileOutputStream(pdfFile));// ���p���M��X�y�ﹳ
			doc.open();// �}�Ҥ��
			BaseFont Chinese = BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			Font fontChinese = new Font(Chinese, 18, Font.BOLDITALIC,
					BaseColor.BLUE);// ��ҤƦr�����O�B�]�w�r��j�p�M�C��
			String line = null;// �x�s�q�¤�r�ɮפ�Ū�������e
			while ((line = read.readLine()) != null) {// Ū���@���T
				doc.add(new Paragraph(line, fontChinese));// �NŪ������T�W�[����
			}
			doc.close();// �������ﹳ
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
