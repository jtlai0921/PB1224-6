package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.*;


public class HandleChineseErrorCode {
	public static void main(String[] args){
		Document document = new Document();// �إߤ��ﹳ
		try {
			PdfWriter.getInstance(document, new FileOutputStream("C:\\�ȹB�t��.pdf"));// ���p����H�P��X�y
			document.open();// �}�Ҥ��
			BaseFont Chinese = BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);   
			Font FontChinese = new Font(Chinese, 20, Font.NORMAL);// ��ҤƦr�����O�P�]�w�r��j�p�ݩ�           
			document.add(new Paragraph("����A�@����{�F���P�ƩM���P�ƲĤ@���ؼ�", FontChinese));// �V��󤤼W�[���e�ë��w����
			document.close();// �������
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}