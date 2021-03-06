package com.zzk;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class AddKeywords {
	public static void main(String[] args){
		Document document=new Document();// 建立文件對像
		 try {
			PdfWriter.getInstance(document, new FileOutputStream("C:\\Java編程詞典.pdf"));//關聯文件對象與輸出流
			document.addKeywords("這是一套Java開發人員必備的學習資源函數庫!");// 向文件中增加關鍵字	
			document.open();// 開啟文件
			document.add(new Paragraph("Keywords"));// 向文件中增加內容	
	        document.close();// 關閉文件
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	   }
}
