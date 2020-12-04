package com.bitnum.creditscorevisual.controller;

import com.bitnum.creditscorevisual.entity.FoodProductionData;
import com.bitnum.creditscorevisual.service.FoodProductionDataRepository;
import com.bitnum.creditscorevisual.utils.DateHelper;
import com.bitnum.creditscorevisual.utils.excel.ExportExcel;
import com.bitnum.creditscorevisual.utils.excel.ImportExcel;
import org.apache.poi.ss.usermodel.Row;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/file")
public class FileController {
    private final Logger logger= LoggerFactory.getLogger(FileController.class);
    private FoodProductionDataRepository foodProductionDataRepository;
    @Autowired
    public FileController(FoodProductionDataRepository foodProductionDataRepository) {
        this.foodProductionDataRepository = foodProductionDataRepository;
    }

    /**
     * 导入食品生产数据
     * @return
     */
    @RequestMapping(value = "/import")
    public String importFile() {
        try {
            ImportExcel ei = new ImportExcel("target/export.xls", 0);

            for (int i = ei.getDataRowNum(); i <= ei.getLastDataRowNum(); i++) {
                Row row = ei.getRow(i);
                FoodProductionData foodProductionData=new FoodProductionData();
                for (int j = 0; j < ei.getLastCellNum(); j++) {
                    Object val = ei.getCellValue(row, j);
                    System.out.print(val+", ");
                    switch (j){
                        case 0:foodProductionData.setProductionName((String) val);break;
                        case 1:foodProductionData.setCreditCode((String) val);break;
                        case 2:foodProductionData.setPrincipal((String) val);break;
                        case 3:foodProductionData.setAddress((String) val);break;
                        case 4:foodProductionData.setPermitNumber((String) val);break;
                        case 5:foodProductionData.setAgencies((String) val);break;
                        case 6:foodProductionData.setAgenciesMan((String) val);break;
                        case 7:foodProductionData.setCertificateOrgan((String) val);break;
                        case 8:foodProductionData.setSigner((String) val);break;
                        case 9:foodProductionData.setCertificateDate(DateHelper.stringToDate((String)val) );break;
                        case 10:foodProductionData.setValidityDate(DateHelper.stringToDate((String)val));break;
                        case 11:foodProductionData.setTransactState((String) val);break;
                        case 12:foodProductionData.setApplicationType((String) val);break;
                        case 13:foodProductionData.setContact((String) val);break;
                        case 14:foodProductionData.setContactNumber((String) val);break;
                        case 15:foodProductionData.setArea((String) val);break;
                        case 16:foodProductionData.setProductionAddress((String) val);break;
                        case 17:foodProductionData.setRemark((String) val);break;
                        case 18:foodProductionData.setLocationWarehouse((String) val);break;
                        case 19:foodProductionData.setFoodType((String) val);break;
                        case 20:foodProductionData.setTypeName((String) val);break;
                        case 21:foodProductionData.setProductDetail((String) val);break;
                        case 22:foodProductionData.setTypeNumber((String) val);break;
                        case 23:foodProductionData.setQylsh((String) val);break;
                        case 24:foodProductionData.setOrganizationCode((String) val);break;
                        case 25:foodProductionData.setSetDate(DateHelper.stringToDate((String)val) );break;
                        case 26:foodProductionData.setRatingYear(DateHelper.stringToDate2((String)val));break;
                        case 27:foodProductionData.setFrequency((String) val);break;
                        case 28:foodProductionData.setRiskLevel((String) val);break;
                        default:
                            System.out.println("default");
                            break;
                    }
                }
                foodProductionDataRepository.save(foodProductionData);
//                System.out.print("\n");
            }
            return null;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return "redirect:" + "" + "/views/index";
    }
}
