package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ShowPageLayoutTwoColumnRight {
    
    public static void main(String[] args) {
        
        try {
            Document document = new Document();// �إߤ��ﹳ
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\���C��ܩ_���b�k.pdf"));// ���p���P��X�y
            writer.setViewerPreferences(PdfWriter.PageLayoutTwoColumnRight);// �]�w�\Ū�����C��ܩ_���b��
            document.open();// �}�Ҥ��
            document.add(new Paragraph("This is Odd Page 1"));// �V��󤤼W�[���e
            document.newPage();// �s�W�ĤG��
            document.add(new Paragraph("this is Even Page 2"));// �V��󤤼W�[���e
            document.newPage();// �s�W�ĤT��
            document.add(new Paragraph("This is Odd Page 3"));// �V��󤤼W�[���e
            document.newPage();// �s�W�ĥ|��
            document.add(new Paragraph("This is Even Page 4"));// �V��󤤼W�[���e
            document.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        
    }
}
