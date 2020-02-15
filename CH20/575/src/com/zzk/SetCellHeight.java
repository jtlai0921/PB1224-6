package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class SetCellHeight {
    
    public static void main(String[] args) {
        
        try {
            Font font = FontFactory.getFont("COURIER", 10, Font.BOLD);// �w�q�@�Ӧr��
            Font xfont = FontFactory.getFont("HELVETICA", 10, Font.BOLD);// �w�q�@�Ӧr��
            Document document = new Document();// �إߤ��ﹳ
            PdfWriter.getInstance(document, new FileOutputStream(
                    "C:\\�]�w�椸�檺����.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            PdfPTable table = new PdfPTable(2);// �w�q���
            table.getDefaultCell().setBackgroundColor(BaseColor.ORANGE);
            table.addCell(new Paragraph("default height", xfont));// �V���W�[�椸��
            PdfPCell cell = new PdfPCell(new Paragraph("AAA", font));// �w�q�@�Ӫ��椸
            table.addCell(cell);// �V���W�[�椸��
            table.addCell(new Paragraph("set height", xfont));
            PdfPCell cell2 = new PdfPCell(new Paragraph("ABC", font));// �w�q�椸��
            cell2.setFixedHeight(60);// �]�w�椸�氪�׬�60
            table.addCell(cell2);// �N�椸�[�J����
            table.addCell(new Paragraph("minimum height", xfont));
            PdfPCell cell3 = new PdfPCell(new Paragraph(
                    "A cat may look at a king.", font));// �w�q�椸��
            cell3.setMinimumHeight(40);// �]�w�椸�氪�׬�40
            table.addCell(cell3);// �N�椸�[�J����
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