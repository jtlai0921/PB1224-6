package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;

public class AddChapter {
	public static void main(String[] args) {
		Document document = new Document();// �إߤ��ﹳ
		try {
			PdfWriter.getInstance(document,
					new FileOutputStream("C:\\�W�[���`.pdf"));// ���p����H�P��X�y
			document.open();// �}�Ҥ��
			Chapter chapter = new Chapter("This is chapter 1", 1);// �إ߻P�s���`�ﹳ���p�����e
			document.add(chapter);// �V��󤤼W�[���`
			chapter = new Chapter("This is chapter 2", 2);// �إ߻P�s���`�ﹳ���p�����e
			document.add(chapter);// �V��󤤼W�[���`
			chapter = new Chapter("This is chapter 3", 3);// �إ߻P�s���`�ﹳ���p�����e
			document.add(chapter);// �V��󤤼W�[���`
			chapter = new Chapter("This is chapter 4", 4);// �إ߻P�s���`�ﹳ���p�����e
			document.add(chapter);// �V��󤤼W�[���`
			document.close();// �������
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}

	}
}
