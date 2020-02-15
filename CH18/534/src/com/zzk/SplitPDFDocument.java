package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfReader;

public class SplitPDFDocument {
	public static void main(String[] args) {
		String filePathFile = "c:\\A.pdf ";// �ݭn���������
		PdfReader reader = null;// �ŧiPdfReader�ﹳ
		try {
			reader = new PdfReader(filePathFile);// �إ�PdfReader�ﹳ
		} catch (IOException e) {
			e.printStackTrace();
		}
		int pageN = reader.getNumberOfPages();// ��o�ɮפ�������
		for (int i = 0; i < pageN; i++) {// �`���V�~�����
			Document document = new Document(reader
					.getPageSizeWithRotation(i + 1));// �إߤ�� �P����o�e���`������
			PdfCopy copy = null;
			try {
				int len = filePathFile.length();// ��o�ɮק�����|������
				String noExt = filePathFile.substring(0, len - 5);// �h���ɮ��X�R�W�᪺���|
				String fileName = noExt + "-" + (i + 1) + ".pdf";// ����Უ�ͪ��ɮצW��
				copy = new PdfCopy(document, new FileOutputStream(fileName));// �إ߫��������p���P��X�y�ﹳ
				document.open();// �}�Ҥ��
				copy.addPage(copy.getImportedPage(reader, i + 1));// �ھ���o�����إ߷s���
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
}
