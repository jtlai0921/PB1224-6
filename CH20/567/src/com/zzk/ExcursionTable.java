package com.zzk;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfWriter;

public class ExcursionTable {
    
    public static void main(String[] args) {
        
        try {
            Document document = new Document();// �إߤ��ﹳ
            PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\�������.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            BaseFont Chinese = BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);// �w�q�򥻦r��
            Font FontChinese = new Font(Chinese, 10, Font.NORMAL);// ��ҤƦr��
            Table table = new Table(3);// �إߪ��
            table.setBorderWidth(1);// �]�w�����ؼe��
            table.setBorderColor(Color.blue);// �]�w�������C��
            table.setSpacing(5);// �]�w���P�椸�檺���Z
            table.setPadding(5);// �]�w�椸��P���e�����Z
            table.addCell("1.1");// �W�[�椸��
            table.addCell("1.2");
            table.addCell("1.3");
            document
                    .add(new Paragraph("                     ����C", FontChinese));// �V���W�[���e
            document.add(table);// �V���W�[���
            document.add(new Paragraph("                     �w�]���Z���C",
                    FontChinese));
            document.add(table);
            document.add(new Paragraph("                     �]�w��氾���Ȭ�0���Z���C",
                    FontChinese));
            table.setOffset(0);// �]�w��氾���ƭ�
            document.add(table);
            document.add(new Paragraph("                     �]�w��氾���Ȭ�-15���Z���C",
                    FontChinese));
            table.setOffset(-15);// �]�w��氾���ƭ�
            document.add(table);
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