package sample.spring.yse;

import java.util.Map;

public interface BookService {
	// 메소드 시그니처 생성
	
	String create(Map<String, Object> map);

	Map <String, Object> detail(Map<String, Object> map);
	
	boolean edit(Map<String, Object> map);
}
