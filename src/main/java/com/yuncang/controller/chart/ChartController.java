package com.yuncang.controller.chart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lzw on 2017/5/16.
 */
@Controller
@RequestMapping(value = "yuncang")
public class ChartController {
    @RequestMapping(value = "/chart")
    public String buy() {
        return "chart";
    }
}
