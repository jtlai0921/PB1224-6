package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class SetAbsoluteWidth {
    
    public static void main(String[] args) {
        
        try {
            Document document = new Document();// �إߤ��ﹳ
            PdfWriter.getInstance(document, new FileOutputStream(
                    "C:\\�]�w����e��.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            BaseFont Chinese = BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);// �w�q�򥻦r��
            Font FontChinese = new Font(Chinese, 10, Font.NORMAL);// ��ҤƦr��
            PdfPTable table1 = new PdfPTable(3);// �w�q���
            PdfPCell cell1 = new PdfPCell(new Paragraph("new table colspan 3"));// �w�q�@�Ӫ��椸
            cell1.setColspan(3);// �]�w�����
            table1.addCell(cell1);// �N�椸�[�J����
            table1.addCell("1.1");// �N�椸�涶�����[�J����A��@��R���ɦ۰ʴ���
            table1.addCell("2.1");
            table1.addCell("3.1");
            table1.addCell("1.2");
            table1.addCell("2.2");
            table1.addCell("3.2");
            table1.addCell("1.3");
            table1.addCell("2.3");
            table1.addCell("3.3");
            PdfPTable table2 = new PdfPTable(3);// �w�q���
            PdfPCell cell2 = new PdfPCell(new Paragraph("new table colspan 3"));// �w�q�@�Ӫ��椸
            cell2.setColspan(3);// �]�w�����
            table2.addCell(cell2);// �N�椸�[�J����
            table2.addCell("1.1");// �N�椸�涶�����[�J����A��@��R���ɦ۰ʴ���
            table2.addCell("2.1");
            table2.addCell("3.1");
            table2.addCell("1.2");
            table2.addCell("2.2");
            table2.addCell("3.2");
            table2.addCell("1.3");
            table2.addCell("2.3");
            table2.addCell("3.3");
            table2.setTotalWidth(200);// �]�w���e�׬�200
            table2.setLockedWidth(true);// ��w�e��
            document.add(new Paragraph("                  �w�]�����\n\n", FontChinese));
            document.add(table1);// �N���W�[����
            document.add(new Paragraph("                  �]�w���e��200",
                    FontChinese));
            document.add(table2);// �N���W�[����
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