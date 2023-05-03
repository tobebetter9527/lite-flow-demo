package com.freedom.rule.engine.system.controller;

import com.freedom.rule.engine.system.entity.UserTb;
import com.freedom.rule.engine.system.service.IUserTbService;
import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author tobebetter
 * @since 2023-05-03
 */
@RestController
@RequestMapping("/system/userTb")
public class UserTbController {

  @Autowired
  private IUserTbService iUserTbService;

  @Autowired
  private FlowExecutor flowExecutor;

  @GetMapping("/getById")
  public ResponseEntity<UserTb> helloWorld(@RequestParam("id") Long id) {
    UserTb usertb = iUserTbService.getById(id);
    LiteflowResponse response = flowExecutor.execute2Resp("chain1", "arg");
    System.out.println(response);
    return new ResponseEntity<>(usertb, HttpStatus.OK);
  }

}
