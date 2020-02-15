package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class FitWindowFirstPage {
    
    public static void main(String[] args) {
        
        try {
            Document document = new Document();// �إߤ��ﹳ
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\�Ϥ������A�X��ܲĤ@��.pdf"));// ���p����H�P��X�y
            writer.setViewerPreferences(PdfWriter.FitWindow);// �]�w�\Ū���A�X��ܲĤ@��
            document.open();// �}�Ҥ��
            for (int i = 1; i <= 100; i++) {
                document.add(new Paragraph("Fit show Page 1. row " + i));// �V��󤤼W�[�q�����e
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