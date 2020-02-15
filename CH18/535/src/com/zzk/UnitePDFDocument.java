package com.zzk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfReader;

public class UnitePDFDocument {
    
    public static void main(String[] args) {
        String[] subFiles = { "c:\\����-1.pdf", "c:\\����-2.pdf", "c:\\����-3.pdf" }; // �ݦX�֪�PDF���
        String newFile = "C:\\�X�ֵ��G.pdf";// �X�᪺֫�s���
        Document document = new Document();// �إ߯¤�r���
        try {
            PdfCopy copy = new PdfCopy(document, new FileOutputStream(newFile));// �إ�copy�ﹳ���p���P��X�y
            document.open();// �}�Ҥ��
            for (int i = 0; i < subFiles.length; i++) {// ���`�� ��o�ݦX���ɮת���
                PdfReader reader = new PdfReader(subFiles[i]);// Ū���ݦX���ɮת���
                int totalPages = reader.getNumberOfPages();// ��o�C�Ӥl����`����
                for (int p = 1; p <= totalPages; p++) {// �ˬd�l��󪺨C�@��
                    copy.addPage(copy.getImportedPage(reader, p));// �N�l��󪺨C�@�����W�[��s���
                }
            }
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