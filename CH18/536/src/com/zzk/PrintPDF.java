package com.zzk;

import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPageable;

public class PrintPDF {
    
    public static void main(String args[]) throws IOException,
            IllegalArgumentException, PrinterException {
        PrinterJob job = PrinterJob.getPrinterJob();// �إߦC�L�@�~
        PDDocument document = PDDocument.load("�إߪ��.pdf");// ��o�ݦC�L�����
        Printable printable = new PDPageable(document);// �إ�Printable�ﹳ
        job.setPrintable(printable);// �]�w�C�L�u�@
        job.print();// �C�L
        
    }
}
