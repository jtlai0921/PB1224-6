package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfWriter;

public class CreateTableColumn {
    
    public static void main(String[] args) {
        Document document = new Document();// �إߤ��ﹳ
        try {
            PdfWriter.getInstance(document, new FileOutputStream(
                    "C:\\�إߨ㦳���w�C�ƪ����.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            BaseFont bfChinese = BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);// �w�q�򥻦r��
            Font fontChinese = new Font(bfChinese, 28, Font.NORMAL);// ��ҤƦr��
            document.add(new com.lowagie.text.Paragraph("�o�O�@�Ө㦳5�C�����",
                    fontChinese));// �V��󤤼W�[���e
            Table table = new Table(5);// �إߤ@��5�C�����
            // �N�椸�涶�����[�J����A��@��R���ɦ۰ʴ���
            table.addCell("1,1");
            table.addCell("1,2");
            table.addCell("1,3");
            table.addCell("1,4");
            table.addCell("1,5");
            table.addCell("2,1");
            table.addCell("2,2");
            table.addCell("2,3");
            table.addCell("2,4");
            table.addCell("2,5");
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