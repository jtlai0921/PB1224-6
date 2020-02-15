package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class OnlyShowOnePage {
    
    public static void main(String[] args) {
        
        try {
            Document document = new Document();// �إߤ��ﹳ
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\�u��ܤ@�ӭ���.pdf"));// ���p����H�P��X�y
            writer.setViewerPreferences(PdfWriter.PageLayoutSinglePage);// �]�w�\Ū���u��ܤ@�ӭ���
            document.open();// �}�Ҥ��
            document.add(new Paragraph("PageLayoutSinglePage 1"));// �V��󤤼W�[���e
            document.newPage();// �W�[�s��
            document.add(new Paragraph("PageLayoutSinglePage 2"));// �V��󤤼W�[���e
            document.close();// �������
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        
    }
}
