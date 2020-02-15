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

public class SetCellBackgroundColor {
    
    public static void main(String[] args) {
        
        try {
            Document document = new Document();// �إߤ��ﹳ
            PdfWriter.getInstance(document, new FileOutputStream(
                    "C:\\�]�w�椸�檺�I����.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            BaseFont Chinese = BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);// �w�q�򥻦r��
            Font FontChinese = new Font(Chinese, 12, Font.NORMAL);// ��ҤƦr��
            document
                    .add(new Paragraph("                 ���椸���R�C��", FontChinese));
            Table table = new Table(5);// �w�q���
            table.addCell("1.1");// �N�椸�涶�����[�J����A��@��R���ɦ۰ʴ���
            table.addCell("2.1");
            table.addCell("3.1");
            table.addCell("2.1");
            table.addCell("2.2");
            Cell cell = new Cell();// �إ߳椸��
            cell.setBackgroundColor(Color.yellow);// ���椸���R�I����
            table.addCell(cell); // �N�椸���J����
            table.addCell("1.3");
            table.addCell("2.3");
            Cell cell2 = new Cell();// �إ߳椸��
            cell2.setBackgroundColor(Color.red);// ���椸���R�I����
            table.addCell(cell2);
            table.addCell("3.0");
            table.addCell("3.1");
            table.addCell("2.1");
            Cell cell3 = new Cell();// �إ߳椸��
            cell3.setBackgroundColor(Color.green);// ���椸���R�I����
            table.addCell(cell3);
            table.addCell("3.2");
            table.addCell("1.3");
            table.addCell("2.3");
            Cell cell4 = new Cell();// �إ߳椸��
            cell4.setBackgroundColor(Color.red);// ���椸���R�I����
            table.addCell(cell4); // �N�椸���J����
            table.addCell("2.1");
            table.addCell("2.2");
            Cell cell5 = new Cell();// �إ߳椸��
            cell5.setBackgroundColor(Color.blue);// ���椸���R�I����
            table.addCell(cell5); // �N�椸���J����
            table.addCell("1.3");
            table.addCell("2.3");
            table.addCell("3.3");
            table.addCell("3.0");
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