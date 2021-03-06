package com.zzk;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfGraphics2D;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfGraphics2DText {
    
    public static void main(String[] args) throws MalformedURLException {
        Document document = new Document();// 建立文件對像
        try {
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\使用PdfGraphics2D繪製純文字.pdf"));// 關聯文件對象與輸出流
            document.open();// 開啟文件
            PdfContentByte cb = writer.getDirectContent();// 獲得文件內容
            PdfGraphics2D g = (PdfGraphics2D) cb.createGraphics(700, 800);// 獲得PdfGraphics2D對像
            g.drawString("draw text. ", 54, 10);// 繪製純文字
            g.drawString("second row text. ", 54, 30);// 繪製純文字
            g.drawString("third row text. ", 54, 50);// 繪製純文字
            g.dispose();// 佈署
            cb.stroke();// 確認繪製的內容
            document.close();// 關閉文件
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
