package com.risker.web.contorllers;

import com.risker.manageshared.model.User;
import com.risker.manageshared.service.IHelloQueryService;
import com.risker.manageshared.service.IUserQueryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by myz on 16/8/9.
 * 请求mapping都是小写
 */
@RestController
@RequestMapping(value = "/okcontorller")
public class OkContorller {


    private Logger logger = LoggerFactory.getLogger(OkContorller.class);

    @Autowired
    private IHelloQueryService helloQueryService;
    @Autowired
    private IUserQueryService userQueryService;

    @RequestMapping(value = "/ok",produces = {"text/plain;charset=utf-8"})
    public String ok(){
        logger.info("entry .....contorller");
        return "你好世界";
    }

    @RequestMapping(value = {"/sayHello","/sayhello"})
    public String sayHello(){

        String result = helloQueryService.sayHello("张三");
        return result;
    }

}
