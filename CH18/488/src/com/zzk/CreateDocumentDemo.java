package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class CreateDocumentDemo {
    
    /**
     * @param args
     */
	public static void main(String[] args) {
        try {
            Document document = new Document();				// �إߤ��ﹳ
            PdfWriter.getInstance(document, new FileOutputStream("c:\\�إ߲Ĥ@��PDF���.pdf"));// ���p����H�P��X�y
            document.open();							// �}�Ҥ��
            document.add(new Paragraph("First Document."));		// �V��󤤼W�[���e
            document.add(new Paragraph("Success."));			// �V��󤤼W�[���e
            document.close();							// �������
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        
    }

}
