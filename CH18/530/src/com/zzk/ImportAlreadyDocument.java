package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

public class ImportAlreadyDocument {

	public static void main(String[] args) {
		try {
			PdfReader reader = new PdfReader("c:\\newPdfFile.pdf");// �إߤw�����PdfReader�ﹳ
			PdfStamper stamp = new PdfStamper(reader, new FileOutputStream(
					"c:\\�פJ�w�����.pdf"));// ���p�w�����P��X�y
			stamp.close();// ����PdfStamper��H�A�������פJ�\��
			JOptionPane.showMessageDialog(null, "�פJ���\...\n�����w����󪺶פJ�C");
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