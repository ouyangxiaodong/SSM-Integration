package cn.stevengo.ssmtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.stevengo.ssmtest.bean.Book;
import cn.stevengo.ssmtest.dao.BookMapper;
import cn.stevengo.ssmtest.test.TestBean;

@Controller
public class TestController {
	
	@Autowired
    BookMapper bookMapper;
	  @RequestMapping("/stringTest")
	  @ResponseBody
	    public String returnStr() {
	        return "hello,即使是中文也可以";
	    }

	    @RequestMapping("/entityTest")
	    @ResponseBody
	    public TestBean returnEntify() {
	        TestBean testBean = new TestBean();
	        testBean.setTestStr("测试实体");
	        testBean.setTestInt(12);
	        return testBean;
	    }
	    
	    @RequestMapping("/add")
	    @ResponseBody
		    public String re() {
	    	Book book = new Book();
	    	book.setName("看什么能？");book.setNumber(50);
	    	bookMapper.insert(book);
		        return "哈哈哈哈";
		    }
	    
	    @RequestMapping("/hehe")
		    public String hehe() {
		        return "hehe";
		    }
}
