package app.ito.poo;
import java.time.LocalDate;
import clases.ito.poo.cuentaBancaria;

public class MyApp {

	static void run() {
		cuentaBancaria c=new cuentaBancaria(89393L,"Lucia Mendoza",15000,LocalDate.of(2021, 2, 18));
		 System.out.println(c);
        System.out.println(c.retiro(500));
        System.out.println(c);
        System.out.println(c.deposito(100));
        System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
       run();
	}

}
