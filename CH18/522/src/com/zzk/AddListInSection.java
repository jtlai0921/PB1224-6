package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

public class AddListInSection {
	
	
	public static void main(String[] args){
		Document document = new Document();// �إߤ��ﹳ
		try {
			PdfWriter.getInstance(document, new FileOutputStream("C:\\�b�p�`���W�[�C��.pdf"));// ���p����H�P��X�y
			document.open();// �}�Ҥ��
			BaseFont Chinese = BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);   
			Font fontChinese1 = new Font(Chinese, 18, Font.BOLDITALIC,BaseColor.RED);// ��ҤƦr�����O�B�]�w�r��j�p�M�C��
			Font fontChinese2 = new Font(Chinese, 15, Font.BOLDITALIC,BaseColor.BLUE);// ��ҤƦr�����O�B�]�w�r��j�p�M�C��
			Font fontChinese3 = new Font(Chinese, 12, Font.NORMAL,BaseColor.BLACK);// ��ҤƦr�����O�B�]�w�r��j�p�M�C��
			Paragraph paragraph = new Paragraph("���`",fontChinese1);// �إ߬q���ﹳ
			Chapter chapter = new Chapter(paragraph,1);// �إ߳��`�ﹳ
			paragraph = new Paragraph("�p�`",fontChinese2);// �إ߬q���ﹳ
			Section section = chapter.addSection(paragraph);// �إߨå[�J�p�`�ﹳ
			paragraph = new Paragraph("\n�p�`���W�[���C��p�U�G\n\n",fontChinese3);// �إ߬q���ﹳ
			section.add(paragraph);// �V�p�`�W�[�q��
			List list = new List(true, false, 10);// �إߦC��
			list.add(new ListItem("�p�`�����C��@",fontChinese3));// �V�C��W�[���e
			list.add(new ListItem("�p�`�����C��G",fontChinese3));
			list.add(new ListItem("�p�`�����C��T",fontChinese3));
			section.add(list);// �V�p�`�W�[�C��
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