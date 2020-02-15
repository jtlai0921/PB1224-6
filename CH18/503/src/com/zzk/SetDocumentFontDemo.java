package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

public class SetDocumentFontDemo {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Document document = new Document();// �إߤ��ﹳ
        try {
            PdfWriter.getInstance(document, new FileOutputStream("c://Java���O�w.pdf"));	//���p����H�P��X�y
            document.open();							//�}�Ҥ��
            BaseFont bfChinese = BaseFont.createFont(BaseFont.TIMES_ROMAN, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);//�w�q�򥻦r��
            Font contentFont = new Font(bfChinese, 20);	//�w�q���q�r��M�j�p
            document.add(new Paragraph("Java Function Classes", contentFont));	//�V��󤤼W�[���e�ë��w���q�r��
            document.close();							//�������
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