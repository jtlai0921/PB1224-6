package com.zzk;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.lowagie.text.Cell;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfWriter;

public class SetTableHeader {
    
    public static void main(String[] args) {
        Cell cell0 = null;// �w�q�椸��
        Cell cell1 = null;
        Cell cell2 = null;
        Cell cell3 = null;
        try {
            Document document = new Document();// �إߤ��ﹳ
            PdfWriter.getInstance(document, new FileOutputStream(
                    "C:\\�]�w��檺���Y.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            BaseFont Chinese = BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);// �w�q�򥻦r��
            Font FontChinese = new Font(Chinese, 12, Font.NORMAL);// ��ҤƦr��
            Table table = new Table(4);// �w�q���
            cell0 = new Cell(new Paragraph("�s��", FontChinese));// �إ߳椸��
            cell0.setHorizontalAlignment(Element.ALIGN_CENTER);// �]�w�����~�����
            cell0.setVerticalAlignment(Element.ALIGN_CENTER);// �]�w�����~�����
            cell0.setBackgroundColor(Color.GRAY);// �]�w�I���C��
            cell0.setHeader(true);// �N�椸��]�w�����Y
            cell1 = new Cell(new Paragraph("�m�W", FontChinese)); // �إ߳椸��
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);// �]�w�����~�����
            cell1.setVerticalAlignment(Element.ALIGN_CENTER);// �]�w�����~�����
            cell1.setBackgroundColor(Color.GRAY);// �]�w�I���C��
            cell1.setHeader(true);// �N�椸��]�w�����Y
            cell2 = new Cell(new Paragraph("�~��", FontChinese)); // �إ߳椸��
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);// �]�w�����~�����
            cell2.setVerticalAlignment(Element.ALIGN_CENTER);// �]�w�����~�����
            cell2.setBackgroundColor(Color.GRAY);// �]�w�I���C��
            cell2.setHeader(true);// �N�椸��]�w�����Y
            cell3 = new Cell(new Paragraph("�q��", FontChinese)); // �إ߳椸��
            cell3.setHorizontalAlignment(Element.ALIGN_CENTER);// �]�w�����~�����
            cell3.setVerticalAlignment(Element.ALIGN_CENTER);// �]�w�����~�����
            cell3.setBackgroundColor(Color.GRAY);// �]�w�I���C��
            cell3.setHeader(true);// �N�椸��]�w�����Y
            // �V���W�[�椸��
            table.addCell(cell0);
            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);
            table.setPadding(4);// �]�w���e�P�椸�涡�Z
            for (int i = 1; i <= 3; i++) {// �V��檺�椸��W�[���e
                table.addCell(new Paragraph("95**0" + i));
                table.addCell(new Paragraph("��*��", FontChinese));
                table.addCell(new Paragraph("30"));
                table.addCell(new Paragraph("0431-2222****"));
            }
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