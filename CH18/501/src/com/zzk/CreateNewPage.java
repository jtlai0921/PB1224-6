package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class CreateNewPage {
    
    public static void main(String[] args) {
        Document document = new Document();// �إߤ��ﹳ
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\�إ߷s��.pdf"));// ���p���P��X�y
            document.open();// �}�Ҥ��
            document.add(new Paragraph("Old Page"));// ���Ĥ@���W�[���e
            document.newPage();// �إ߷s����
            document.add(new Paragraph("New Page"));// ���s���W�[���e
            document.close();// �������
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
