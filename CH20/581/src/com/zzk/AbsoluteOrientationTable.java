package com.zzk;

import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class AbsoluteOrientationTable {
    public static void main(String[] args) {
        Document document = new Document();// �إߤ��ﹳ
        try {
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream("c:\\����w����.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            float[] columnSize = { 21F, 21F, 21F };// �]�w�C�e
            PdfPTable table = null;
            PdfPCell cell = null;
            table = new PdfPTable(columnSize);// �w�q�s���
            table.getDefaultCell().setBorder(1);// �]�w�����ؼe��
            table.setHorizontalAlignment(Element.ALIGN_CENTER);// �]�w�~�����
            table.setTotalWidth(500); // �]�w�`�e��500
            table.setLockedWidth(true); // ����
            cell = new PdfPCell(new Phrase("Add table"));// �w�q�椸��
            cell.setColspan(3);// �]�w�椸����3
            table.addCell(cell);// �V���W�[�椸��
            table.addCell(new PdfPCell(new Phrase("Add 001")));// �V���W�[���e
            table.addCell(new PdfPCell(new Phrase("Add 002")));// �V���W�[���e
            table.addCell(new PdfPCell(new Phrase("Add 003")));// �V���W�[���e
            document.add(table);// �V���W�[���
            table = new PdfPTable(columnSize);
            // �w�q�s���
            table.getDefaultCell().setBorder(1);// �]�w�����ؼe��
            table.setHorizontalAlignment(Element.ALIGN_CENTER);// �]�w�~�����
            table.setTotalWidth(500);// �]�w�`�e��500
            table.setLockedWidth(true);// ����
            cell = new PdfPCell(new Phrase("Table writeSelectedRows"));// �w�q�椸��
            cell.setColspan(columnSize.length);// �]�w�椸����3
            table.addCell(cell); // �V���W�[�椸��
            table.addCell(new PdfPCell(new Phrase("Add 004")));// �V���W�[���e
            table.addCell(new PdfPCell(new Phrase("Add 005")));// �V���W�[���e
            table.addCell(new PdfPCell(new Phrase("Add 006")));// �V���W�[���e
            table.writeSelectedRows(0, 2, 50, 750, writer.getDirectContent());// �b���w��m�W�[��椺�e
            document.close();// �������
        } catch (DocumentException de) {
        } catch (IOException ioe) {
            
        }
        
    }
}
