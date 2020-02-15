package zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class AddUnderline {
	
	
	public static void main(String[] args){
		Document document = new Document();// �إߤ��ﹳ
		try {
			PdfWriter.getInstance(document, new FileOutputStream("C:\\������²��.pdf"));// ���p����H�P��X�y
			document.open();// �}�Ҥ��
			document.add(new Paragraph("Generalize"));// �V��󤤼W�[���e
			document.add(new Paragraph("Welcome to GuangZhou�I", FontFactory.getFont(FontFactory.HELVETICA,15,Font.UNDERLINE)));// �V��󤤼W�[���e
			document.close();// �������
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}

