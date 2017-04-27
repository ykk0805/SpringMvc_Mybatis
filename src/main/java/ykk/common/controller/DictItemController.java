package ykk.common.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ykk.common.domain.Dict;
import ykk.common.service.DictService;

@Controller
@RequestMapping(value = "/admin/dictItem")
public class DictItemController {
	
	@Autowired
	private DictService dictService;
	
	private static Logger log = Logger.getLogger(DictItemController.class);
	
	@RequestMapping(value= "/getDict" , method = RequestMethod.GET)
	public String getDict (Long dictId) {
		Dict dict = dictService.getDict(dictId);
		StringBuffer sb = new StringBuffer();
		sb.append("<h6>").append(dict.getDictName()).append("</h6>");
		System.out.println(sb.toString());
		return sb.toString();
	}
}
