package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class AddPictureInTable {
    
    public static void main(String[] args) {
        
        try {
            Document document = new Document();// �إߤ��ﹳ
            PdfWriter.getInstance(document, new FileOutputStream(
                    "C:\\�b��椤�W�[�Ϥ�.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            Image image = Image.getInstance("image/picture.jpg");// �إ߹ϧιﹳ
            PdfPTable table = new PdfPTable(3);// �w�q���
            table.addCell("Text");// �W�[�椸�椺�e
            table.addCell("Picture");// �W�[�椸�椺�e
            table.addCell("Text");// �W�[�椸�椺�e
            table.addCell("This is a cell.");// �W�[�椸�椺�e
            table.addCell(image);// �V�椸�椤�W�[�ϧιﹳ
            table.addCell("This is a cell.");// �W�[�椸�椺�e
            document.add(table);// �N���W�[����
            document.close();// �������
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
