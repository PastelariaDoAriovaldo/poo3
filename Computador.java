package poo;

public class Computador {
	
	String marca,modelo,perifericos,cor;
	int dataLancamento;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	public String getPerifericos() {
		return perifericos;
	}
	public void setPerifericos(String perifericos) {
		this.perifericos=perifericos;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor=cor;
	}
	public int getdataLancamento() {
		return dataLancamento;
	}
	public void setdataLancamneto(int dataLancamento) {
		this.dataLancamento=dataLancamento;
	}
	public String ligar () {
		return "Liga";
	}
	public String desligar () {
		return "desliga";
	}
	public String clicar () {
		return "clica";
	}
	public String reiniciar () {
		return "reinicia";
	}
}
