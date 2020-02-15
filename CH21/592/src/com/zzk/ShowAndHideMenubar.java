package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ShowAndHideMenubar {
    
    public static void main(String args[]) {
        
        try {
            Document document = new Document();// �إߤ��ﹳ
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\��ܩM���ÿ��.pdf"));// ���p����H�P��X�y
            writer.setViewerPreferences(PdfWriter.HideMenubar);// �]�w�\Ū�����ÿ��
            document.open();// �}�Ҥ��
            document.add(new Paragraph("HideMenubar."));// �V��󤤼W�[���e
            document.close();// �������
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
