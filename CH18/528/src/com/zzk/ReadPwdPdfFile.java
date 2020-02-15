package com.zzk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

public class ReadPwdPdfFile {

	public static void main(String[] args) throws MalformedURLException {
		try {
			PdfReader reader = new PdfReader("c:\\�]�w�K�X.pdf", "123".getBytes());// �إߡu���L.pdf�v��PdfReader�ﹳ
			PdfStamper stamp = new PdfStamper(reader, new FileOutputStream(
					"c:\\TempFile.pdf"));// �إ�PdfStamper�ﹳ
			stamp.close();// ����PdfStamper��H�A�ñN�q�u�]�w�K�X.pdf�v��Ū�������e�g�J�uTempFile.pdf�v
			Document document = new Document();// �إߤ��ﹳ
			File file = new File("c:\\TempFile.pdf");// �إ�File�ﹳ
			try {
				FileInputStream in = new FileInputStream(file);// �إ߿�J�y�ﹳ
				PDFParser parser = new PDFParser(in);// �إ�PDF
				parser.parse();// �ѪRPDF���
				PDDocument pdfdocument = parser.getPDDocument();// ��o�ѪR�᪺PDF���
				PDFTextStripper stripper = new PDFTextStripper();// �إ�PDF�¤�r������
				String msg = stripper.getText(pdfdocument);// �ϥέ������qPDF��󤤭����¤�r��T
				System.out.println("�Ш���[�K��PDF�¤�r��T�p�U:\n" + msg);// ��X��T
				in.close();// ������J�y�ﹳ
			} catch (Exception e) {
				e.printStackTrace();
			}
			document.close();// �������
			file.delete();// �R���uTempFile.pdf�v
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