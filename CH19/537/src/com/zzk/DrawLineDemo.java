package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

public class DrawLineDemo {
    
    public static void main(String[] args) {
        Document document = new Document();// �إߤ��ﹳ
        try {
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\ø�s���u.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            PdfContentByte cb = writer.getDirectContent();// ��o���e
            cb.moveTo(50, 780); // ø�s�_�I�y��
            cb.lineTo(260, 780); // ø�s���I�y��
            cb.stroke(); // �T�{���u��ø�s
            cb.moveTo(50, 750);
            cb.lineTo(260, 750);
            cb.stroke();
            cb.moveTo(50, 720);
            cb.lineTo(260, 720);
            cb.stroke();
            document.close();// �������
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
