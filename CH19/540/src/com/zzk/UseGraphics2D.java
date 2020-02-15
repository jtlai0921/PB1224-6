package com.zzk;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

public class UseGraphics2D {
    
    public static void main(String[] args) throws MalformedURLException {
        Document document = new Document(); // �إߤ��ﹳ
        try {
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\�ϥ�Graphics2Dø�s�ϧ�.pdf"));// ���p����H�P��X�y
            document.open(); // �}�Ҥ��
            PdfContentByte cb = writer.getDirectContent(); // ��o��󤺮e
            Graphics2D g = cb.createGraphics(850, 850); // �إ�Graphics�M�y��
            Rectangle2D rect1 = new Rectangle2D.Double(50, 50, 200, 150); // �إ߯x�ιﹳ
            g.draw(rect1); // ø�s�x��
            Rectangle2D rect2 = new Rectangle2D.Double(70, 70, 160, 110); // �إ߯x�ιﹳ
            g.fill(rect2); // ø�s��R�x��
            g.dispose(); // �G�p
            cb.stroke(); // �T�{ø�s���ϧ�
            document.close(); // �������
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
