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

public class SetCellRowspan {
    
    public static void main(String[] args) {
        
        try {
            Document document = new Document();// �إߤ��ﹳ
            PdfWriter.getInstance(document, new FileOutputStream(
                    "C:\\�]�w�椸��Ҧ������.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            BaseFont Chinese = BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);// �w�q�򥻦r��
            Font FontChinese = new Font(Chinese, 10, Font.NORMAL, Color.red);// ��ҤƦr��
            Table table = new Table(5);// �w�q���
            table.addCell("1.1");// �N�椸�涶�����[�J����A��@��R���ɦ۰ʴ���
            table.addCell("2.1");
            Cell cell = new Cell(new Paragraph("�ڦ���4��", FontChinese));// �w�q�@�Ӫ��椸
            cell.setRowspan(4);// �]�w������(�X��4�ӳ椸��)
            table.addCell(cell); // �N�椸�[�J����
            table.addCell("2.1"); // �N�椸�涶�����[�J����A��@��R���ɦ۰ʴ���
            table.addCell("2.2");
            table.addCell("3.2");
            table.addCell("1.3");
            table.addCell("2.3");
            table.addCell("3.3");
            Cell cell2 = new Cell(new Paragraph("�ڦ���3�� ", FontChinese));// �w�q�@�Ӫ��椸
            cell2.setRowspan(3);// �]�w������(�X��3�ӳ椸��)
            table.addCell(cell2); // �N�椸�[�J����
            table.addCell("3.1"); // �N�椸�涶�����[�J����A��@��R���ɦ۰ʴ���
            table.addCell("2.1");
            table.addCell("2.2");
            table.addCell("3.2");
            table.addCell("1.3");
            table.addCell("2.3");
            table.addCell("3.3");
            table.addCell("1.3");
            table.addCell("2.3");
            table.addCell("3.3");
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