package progam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Reserva;

public class Principal {

	public static void main(String[] args) throws ParseException {
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println(" Digite o Quarto ");
		Integer NumeroQuarto = teclado.nextInt();
		System.out.println(" Data de Entrada : (dd/mm/aaaa)");
		Date Entrada = sdf.parse(teclado.next());
		System.out.println(" Data de Saida : (dd/mm/aaaa)");
		Date Saida = sdf.parse(teclado.next());
		
		if(!Saida.after(Entrada)) {
			System.out.println(" Data invalida");
		}else {
			Reserva r1 = new Reserva(NumeroQuarto, Entrada, Saida);
			System.out.println(r1);
			System.out.println(" Nova Reserva ");
			System.out.println(" Data de Entrada : (dd/mm/aaaa)");
			 Entrada = sdf.parse(teclado.next());
			System.out.println(" Data de Saida : (dd/mm/aaaa)");
			 Saida = sdf.parse(teclado.next());
			r1.MudançaDeDatas(Entrada, Saida);
		}
	}

}
