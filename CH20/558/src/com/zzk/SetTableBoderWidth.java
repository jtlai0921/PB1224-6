package com.zzk;

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

public class SetTableBoderWidth {
    
    public static void main(String[] args) {
        Document document = new Document();// �إߤ��ﹳ
        try {
            PdfWriter.getInstance(document, new FileOutputStream(
                    "C:\\�]�w��檺��ؼe��.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            BaseFont bfChinese = BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);// �w�q�򥻦r��
            Font fontChinese = new Font(bfChinese, 12, Font.NORMAL);// ��ҤƦr��
            Table table1 = new Table(3);// �w�q���
            document.add(new Paragraph("                �w�]��ت����", fontChinese));// �إ߬q��
            // �N�椸�涶�����[�J����A��@��R���ɦ۰ʴ���
            table1.addCell("Cell1.1");
            table1.addCell("Cell1.2");
            table1.addCell("Cell1.3");
            table1.addCell("Cell2.1");
            table1.addCell("Cell2.2");
            table1.addCell("Cell2.3");
            Table table2 = new Table(3);// �w�q���
            table2.setBorderWidth(3);// �]�w��檺�~��ؼe��
            // �N�椸�涶�����[�J����A��@��R���ɦ۰ʴ���
            table2.addCell("Cell1.1");
            table2.addCell("Cell1.2");
            table2.addCell("Cell1.3");
            table2.addCell("Cell2.1");
            table2.addCell("Cell2.2");
            table2.addCell("Cell2.3");
            document.add(table1);// �N���W�[����
            document.add(new Paragraph("                ���ܥ~��ؼe�׬�3�����",
                    fontChinese));// �إ߬q��
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