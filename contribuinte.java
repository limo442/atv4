
 
package irpf;

/**
 *
 * @author gabri
 */
public class contribuinte {
    
private String nome;

    private String CPF;
    
    private float salario;
    
    private float irpf_desconto;
    
    private float aliquota;
    

    public contribuinte(String nome, String cpf, float salario)
    {
        this.nome = nome;
        
        this.CPF = cpf;
        
        this.salario = salario;
        
        irpf();
    }
    

    public String getNome(){
        
        return nome;
    }
    public String getCpf(){
        
        return CPF;
    }
    public float getSalario(){
        
        return salario;
    }

    public float getAliquota(){
        
        return salario;
    }

    public void setNome(String nome){
        
        this.nome = nome;
    }
    public void setCpf(String cpf){
        
        this.CPF = cpf;
    }
    public void setSalario(float salario){
        
        this.salario = salario;
        
        irpf();
    }

    public void irpf(){
        
        
        
        if (salario <= 1903.98){
            
            aliquota = 0;
            
            irpf_desconto = salario * (aliquota / 100); 
            
        } else if(salario <= 2826.65) {
            
            aliquota = 7.5f;
            
            irpf_desconto = salario * (aliquota / 100); 
            
        } else if(salario <= 3751.05) {
            
            aliquota = 15f;
            
            irpf_desconto = salario * (aliquota / 100); 
            
        } else if(salario <= 4664.68) {
            
            aliquota = 22.5f;
            
            irpf_desconto = salario * (aliquota / 100);
            
        } else{
            aliquota = 27.5f;
            
            irpf_desconto = salario * (aliquota / 100);
            
        }
    }

    public float calculosalarioliquido(){
        
        return salario - irpf_desconto;
        
    }

    public void saída(){
        
        System.out.println(nome);
        
        System.out.println(CPF);
        
        System.out.println(salario);
        
        System.out.println(irpf_desconto);
        
        System.out.println(aliquota);
        
    }
}