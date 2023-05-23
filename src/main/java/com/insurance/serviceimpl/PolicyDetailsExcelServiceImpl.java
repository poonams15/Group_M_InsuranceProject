package com.insurance.serviceimpl;

import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.insurance.model.PolicyDetailsExcel;
import com.insurance.repository.PolicyDetailsExcelRepository;
import com.insurance.service.PolicyDetailsExcelService;

@Service
public class PolicyDetailsExcelServiceImpl implements PolicyDetailsExcelService {

	@Autowired
	private PolicyDetailsExcelRepository policyDetailsExcelRepository;

	@Override
	public void generateExcel(HttpServletResponse httpServletResponse, String policyExpiryDate) throws Exception {
		List<PolicyDetailsExcel> policy = policyDetailsExcelRepository.findByExpiryDate(policyExpiryDate);

		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Matured_Policies_Details");
		HSSFRow row = sheet.createRow(0);// header row will be created

		// this will create header rows for our excel file
		row.createCell(0).setCellValue("policyId");
		row.createCell(1).setCellValue("policyNumber");
		row.createCell(2).setCellValue("policyEffectiveDate");
		row.createCell(3).setCellValue("policyExpiryDate");
		row.createCell(4).setCellValue("paymentOption");
		row.createCell(5).setCellValue("totalAmount");
		row.createCell(6).setCellValue("status");
		row.createCell(7).setCellValue("createdDate");
		row.createCell(8).setCellValue("additionalInfo");

		int dataRowIndex = 1;

		for (PolicyDetailsExcel pol : policy) {
			// create row to store the data
			HSSFRow dataRow = sheet.createRow(dataRowIndex);
			// now we need to set data into rows by creating cells
			dataRow.createCell(0).setCellValue(pol.getPolicyId());
			dataRow.createCell(1).setCellValue(pol.getPolicyNumber());
			dataRow.createCell(2).setCellValue(pol.getPolicyEffectiveDate());
			dataRow.createCell(3).setCellValue(pol.getPolicyExpiryDate());
			dataRow.createCell(4).setCellValue(pol.getPaymentOption());
			dataRow.createCell(5).setCellValue(pol.getTotalAmount());
			dataRow.createCell(6).setCellValue(pol.getStatus());
			dataRow.createCell(7).setCellValue(pol.getCreatedDate());
			dataRow.createCell(8).setCellValue(pol.getAdditionalInfo());
			dataRowIndex++;
		}
		ServletOutputStream outputStream = httpServletResponse.getOutputStream();
		workbook.write(outputStream);
		workbook.close();
		outputStream.close();
	}

}
