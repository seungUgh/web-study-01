package unit01.dao;

import java.util.List;

import unit01.dto.Title;

public interface TitleDao {
	List<Title> selectTitleByAll();
	
	Title selectTitleByNo(Title title);
	
	int insertTitle(Title title);

	int updateTitle(Title title);
	
	int deleteTitle(Title title);
	
	
}