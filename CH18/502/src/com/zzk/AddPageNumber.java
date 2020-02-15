package com.zzk;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.exceptions.IllegalPdfSyntaxException;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;

public class AddPageNumber extends PdfPageEventHelper {

	public PdfTemplate pdfTemplate;// �ŧi�ҪO�ﹳ
	public BaseFont baseFont;// �ŧi��¦�r��ﹳ

	public static void main(String[] args) {
		Document document = new Document(PageSize.A4);// �إ�A4�ȱi�j�p��PDF���ﹳ
		try {
			PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream("C:\\�W�[���X.pdf"));// ���p����H�P��X�y 
			writer.setPageEvent(new AddPageNumber());// �W�[�����ƥ��ť��
			document.open();// �}�Ҥ��
			BaseFont bf =BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED); 
			Paragraph pargraph = new Paragraph("�W�[���X�M�`���ơC", new Font(bf, 15,
					Font.BOLD, BaseColor.BLUE));// �إ߬q����H�ë��w����
			document.add(pargraph);// �V��󤤼W�[�q��
			document.newPage();// �إ߷s��
			document.add(pargraph);// �W�[�q��
			document.newPage();// �إ߷s��
			document.add(pargraph);// �W�[�q��
			document.close();// �������
		} catch (IllegalPdfSyntaxException de) {
			de.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void onOpenDocument(PdfWriter writer, Document document) {// �}�Ҥ��ɰ���Ӥ�k
			pdfTemplate = writer.getDirectContent().createTemplate(180, 180);// �إ߼ҪO�ﹳ
			try {
				baseFont = BaseFont.createFont("C:\\windows\\fonts\\KAIU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			} catch (DocumentException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	public void onEndPage(PdfWriter writer, Document document) {// �������ɰ���Ӥ�k
		PdfContentByte cb = writer.getDirectContent();// �إߤ��e�ﹳ
		cb.saveState();// �x�s���A
		cb.beginText();// �¤�r�}�l�аO
		cb.setFontAndSize(baseFont, 12);// �]�w�r��M�r��
		cb.setTextMatrix(260, 800);// �]�w�¤�r��ܦ�m
		String page = "��" + writer.getPageNumber() + "��/�@";// �w�q��ܭ��X��T���ܼ�
		cb.showText(page);// ��ܯ¤�r
		cb.endText();// �¤�r�����аO
		cb.addTemplate(pdfTemplate, 305, 800);// �W�[�ҪO�ﹳ
		cb.stroke();// �T�{���x�s�ާ@
		cb.restoreState();// ��_�аO
		cb.closePath();// �������e�q�D
	}

	public void onCloseDocument(PdfWriter writer, Document document) {// �������ɰ���Ӥ�k
		pdfTemplate.beginText();// �ҪO�¤�r�}�l�аO
		pdfTemplate.setFontAndSize(baseFont, 12);// �]�w�ҪO�r��M�r��
		int totalPages = writer.getPageNumber() - 1;// ��o�`����
		pdfTemplate.showText(totalPages + "��");// ����`���Ƹ�T
		pdfTemplate.endText();// �ҪO�¤�r�����аO
		pdfTemplate.closePath();// �����ҪO�q�D
	}
}
