package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class CenterWindow {
    
    public static void main(String[] args) {
        
        try {
            Document document = new Document();// �إߤ��ﹳ
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\�b�̹�������ܤ�����.pdf"));// ���p����H�P��X�y
            writer.setViewerPreferences(PdfWriter.CenterWindow);// �]�w�\Ū���b�̹��������
            document.open();// �}�Ҥ��
            document.add(new Paragraph("ShowCenterWindow"));// �V��󤤼W�[���e
            document.close();// �������
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        
    }
}
