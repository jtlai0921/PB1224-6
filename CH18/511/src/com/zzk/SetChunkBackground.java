package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;


public class SetChunkBackground {
	
	
	public static void main(String[] args){
		Document document = new Document();// �إߤ��ﹳ
		try {
			PdfWriter.getInstance(document, new FileOutputStream("c:\\Java�s�{�������.pdf"));// ���p����H�P��X�y
			document.open();// �}�Ҥ��
			Chunk chunk = new Chunk("Compile once, Run all!");// �w�q���üW�[���e
			chunk.setBackground(BaseColor.LIGHT_GRAY); // �]�w�I���C��
			document.add(chunk);// �W�[�I���C��
			document.close();// �������
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
