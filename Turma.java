
public class Turma {
	
	public int ano;
	public int codigo;
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String mostrarInfo(){
		return "// relatório da turma"+getAno()+"//"+
		"código: "+getCodigo();
		//a finalizar
	}
}
