package com.zzk;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;

public class CreateAddPhrase {
	public static void main(String args[]){
		Document document = new Document();		//�إߤ��ﹳ
		try {
			PdfWriter.getInstance(document, new FileOutputStream("c:\\book.pdf"));// ���p��H�P��X�y
			document.open();// �}�Ҥ��	
			Phrase phrase1 = new Phrase("BeiJing Olympics");// �إߤl�y�üW�[���e
			document.add(phrase1);
			Phrase phrase2 = new Phrase("One world, one dream!");// �إߤl�y�üW�[���e
			document.add(phrase2);
			document.close();// �������
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
}

