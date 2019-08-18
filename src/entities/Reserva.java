package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import entities.exception.Excessao;

public class Reserva {
   private Integer NumerodoQuarto;
   private Date entrada;
   private Date Saida;
   private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
   private Date Atual = new Date();
public Reserva(Integer numerodoQuarto, Date entrada, Date saida)  {
	if(!saida.after(entrada)) {
		throw new Excessao ( " Error ");
	}
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
	long tempo =  Saida.getTime() - entrada.getTime();
	return TimeUnit.DAYS.convert(tempo,TimeUnit.MILLISECONDS);
}

public void MudançaDeDatas(Date Entrada,Date Saida) {
	
	if(Entrada.before(Atual) || Saida.before(Atual)) {
		throw new Excessao( " Data Invalida");
	}else if(!Saida.after(Entrada)) {
		throw new Excessao ( " Error ");
	}
	
	this.entrada = Entrada;
	this.Saida = Saida;

}


@Override
public String toString() {
	return "Reserva [NumerodoQuarto=" + NumerodoQuarto + ", entrada=" + sdf.format(entrada) + ", Saida=" +sdf.format( Saida )+ "] , Duração : "+duração();
}

   
   
}
