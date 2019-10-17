package repositorios;

public class main {

	public static void main(String[] args) {
		DiaDeHoje DiaDeHoje = new DiaDeHoje("Dias da semana", DiaDaSemana.Domingo);
		
		DiaDeHoje.MensagemDoDia(new DiaDomingo());
		DiaDeHoje.MensagemDoDia(new DiaSegunda());
		DiaDeHoje.MensagemDoDia(new DiaTerca());
		DiaDeHoje.MensagemDoDia(new DiaQuarta());
		DiaDeHoje.MensagemDoDia(new DiaQuinta());
		DiaDeHoje.MensagemDoDia(new DiaSexta());
		DiaDeHoje.MensagemDoDia(new DiaSabado());

	}

}
 