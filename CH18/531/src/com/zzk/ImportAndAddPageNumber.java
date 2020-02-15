package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

public class ImportAndAddPageNumber {
    public static void main(String[] args) {
        Document document = new Document();// �إߤ��ﹳ
        try {
            PdfWriter.getInstance(document, new FileOutputStream("c:\\���X.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            document.add(new Paragraph("No. 1 page")); // �V��󤤼W�[���e
            document.newPage();
            document.add(new Paragraph("No. 2 page")); // �V��󤤼W�[���e
            document.close();// �������ﹳ
            PdfReader reader = new PdfReader("c:\\���X.pdf");// �إߡu���X.pdf�v��PdfReader�ﹳ
            int totalPages = reader.getNumberOfPages();
            PdfStamper stamp = new PdfStamper(reader, new FileOutputStream(
                    "c:\\�פJ�üW�[���X.pdf"));// �إ�PdfStamper�ﹳ
            BaseFont chinese = BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
            PdfContentByte under = null;
            for (int i = 1; i <= totalPages; i++) {
                under = stamp.getUnderContent(i);// ��o�C�@�������e
                under.beginText();// �аO�¤�r�}�l
                under.setFontAndSize(chinese, 18);// �]�w�r��M�r��
                under.setTextMatrix(280, 15);// �]�w���X����ܦ�m
                under.showText("��" + i + "��");// �W�[���}
                under.endText();// �аO�¤�r����
            }
            stamp.close();// PdfStamper��H�A�N�q�u���X.pdf�v��Ū�������W�[���X��g�J�u�W�[���X.pdf�v
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
