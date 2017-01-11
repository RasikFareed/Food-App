package com.rasik.menuDaoTest;

import com.rasik.menuDAO.*;
public class MenuDaoTest {

	public static void main(String[] args) {

		MenuDao menudao = new MenuDao();

		// Menu menu = new Menu();

		// menu.setId(1);
		// menu.setName("Vada");

		// menuDAO.save(menu);
		// menuDAO.update(menu);
		menudao.delete(1);

	}

}
