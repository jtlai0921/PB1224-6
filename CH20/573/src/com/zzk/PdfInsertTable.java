package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfInsertTable {
    public static void main(String[] args) {
        
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(
                    "c:\\Pdf�O�M���.pdf"));
            document.open();// �}�Ҥ��
            PdfPTable table = new PdfPTable(4);// �إߪ��ﹳ
            PdfPTable table1 = new PdfPTable(2);// �إߪ��ﹳ
            table1.addCell("1.1");// �W�[�椸�椺�e
            table1.addCell("1.2");// �W�[�椸�椺�e
            PdfPTable table2 = new PdfPTable(1);// �إߪ��ﹳ
            table2.addCell("2.1");// �W�[�椸�椺�e
            table2.addCell("2.2");// �W�[�椸�椺�e
            table.addCell("table1");// �W�[�椸�椺�e
            table.addCell("table2");// �W�[�椸�椺�e
            table.addCell("text");// �W�[�椸�椺�e
            table.addCell("text");// �W�[�椸�椺�e
            table.addCell(table1);// �W�[�O�M�����
            table.addCell(table2);// �W�[�O�M�����
            table.addCell("cell");// �W�[�椸�椺�e
            table.addCell("cell");// �W�[�椸�椺�e
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