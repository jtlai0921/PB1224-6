package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class ForceShowPage {
	

	public static void main(String[] args) {
		
        Document document = new Document();// �إߤ��ﹳ
        try {
            PdfWriter.getInstance(document, new FileOutputStream("C:\\�j��b�@����ܡ]�i��|�򥢸��).pdf"));// ���p����H�P��X�y	
            document.open();// �}�Ҥ��
            String[] data = { "C033010", "MX", "980", "350", "800", "999",
                    "655", "800", "23", "860" };// �w�q��Ƹ�T
            PdfPTable table = new PdfPTable(10);// �w�q���
            int columnwidths[] = { 8, 3, 11, 10, 8, 6, 8, 12, 3, 6 };// �w�q�C�e
            table.setWidths(columnwidths);// �V���W�[�C�e
            table.setWidthPercentage(100);// �V���W�[����e��
            table.getDefaultCell().setPadding(3);// �]�w�椸���R��3
            table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);// �]�w�椸��~�����
            table.addCell("Number");// �N�椸�椺�e�������[�J����A��@��R���ɦ۰ʴ���
            table.addCell("Name");
            table.addCell("aggression");
            table.addCell("defend");
            table.addCell("reaction");
            table.addCell("shoot");
            table.addCell("header");
            table.addCell("bodybalance");
            table.addCell("age");
            table.addCell("speed");
            table.setHeaderRows(1);// �����C�@���]�w���Y
            for (int i = 1; i < 100; i++) {// �`���V��椤�W�[100���O��
                if (i % 2 == 1) {
                    table.getDefaultCell().setBackgroundColor(
                            BaseColor.LIGHT_GRAY);// ��R�C��
                } else {
                    table.getDefaultCell().setBackgroundColor(BaseColor.WHITE);// ��R�C��
                }
                for (int x = 0; x < 10; x++) {
                    String var = data[x];// ��o�}�C�������
                    for (int y = 0; y < i; y++) {
                        var += "\n" + y;// �s���r�겣�ͳ椸�椺�e
                    }
                    table.addCell(var);// ���椸��W�[���e
                }
            }
     		table.setSplitRows(false);// �Ϧ�j��b�@����ܡA���O�i��|�򥢸��
     		document.add(table);// �V���W�[���
     		document.close();// �������
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        
	}
}
