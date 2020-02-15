package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

public class SetHeightWidth {
    
    public static void main(String[] args) {
        Document document = new Document();// �إߤ��ﹳ
        try {
            PdfWriter.getInstance(document, new FileOutputStream(
                    "C:\\�]�w���שM�e�ת����.pdf"));// ���p����H�P��X�y
            document.open();// �}�Ҥ��
            Image image = Image.getInstance("image/picture.jpg");// �إ߹ϧιﹳ
            image.scalePercent(50, 40);// �]�w�e�שM���פ�Ҥ��O����Ϥ���50%�M40%
            document.add(image);// �V���W�[�Ϥ�
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