package com.bitnum.creditscorevisual.controller;

import com.bitnum.creditscorevisual.service.FoodProductionDataRepository;
import com.bitnum.creditscorevisual.utils.JsonResopnse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 数据显示控制器
 */
@Controller
@RequestMapping("/data")
public class DataVisualController {
    private final Logger logger= LoggerFactory.getLogger(DataVisualController.class);
    private FoodProductionDataRepository foodProductionDataRepository;
    @Autowired
    public DataVisualController(FoodProductionDataRepository foodProductionDataRepository) {
        this.foodProductionDataRepository = foodProductionDataRepository;
    }
    /**
     * 获取地区企业数量分布图
     */
    @RequestMapping(value = "/enterpriseDistribution",method = RequestMethod.GET)
    @ResponseBody
    public JsonResopnse getEnterpriseDistributionData() {

        return JsonResopnse.success("success",foodProductionDataRepository.getEnterpriseDistributionData());
//        return JsonResopnse.success("success");
    }

}
