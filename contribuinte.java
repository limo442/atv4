/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alunocmc
 */
public class contribuinte {
    private String nome;
    private String cpf;
    private float salario;
    private float desc_irpf;
    
    public void calculoirpf(){
    if(salario <= 1903)
    {
    desc_irpf = (salario * 0) - salario;
            }
    else if (salario >= 2826 && salario <= 3751)
            {
                desc_irpf = (salario * 0.0075f) - salario;
            }
            
    }
    
    
    
}
