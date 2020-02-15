package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class SetCellAlignment {
    
    public static void main(String[] args) {
        
        try {
            Document document = new Document();// �إߤ��ﹳ
            PdfWriter.getInstance(document, new FileOutputStream(
                    "C:\\�]�w�椸�檺����覡.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            PdfPTable table = new PdfPTable(2);// �w�q���
            Paragraph p = new Paragraph("I think Bale will win");// �w�q�q���M���e
            table.addCell("alignment left");// �V�椸��W�[���e
            PdfPCell cell = new PdfPCell(p);// �w�q�椸��
            cell.setHorizontalAlignment(Element.ALIGN_LEFT);// �]�w�椸������V�����
            table.addCell(cell);
            table.addCell("alignment right");// �V�椸��W�[���e
            PdfPCell cell1 = new PdfPCell(p);// �w�q�椸��
            cell1.setHorizontalAlignment(Element.ALIGN_RIGHT);// �]�w�椸������V�k���
            table.addCell(cell1);
            table.addCell("alignment justified");// �V�椸��W�[���e
            PdfPCell cell2 = new PdfPCell(p);// �w�q�椸��
            cell2.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);// �]�w�椸�欰�X�z������覡
            table.addCell(cell2);
            table.addCell("alignment center");// �V�椸��W�[���e
            PdfPCell cell3 = new PdfPCell(p);// �w�q�椸��
            cell3.setHorizontalAlignment(Element.ALIGN_CENTER);// �]�w�椸������V�������
            table.addCell(cell3);
            document.add(table);// �N���W�[����
            document.close();// �������
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
