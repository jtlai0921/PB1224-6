package com.zzk;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.lowagie.text.Cell;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfWriter;

public class InsertTable {
    
    public static void main(String[] args) {
        
        try {
            Document document = new Document();// �إߤ��ﹳ
            PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\�O�M���.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            BaseFont Chinese = BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);// �w�q�򥻦r��
            Font FontChinese = new Font(Chinese, 10, Font.BOLDITALIC,
                    Color.BLUE);// ��ҤƦr��
            Font font = new Font(Chinese, 10, Font.NORMAL);
            Table table1 = new Table(3);// �إߪ��
            Cell cell = new Cell(new Paragraph("�O�J����@", FontChinese));// �إ߳椸��
            cell.setColspan(3);// �]�w�C���
            // �椸��K�J����溡�۰ʴ���
            table1.addCell(cell);
            table1.addCell(new Paragraph("��@ 0.0", FontChinese));
            table1.addCell(new Paragraph("��@ 0.1", FontChinese));
            table1.addCell(new Paragraph("��@ 0.2", FontChinese));
            table1.addCell(new Paragraph("��@ 1.0", FontChinese));
            table1.addCell(new Paragraph("��@ 1.1", FontChinese));
            table1.addCell(new Paragraph("��@ 1.2", FontChinese));
            Table table2 = new Table(2);// �إߪ��
            // �椸��K�J����A�溡�۰ʴ���
            table2.addCell(new Paragraph("��G 0.0", FontChinese));
            table2.addCell(new Paragraph("��G0.1", FontChinese));
            table2.addCell(new Paragraph("��G 1.0", FontChinese));
            table2.addCell(new Paragraph("��G 1.1", FontChinese));
            Cell tableCell = new Cell(new Paragraph("�ϥ�Cell�O�J����G", FontChinese));// �إߤ@�ӳ椸��
            tableCell.add(table2);// �N���W�[��椸��
            Table table3 = new Table(5, 5);// �إ�5��5�C�����
            table3.insertTable(table1); // �N�Ĥ@�Ӫ��O�J�����Ĥ@�C
            // �椸��K�J����溡�۰ʴ���
            table3.addCell(new Paragraph("���1.1", font));
            table3.addCell(new Paragraph("���1.2", font));
            table3.addCell(new Paragraph("���1.3", font));
            table3.setPadding(5);// �]�w��R�Ȭ�5
            table3.addCell(tableCell);// �W�[�椸��A��{�ĤG�Ӫ�檺�O�J
            document.add(table3);// �V��󤤼W�[���
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