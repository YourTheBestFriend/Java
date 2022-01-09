package com.program_obespech2;

public class software_all extends program_obespech2{
		int flag1;
		public software_all(){};
		public software_all(int pole1, String name, int flag1)
		{
			// Вызываю конструктор класса родителя
			super(pole1, name);
			this.flag1 = flag1;
		}
		public int getFlag1() {
			return flag1;
		}
		public void setFlag1(int flag1) {
			this.flag1 = flag1;
		}
}
