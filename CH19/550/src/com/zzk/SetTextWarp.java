package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class SetTextWarp {
    
    public static void main(String[] args) {
        Document document = new Document();// �إߤ��ﹳ
        try {
            PdfWriter.getInstance(document, new FileOutputStream(
                    "C:\\�]�w��r��¶.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            Image image = Image.getInstance("image/picture.jpg");// �إ߹ϧιﹳ
            image.scalePercent(33);// �]�w��ϧΪ����
            image.setAlignment(Image.TEXTWRAP);// �N�Ϥ��]�w����r��¶
            document.add(image);// �V���W�[�Ϥ�
            StringBuffer sb = new StringBuffer();// �إߦr��֨��O����
            for (int i = 1; i <= 200; i++) {
                sb.append(i + " ");// �V�r��֨��O���餤�W�[���e
            }
            Paragraph p = new Paragraph(sb.toString());// �إ߬q���ﹳ
            document.add(p);// �N�q���W�[����
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