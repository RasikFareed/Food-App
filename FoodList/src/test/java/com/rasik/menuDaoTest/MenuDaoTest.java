package com.rasik.menuDaoTest;

import com.rasik.menuDAO.*;
import com.rasik.menu.*;
public class MenuDaoTest {

	public static void main(String[] args) {

		MenuDao menudao = new MenuDao();

		 Menu menu = new Menu();

		 menu.setId(1);
		 menu.setName("Vada");

		 menudao.save(menu);
		// menudao.update(menu);
		//menudao.delete(1);

	}

}
