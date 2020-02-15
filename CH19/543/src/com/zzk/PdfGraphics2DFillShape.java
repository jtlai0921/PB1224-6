package com.zzk;

import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfGraphics2D;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfGraphics2DFillShape {
    public static void main(String[] args) throws MalformedURLException {
        Document document = new Document();// �إߤ��ﹳ
        try {
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\�ϥ�PdfGraphics2Dø�s����R�⪺�ϧ�.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            PdfContentByte cb = writer.getDirectContent();// ��o��󤺮e
            PdfGraphics2D g = (PdfGraphics2D) cb.createGraphics(700, 800);// �إ�Graphics�M�y��
            Rectangle2D rect = new Rectangle2D.Double(120, 130, 200, 100);// �إ߯x�ιﹳ
            Ellipse2D circle = new Ellipse2D.Double();// �إ߾��ﹳ
            circle.setFrameFromCenter(220, 80, 370, 120);// �]�w���Ϊ������I�y�ЩM���I�y��
            g.setColor(Color.BLUE);// �]�w�C��
            g.fill(rect);// ø�s��R���x��
            g.setColor(Color.PINK);// �]�w�C��
            g.fill(circle);// ø�s��R�����
            g.dispose();// �G�p
            cb.stroke();// �T�{ø�s�ϧ�
            document.close();// �������
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
