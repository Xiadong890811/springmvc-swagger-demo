package com.springmvc.controller;

import com.springmvc.entity.Student;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by XD on 2015/12/17.
 */
@Controller
@RequestMapping("demo")
public class DemoController {

    /**
     * 测试接口
     * @param id 测试参数
     * @return
     */
    @RequestMapping(value = "show" ,method= {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Object show(@RequestParam(value = "id") String id) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        if(StringUtils.isNotBlank(id)) {
            Student st = new Student();
            st.setId(Integer.parseInt(id));
            st.setName("Jack");
            st.setAge(19);
            st.setScore('B');
            resultMap.put("student", st);
            resultMap.put("success", true);
        } else {
            resultMap.put("success", false);
        }
        return resultMap;
    }
}
