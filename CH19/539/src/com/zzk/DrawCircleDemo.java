package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

public class DrawCircleDemo {
    
    public static void main(String[] args) {
        Document document = new Document();// �إߤ��ﹳ
        try {
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\ø�s���.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            PdfContentByte cb = writer.getDirectContent();// ��o���e
            cb.circle(120, 720, 80); // ø�s���
            cb.stroke();// �T�{ø�s�����
            cb.circle(120, 720, 40); // ø�s���
            cb.fill();// ��R���
            cb.fillStroke();// �T�{ø�s����R���
            document.close();// �������
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
