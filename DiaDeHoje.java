package repositorios;

public class DiaDeHoje {

		private String dia;
		private DiaDaSemana msgDia;
		
		public DiaDeHoje(String dia, DiaDaSemana msgDia){
			super();
			this.dia = dia;
			this.msgDia = msgDia;
		}
		
		public void MensagemDoDia(Dia dias){
			System.out
			.println(dia + " a mensagem desse dia é: ");
	System.out.println(dias.mensagem());
		}
}
