package com.zzk;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfGraphics2D;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfGraphics2DText {
    
    public static void main(String[] args) throws MalformedURLException {
        Document document = new Document();// �إߤ��ﹳ
        try {
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\�ϥ�PdfGraphics2Dø�s�¤�r.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            PdfContentByte cb = writer.getDirectContent();// ��o��󤺮e
            PdfGraphics2D g = (PdfGraphics2D) cb.createGraphics(700, 800);// ��oPdfGraphics2D�ﹳ
            g.drawString("draw text. ", 54, 10);// ø�s�¤�r
            g.drawString("second row text. ", 54, 30);// ø�s�¤�r
            g.drawString("third row text. ", 54, 50);// ø�s�¤�r
            g.dispose();// �G�p
            cb.stroke();// �T�{ø�s�����e
            document.close();// �������
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
