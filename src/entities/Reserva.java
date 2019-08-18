package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
   private Integer NumerodoQuarto;
   private Date entrada;
   private Date Saida;
   private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
   
public Reserva(Integer numerodoQuarto, Date entrada, Date saida) {
	
	NumerodoQuarto = numerodoQuarto;
	this.entrada = entrada;
	Saida = saida;
}
public Integer getNumerodoQuarto() {
	return NumerodoQuarto;
}
public void setNumerodoQuarto(Integer numerodoQuarto) {
	NumerodoQuarto = numerodoQuarto;
}
public Date getEntrada() {
	return entrada;
}

public Date getSaida() {
	return Saida;
}

public long duração() {
	long tempo = entrada.getTime() - Saida.getTime();
	return TimeUnit.DAYS.convert(tempo,TimeUnit.MILLISECONDS);
}

public void MudançaDeDatas(Date Entrada,Date Saida) {
	this.entrada = Entrada;
	this.Saida = Saida;
}


@Override
public String toString() {
	return "Reserva [NumerodoQuarto=" + NumerodoQuarto + ", entrada=" + sdf.format(entrada) + ", Saida=" +sdf.format( Saida )+ "] , Duração : "+duração();
}

   
   
}
