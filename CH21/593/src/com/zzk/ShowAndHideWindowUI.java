package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ShowAndHideWindowUI {
    
    public static void main(String args[]) {
        
        try {
            Document document = new Document();// �إߤ��ﹳ
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\��ܩM���í�������.pdf"));// ���p����H�P��X�y
            writer.setViewerPreferences(PdfWriter.HideWindowUI);// �]�w�\Ū�����ìɭ�����
            document.open();// �}�Ҥ��
            for (int i = 1; i <= 100; i++) {
                document.add(new Paragraph("HideWindowUI Row " + i));// �V��󤤼W�[�q�����e
            }
            document.close();// �������
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
