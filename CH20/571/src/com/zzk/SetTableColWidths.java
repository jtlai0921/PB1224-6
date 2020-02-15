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
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class SetTableColWidths {
    
    public static void main(String[] args) {
        
        try {
            Document document = new Document();// �إߤ��ﹳ
            PdfWriter.getInstance(document, new FileOutputStream(
                    "C:\\�]�w��檺�C�e.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            BaseFont Chinese = BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);// �w�q�򥻦r��
            Font FontChinese = new Font(Chinese, 10, Font.NORMAL,
                    new BaseColor(90, 90, 90));// ��ҤƦr��
            float[] widths = { 0.05f, 0.10f, 0.30f, 0.55f };// �]�w�C�e�ۤ���Ҭ�
                                                            // 5%,10%,30%,55%
            PdfPTable table = new PdfPTable(widths);// �إߪ�����p�C�e
            table.addCell(new Paragraph("�C�e��5%", FontChinese));// �N�椸�涶�����[�J����A��@��R���ɦ۰ʴ���
            table.addCell(new Paragraph("�C�e��10%", FontChinese));
            table.addCell(new Paragraph("�C�e��30%", FontChinese));
            table.addCell(new Paragraph("�C�e��55%", FontChinese));
            table.addCell("w");
            table.addCell("1");
            table.addCell("2");
            table.addCell("3");
            table.addCell("h");
            table.addCell("1");
            table.addCell("2");
            table.addCell("3");
            table.addCell("s");
            table.addCell("1");
            table.addCell("2");
            table.addCell("3");
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