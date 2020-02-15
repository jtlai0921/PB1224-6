package com.zzk;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import com.itextpdf.text.Document;

public class ReaderPdfFile {

	public static void main(String[] args) throws MalformedURLException {
		Document document = new Document();// �إߤ��ﹳ
		File file = new File("c:\\�إ߲Ĥ@��PDF���.pdf");// �إ�File�ﹳ
		try {
			FileInputStream in = new FileInputStream(file);// �إ߿�J�y�ﹳ
			PDFParser parser = new PDFParser(in);// �إ�PDF�ѪR��
			parser.parse();// �ѪRPDF���
			PDDocument pdfdocument = parser.getPDDocument();// ��o�ѪR�᪺PDF���
			PDFTextStripper stripper = new PDFTextStripper();// �إ�PDF�¤�r������
			String msg = stripper.getText(pdfdocument);// �ϥέ������qPDF��󤤭����¤�r��T
			System.out.println("�Ш��쪺PDF�¤�r��T�p�U:\n" + msg);// ��X��T
			in.close();// ������J�y�ﹳ
		} catch (Exception e) {
			e.printStackTrace();
		}
		document.close();// �������
	}
}
