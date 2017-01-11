package com.rasik.menuDAO;

import org.springframework.jdbc.core.JdbcTemplate;

import com.rasik.menu.Menu;
import connectionUtil.ConnectionUtil;

public class MenuDao {

	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public void save(Menu menu) {

		String sql = "insert into FoodApp(id,name) values(?,?)";
		Object[] params = { menu.getId(), menu.getName() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);

	}

	public void update(Menu menu) {

		String sql = "update FoodApp set name=? where id=?";
		Object[] params = { menu.getName(), menu.getId() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows updated: " + rows);

	}

	public void delete(int id) {

		String sql = "delete from FoodApp where id=?";
		Object[] params = { id };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows deleted: " + rows);

	}

}