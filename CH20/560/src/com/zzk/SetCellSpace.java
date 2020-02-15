package com.zzk;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfWriter;

public class SetCellSpace {
    
    public static void main(String[] args) {
        Document document = new Document();// �إߤ��ﹳ
        try {
            PdfWriter.getInstance(document, new FileOutputStream(
                    "C:\\�]�w�椸�檺���Z.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            BaseFont bfChinese = BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);// �w�q�򥻦r��
            Font fontChinese = new Font(bfChinese, 12, Font.NORMAL);// ��ҤƦr��
            Table table = new Table(3);// �w�q���
            document.add(new Paragraph("                �w�]�����", fontChinese));// �V���W�[���e
            // �N�椸�涶�����[�J����A��@��R���ɦ۰ʴ���
            table.addCell("Cell1.1");
            table.addCell("Cell1.2");
            table.addCell("Cell1.3");
            table.addCell("Cell2.1");
            table.addCell("Cell2.2");
            table.addCell("Cell2.3");
            Table table1 = new Table(3);// �w�q���
            table1.setSpacing(3);// �]�w�����ػP�椸�檺���Z
            table1.setBorderColor(Color.GREEN);// �]�w�������C��
            // �N�椸�涶�����[�J����A��@��R���ɦ۰ʴ���
            table1.addCell("Cell1.1");
            table1.addCell("Cell1.2");
            table1.addCell("Cell1.3");
            table1.addCell("Cell2.1");
            table1.addCell("Cell2.2");
            table1.addCell("Cell2.3");
            document.add(table);
            document.add(new Paragraph("                �]�w�������C��P�椸�檺���Z�Ȭ�3",
                    fontChinese));// �V���W�[���e"
            document.add(table1);// �N���W�[����
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