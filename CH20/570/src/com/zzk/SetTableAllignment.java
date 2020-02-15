package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class SetTableAllignment {
    
    public static void main(String[] args) {
        
        try {
            Document document = new Document();// �إߤ��ﹳ
            PdfWriter.getInstance(document, new FileOutputStream(
                    "C:\\�]�w������覡.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            BaseFont Chinese = BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);// �w�q�򥻦r��
            Font FontChinese = new Font(Chinese, 10, Font.BOLD);// ��ҤƦr��
            PdfPTable table = new PdfPTable(3);// �w�q���
            table.setTotalWidth(200);// �]�w���e�׬�200
            table.setLockedWidth(true);
            PdfPCell cell = new PdfPCell(new Paragraph("new table colspan 3"));// �w�q�@�Ӫ��椸
            cell.setColspan(3);// �]�w�����
            table.addCell(cell);// �N�椸�[�J����
            // �N�椸�涶�����[�J����A��@��R���ɦ۰ʴ���
            table.addCell("1.1");
            table.addCell("2.1");
            table.addCell("3.1");
            table.setHorizontalAlignment(Element.ALIGN_LEFT);// �]�w��������覡 �~��
            
            PdfPTable table1 = new PdfPTable(3);// �w�q���
            table1.setTotalWidth(200);// �]�w���e�׬�200
            table1.setLockedWidth(true);
            PdfPCell cell2 = new PdfPCell(new Paragraph("new table colspan 3"));// �w�q�@�Ӫ��椸
            cell2.setColspan(3);// �]�w�����
            table1.addCell(cell2);// �N�椸�[�J����
            // �N�椸�涶�����[�J����A��@��R���ɦ۰ʴ���
            table1.addCell("1.1");
            table1.addCell("2.1");
            table1.addCell("3.1");
            table1.setHorizontalAlignment(Element.ALIGN_CENTER);// �]�w��������覡 �~��
            PdfPTable table2 = new PdfPTable(3);// �w�q���
            table2.setTotalWidth(200);// �]�w���e�׬�200
            table2.setLockedWidth(true);
            PdfPCell cell3 = new PdfPCell(new Paragraph("new table colspan 3"));// �w�q�@�Ӫ��椸
            cell3.setColspan(3);// �]�w�����
            table2.addCell(cell2);// �N�椸�[�J����
            // �N�椸�涶�����[�J����A��@��R���ɦ۰ʴ���
            table2.addCell("1.1");
            table2.addCell("2.1");
            table2.addCell("3.1");
            table2.setHorizontalAlignment(Element.ALIGN_RIGHT);// �]�w��������覡 �~�k
            Paragraph p = new Paragraph("���~�����\n\n", FontChinese);
            p.setAlignment(Element.ALIGN_LEFT);
            document.add(p);// �V���W�[���e
            document.add(table);// �N���W�[����
            Paragraph p2 = new Paragraph("���~�����\n\n", FontChinese);
            p2.setAlignment(Element.ALIGN_CENTER);
            document.add(p2);// �V���W�[���e
            document.add(table1);// �N���W�[����
            Paragraph p3 = new Paragraph("���~�k���\n\n", FontChinese);
            p3.setAlignment(Element.ALIGN_RIGHT);
            document.add(p3);// �V���W�[���e
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