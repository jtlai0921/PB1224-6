package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class BigTableEMSHandle {
    
    public static void main(String args[]) {
        int bigtablesize = 5;
        Document document = new Document();// �إߤ��ﹳ
        try {
            PdfWriter.getInstance(document, new FileOutputStream(
                    "c:\\�j��檺�O����B�z.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            
            BaseFont chinese = BaseFont.createFont("STSong-Light",
                    "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);// �w�q��¦�r��
            Font fontChinese1 = new Font(chinese, 10, Font.NORMAL,
                    new BaseColor(90, 90, 90));// ��ҤƦr�����O�P�]�w�r��j�p�ݩ�
            Font fontChinese2 = new Font(chinese, 15, Font.NORMAL,
                    BaseColor.BLUE);// ��ҤƦr�����O�P�]�w�r��j�p�ݩ�
            document.add(new Paragraph("�j��檺�O����޲z\n\n", fontChinese2));
            float[] hw = { 0.1f, 0.2f, 0.1f, 0.2f, 0.1f, 0.3f };// �]�w�C�e
            PdfPTable table = new PdfPTable(hw);// �إߪ��
            table.setHeaderRows(2);// �]�w�Y��
            table.addCell("10%");// �N�椸�椺�e�������[�J����A��@��R���ɦ۰ʴ���
            table.addCell("20%");
            table.addCell("10%");
            table.addCell("20%");
            table.addCell("10%");
            table.addCell("30%");
            for (int i = 1; i <= 500; i++) {// �`���V��椤�W�[500���O��
                if (i % bigtablesize == 4) {// �D�E
                    document.add(table);// �V���W�[���
                    table.deleteBodyRows();// �R���h�l��
                    table.setSkipFirstHeader(true);// �Ϫ��Y�l�׫O���b����
                }
                PdfPCell cell0 = new PdfPCell(new Paragraph(String.valueOf(i),
                        fontChinese1));// �V�椸��W�[���e
                table.addCell(cell0);// �V���W�[�椸��
                PdfPCell cell1 = new PdfPCell(new Paragraph("������",
                        fontChinese1));// �V�椸��W�[���e
                table.addCell(cell1);// �V���W�[�椸��
                PdfPCell cell2 = new PdfPCell(new Paragraph(String.valueOf(i),
                        fontChinese1));// �V�椸��W�[���e
                table.addCell(cell2);// �V���W�[�椸��
                PdfPCell cell3 = new PdfPCell(new Paragraph("������",
                        fontChinese1));// �V�椸��W�[���e
                table.addCell(cell3);// �V���W�[�椸��
            }
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