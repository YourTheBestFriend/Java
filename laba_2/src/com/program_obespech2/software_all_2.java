package com.program_obespech2;

public class software_all_2 extends program_obespech2 {

		int flag2;
		public software_all_2(){};
		public software_all_2(int pole1, String name, int flag2)
		{
			// Вызываю конструктор класса родителя
			super(pole1, name);
			this.flag2 = flag2;
		}
		public int getFlag2() {
			return flag2;
		}
		public void setFlag2(int flag2) {
			this.flag2 = flag2;
		}
}
