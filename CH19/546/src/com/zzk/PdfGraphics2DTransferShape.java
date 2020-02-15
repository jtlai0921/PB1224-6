package com.zzk;

import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfGraphics2D;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfGraphics2DTransferShape {
    
    public static void main(String[] args) {
        Document document = new Document();// �إߤ��ﹳ
        try {
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\�ϥ�PdfGraphics2D����ø�s���ϧ�.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            PdfContentByte cb = writer.getDirectContent();// ��o��󤺮e
            PdfGraphics2D g = (PdfGraphics2D) cb.createGraphics(1200, 800);// �إ�Graphics�M�y��
            Rectangle2D rect = new Rectangle2D.Double(50, 30, 120, 150);// �إ߭�x�ιﹳ
            g.setColor(Color.BLUE);// �]�w�C��
            g.fill(rect);// ø�s����R�⪺�ϧ�
            g.translate(150.0f, 1.0f);// �����x�ιﹳ
            g.setColor(Color.PINK);// �]�w�C��
            g.fill(rect);// ø�s����R�⪺�ϧ�
            g.dispose();// �G�p
            cb.stroke();// �T�{ø�s���e
            document.close();// �������
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
