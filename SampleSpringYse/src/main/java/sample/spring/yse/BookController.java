package sample.spring.yse;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	@Autowired
	BookService bookService;
	
//	사용자 요청에 어떠한 요청을 해줘야하는지 컨트롤러에서 
//	찾을때 사용하는 Annotation -> RequestMapping
	@RequestMapping(value="/create.do", method = RequestMethod.GET)
	public ModelAndView create() {
//		create.do라는 요청이 들어왔을 때, create()라는 메소드를 실행해줘!
	    return new ModelAndView("book/create");
	}
	
	@RequestMapping(value = "/create.do", method = RequestMethod.POST)
	public ModelAndView createPost(@RequestParam Map<String, Object> map) {
	    ModelAndView mav = new ModelAndView();

	    String bookId = this.bookService.create(map);
	    if (bookId == null) {
	        mav.setViewName("redirect:/create");
	    }else {
	        mav.setViewName("redirect:/detail?bookId=" + bookId); 
	    }  

	    return mav;
	}
	
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public ModelAndView detail(@RequestParam Map<String, Object> map) {
		Map<String, Object> detailMap = this.bookService.detail(map);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("data", detailMap);
		String bookId = map.get("bookId").toString();
		mav.addObject("bookId",bookId);
		mav.setViewName("/book/detail");
		
		return mav;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView update(@RequestParam Map<String, Object> map) {
		Map<String, Object> detailMap = this.bookService.detail(map);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("data", detailMap);
		mav.setViewName("/book/update");
		
		return mav;
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ModelAndView updatePost(@RequestParam Map<String, Object> map) {
		ModelAndView mav = new ModelAndView();
		
		boolean isUpdateSuccess = this.bookService.edit(map);
		if (isUpdateSuccess) {
			String BookId = map.get("bookId").toString();
			mav.setViewName("redirect:/detail?bookId=" + BookId);
		} else {
			mav = this.update(map);
		}
		
		return mav;
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ModelAndView deletePost(@RequestParam Map<String, Object> map) {
		ModelAndView mav = new ModelAndView();
		
		boolean isDeleteSuccess = this.bookService.remove(map);
		if (isDeleteSuccess) {
			mav.setViewName("redirect:/list");
		} else {
			String bookId = map.get("bookId").toString();
			mav.setViewName("redirect:/detail?bookId=" + bookId);
		}
		
		return mav;
	}
	
	@RequestMapping(value = "list.do")
	public ModelAndView list(@RequestParam Map<String, Object> map) {
		List <Map<String, Object>> list = this.bookService.list(map);
		ModelAndView mav = new ModelAndView();
		mav.addObject("data", list);
		if (map.containsKey("keyword")) {  
			mav.addObject("keyword", map.get("keyword"));  
		} 
		mav.setViewName("/book/list");
		
		return mav;
	}

}
