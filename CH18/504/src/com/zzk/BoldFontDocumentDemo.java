package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;


public class BoldFontDocumentDemo {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Document document = new Document();// �إߤ��ﹳ
        try {
            PdfWriter.getInstance(document, new FileOutputStream("c:\\Java.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            BaseFont bfChinese = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);// �w�q�򥻦r��
            Font contentFont = new Font(bfChinese, 12, Font.BOLD);// �w�q����r��
            document.add(new Paragraph("www.mingribccd.com",contentFont));// �V��󤤼W�[���e�ë��w����r��
            document.add(new Paragraph("www.mingribook.com"));
            document.close();// �������
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