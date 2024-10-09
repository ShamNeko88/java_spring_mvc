package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * クライアントから「http:localhost:8080/hello/view」がGETで送信されると
 * HelloViewContorollerクラスのhelloViewメソッドが呼ばれる
 */
@Controller
@RequestMapping("hello")  // URLとメソッドをマッピング
public class HelloViewController {

    @GetMapping("view")
    public String helloView() {
        //戻り値は「ビュー」を返す
        return "hello";
    }
}
