package com.zzk;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfGraphics2D;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfGraphics2DPicture {
    
    public static void main(String[] args) {
        Document document = new Document(); // �}�Ҥ��
        try {
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream("c:\\�ϥ�PdfGraphics2Dø�s�Ϥ�.pdf"));// ���p���P��X�y
            document.open();// �}�Ҥ��
            PdfContentByte cb = writer.getDirectContent();// ��o��󤺮e
            PdfGraphics2D g = (PdfGraphics2D) cb.createGraphics(700, 800);// �إ�PdfGraphics2D�ﹳ
            BufferedImage image = ImageIO.read(new File("image/picture.jpg"));// ��o�Ϥ�
            g.drawImage(image, 50, 10, null);// ø�s�Ϥ�
            g.dispose();// �G�p
            cb.stroke();// �T�{ø�s�����e
            document.close();// �������
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
