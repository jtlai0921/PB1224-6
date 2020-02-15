package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

public class AddPageFoot {
	public static void main(String[] args){
		Document document = new Document();// �إߤ��ﹳ
		try {
			PdfWriter.getInstance(document, new FileOutputStream("c:\\���ܭ��}.pdf"));// ���p����H�P��X�y
			document.open();// �}�Ҥ��
			document.add(new Paragraph("Add Page Top And Foot.")); // �V��󤤼W�[���e
			document.close();// �������ﹳ
			PdfReader reader = new PdfReader("c:\\���ܭ��}.pdf");// �إߡu���ܭ��}.pdf�v��PdfReader�ﹳ
			PdfStamper stamp = new PdfStamper(reader, new FileOutputStream("c:\\�W�[���ܭ��}.pdf"));// �إ�PdfStamper�ﹳ
			PdfContentByte over = stamp.getOverContent(1);// ��o�Ĥ@�������e
			over.setTextRise(810);// �¤�r�W����810����m
			over.beginText();// �аO�¤�r�}�l
			BaseFont chinese = BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);			over.setFontAndSize(chinese, 18);// �]�w�r��M�r��
			over.showText("                                           ���ܪ����e");// �W�[����
			over.endText();// �аO�¤�r����
			stamp.insertPage(2, PageSize.A4);// �W�[�s���@���A���s���W�[���}
			PdfContentByte under = stamp.getUnderContent(2);// ��o�ĤG�������e
			under.setTextRise(15);// �¤�r�W����15����m
			under.beginText();// �аO�¤�r�}�l
			under.setFontAndSize(chinese, 18);// �]�w�r��M�r��
			under.showText("                                          ���}�����e");// �W�[���}
			under.endText();// �аO�¤�r����
			stamp.close();// PdfStamper��H�A�N�q�u���ܭ��}.pdf�v��Ū�������W�[���ܭ��}��g�J�u�W�[���ܭ��}.pdf�v
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