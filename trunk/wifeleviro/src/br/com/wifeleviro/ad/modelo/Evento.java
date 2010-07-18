package br.com.wifeleviro.ad.modelo;

public class Evento {

	public static final int GERAR_MENSAGEM = 0;
	public static final int INICIO_TX_PC = 1;
	public static final int CHEGADA_QUADRO_NO_RX_HUB = 2;
	public static final int INICIO_CHEGADA_QUADRO_NO_RX_TERMINAL = 3;
	public static final int FIM_CHEGADA_QUADRO_NO_RX_TERMINAL = 4;
	public static final int GERAR_REFORCO_COLISAO = 5;
	
	private int tipoEvento;
	private int idTerminalOrigemDaMensagem;
	
	private Integer idTerminalDestino;
	
	public Evento(int idTerminalOrigemDaMensagem, int tipoEvento){
		this.idTerminalOrigemDaMensagem = idTerminalOrigemDaMensagem;
		this.tipoEvento = tipoEvento;
		this.idTerminalDestino = null;
	}

	public Evento(int idTerminalOrigemDaMensagem, int idTerminalDestino, int tipoEvento){
		this.idTerminalOrigemDaMensagem = idTerminalOrigemDaMensagem;
		this.tipoEvento = tipoEvento;
		this.idTerminalDestino = idTerminalDestino;
	}
	
	public int getIdTerminalOrigemDaMensagem() {
		return idTerminalOrigemDaMensagem;
	}
	
	public int getTipoEvento() {
		return tipoEvento;
	}

	public Integer getIdTerminalDestino() {
		return idTerminalDestino;
	}

}

