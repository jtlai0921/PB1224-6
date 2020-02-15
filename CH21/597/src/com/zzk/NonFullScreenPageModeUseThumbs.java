package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

public class NonFullScreenPageModeUseThumbs {
    
    public static void main(String args[]) {
        
        try {
            Document document = new Document();// �إߤ��ﹳ
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\���ù��Ҧ��U����Y��.pdf"));// ���p����H�P��X�y
            writer.setViewerPreferences(PdfWriter.PageModeFullScreen);// �]�w�����ù��Ҧ�
            writer
                    .setViewerPreferences(PdfWriter.NonFullScreenPageModeUseThumbs);// �]�w�\Ū���b���ù��Ҧ��U����Y��
            document.open();// �}�Ҥ��
            BaseFont Chinese = BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);   
            Font fontChinese1 = new Font(Chinese, 18, Font.BOLDITALIC,BaseColor.RED);// ��ҤƦr�����O�B�]�w�r��j�p�M�C��
            Font fontChinese2 = new Font(Chinese, 15, Font.BOLDITALIC,BaseColor.BLUE);// ��ҤƦr�����O�B�]�w�r��j�p�M�C��
            Paragraph paragraph = new Paragraph("���`",fontChinese1);// �إ߬q���ﹳ
            Chapter chapter = new Chapter(paragraph,1);// �إ߳��`�ﹳ
            paragraph = new Paragraph("�p�`�@",fontChinese2);// �إ߬q���ﹳ
            chapter.addSection(paragraph);// �W�[�p�`
            paragraph = new Paragraph("�p�`�G",fontChinese2);// �إ߬q���ﹳ
            chapter.addSection(paragraph);// �W�[�p�`
            document.add(chapter);// �V���W�[���`
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