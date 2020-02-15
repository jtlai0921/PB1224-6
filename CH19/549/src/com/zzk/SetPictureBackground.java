package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

public class SetPictureBackground {
    
    public static void main(String[] args) {
        Document document = new Document();// �إߤ��ﹳ
        try {
            PdfWriter.getInstance(document, new FileOutputStream(
                    "C:\\�N�Ϥ��]�w���I��.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            BaseFont bfChinese = BaseFont.createFont("STSong-Light",
                    "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);// �w�q��¦�r��
            Font FontChinese = new Font(bfChinese, 50, Font.BOLD,
                    BaseColor.BLUE);// ��ҤƦr�����O�P�]�w�r��j�p�ݩ�
            Paragraph p = new Paragraph("�U���O�I���Ϥ�", FontChinese);// �إ߬q���ﹳ
            p.setSpacingBefore(60); // �]�w�q���W��Z
            p.setAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
            Image image = Image.getInstance("image/gb.jpg");// �w�q�Ϥ��ﹳ
            image.setAlignment(Image.UNDERLYING);// �N�Ϥ��]�w���I��
            document.add(image);// �V���W�[�p��
            document.add(p);// �W�[�q��
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