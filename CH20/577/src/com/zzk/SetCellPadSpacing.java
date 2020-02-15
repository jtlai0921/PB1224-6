package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class SetCellPadSpacing {
    
    public static void main(String[] args) {
        
        try {
            Document document = new Document();// �إߤ��ﹳ
            PdfWriter.getInstance(document, new FileOutputStream(
                    "C:\\�]�w�椸�檺��R�M�涡�Z.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            PdfPTable table = new PdfPTable(2);// �w�q���
            table.addCell("no Padding");// �V�椸��W�[���e
            table.addCell("MingRiCompany MingRi MingRiCompany");// �椸���R�e���e
            table.addCell("Set Padding");// �V�椸��W�[���e
            table.getDefaultCell().setPadding(24);// �V�椸��]�w��R24
            table.addCell("MingRi MingRiCompany");// �椸���R�᤺�e
            document.add(table);// �N���W�[����
            PdfPTable table1 = new PdfPTable(2);// �w�q���
            table1.addCell("no Leading");// �V�椸��W�[���e
            table1
                    .addCell("MingRi MingRi MingRiCompanyMingRiCompany MingRiCompany");// �W�[�涡�Z�e���e
            table1.getDefaultCell().setLeading(12, 1);// �W�[�涡�Z
            table1.addCell("Set Leading");// �V�椸��W�[���e
            table1
                    .addCell("MingRi MingRi MingRiCompanyMingRiCompany MingRiCompany");// �W�[�涡�Z�᤺�e
            document.add(table1);// �N���W�[����
            document.close();// �������
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
