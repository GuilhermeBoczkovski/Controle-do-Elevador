/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

/**
 *
 * @author Jean Hauck
 */
public class Elevador implements IElevador {
    
    private int capacidade;
    private int totalPessoas;
    private int totalAndaresPredio;
    private int andarAtual;
    
    public Elevador(int andarAtual, int totalAndaresPredio, int capacidade, int totalPessoas){
        this.andarAtual = andarAtual;
        this.totalAndaresPredio = totalAndaresPredio;
        this.capacidade = capacidade;
        this.totalPessoas = totalPessoas;
    }
    
    public String subir() throws ElevadorJahNoUltimoAndarException{
        if(andarAtual<totalAndaresPredio){
            andarAtual++;
        }else{
            throw new ElevadorJahNoUltimoAndarException();
        }
        return "O Elevador subiu ate o andar " + this.andarAtual;
    }
    public String descer() throws ElevadorJahNoTerreoException{
        if(andarAtual>0){
            andarAtual--;
        }else{
            throw new ElevadorJahNoTerreoException();
        }	 	  	  		      	     	      			       	 	
        return "O Elevador desceu ate o andar " + this.andarAtual;
    }
    public String entraPessoa() throws ElevadorCheioException{
        if(totalPessoas<capacidade){
            totalPessoas++;
        }else{
            throw new ElevadorCheioException();
        }
        return "No elevador ha " + totalPessoas + " pessoas";
    }
    public String saiPessoa() throws ElevadorJahVazioException{
        if(totalPessoas>0){
            totalPessoas--;
        }else{
            throw new ElevadorJahVazioException();
        }
        return "No elevador ha " + totalPessoas + " pessoas";
    }
    
    public int getCapacidade(){
        return this.capacidade;
    }
    public int getTotalPessoas(){
        return this.totalPessoas;
    }
    public int getTotalAndaresPredio(){
        return this.totalAndaresPredio;
    }
    public int getAndarAtual(){
        return this.andarAtual;
    }
    
    public void setTotalAndaresPredio(int totalAndaresPredio){
        this.totalAndaresPredio = totalAndaresPredio;
    }
}	 	  	  		      	     	      			       	 	