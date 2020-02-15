package com.zzk;

import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfGraphics2D;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfGraphics2DRotateShape {
    
    public static void main(String[] args) throws MalformedURLException {
        Document document = new Document();// �إߤ��ﹳ
        try {
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\�ϥ�PdfGraphics2D����ø�s���ϧ�.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            PdfContentByte cb = writer.getDirectContent();// ��o��󤺮e
            PdfGraphics2D g = (PdfGraphics2D) cb.createGraphics(700, 800);// �إ�PdfGraphics2D�ﹳ
            Rectangle2D rect = new Rectangle2D.Double(200, 200, 150, 200);// �إ߯x�ιﹳ
            g.setColor(Color.BLUE);// �]�w�ϧ��C��
            g.rotate(20, 380, 150);// ����ϧ�
            g.draw(rect);// ø�s�x�ιﹳ
            g.dispose();// �G�p
            document.close();// �������
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
