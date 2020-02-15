package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class CreateTable {
    
    public static void main(String[] args) {
        
        try {
            Document document = new Document();// �إߤ��ﹳ
            PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\�إߪ��.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            BaseFont Chinese = BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);// �w�q�򥻦r��
            Font FontChinese = new Font(Chinese, 12, Font.NORMAL);// ��ҤƦr��
            PdfPTable table = new PdfPTable(3);// �إߪ��
            // �N�椸�涶�����[�J����A��@��R���ɦ۰ʴ���
            table.addCell("1.1");
            table.addCell("1.2");
            table.addCell("1.3");
            table.addCell("2.1");
            table.addCell("2.2");
            table.addCell("2.3");
            table.addCell("3.1");
            table.addCell("3.2");
            table.addCell("3.3");
            document.add(new Paragraph("                    �o�O�@��3��3�C�����\n.",
                    FontChinese));// �V���W�[���e
            document.add(table);// �N���W�[����
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