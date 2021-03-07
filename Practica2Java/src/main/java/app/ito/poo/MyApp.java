package app.ito.poo;

import java.time.LocalDate;
import clases.ito.poo.cuentaBancaria;

public class MyApp {

	static void run() {
		System.out.println(new cuentaBancaria(89393L,"Lucia Mendoza",15000,LocalDate.of(2021, 2, 18)));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       run();
	}

}
