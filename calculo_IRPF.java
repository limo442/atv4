
package calculo_IRPF;


public class calculo_IRPF {
       

    public static void main(String[] args) {
        contribuinte c1 = new contribuinte("joao", "45638192365", 1300);
        contribuinte c2 = new contribuinte("felipinho", "47379700855", 2150);
        contribuinte c3 = new contribuinte("antonio", "78123489302", 3500);
        contribuinte c4 = new contribuinte("rafinha", "45213697452", 5600);

        c1.saída(); 
        
       // salário R$ 1.300,00 = R$ 0,00
       
        c1.calculosalarioliquido();
        
        c2.saída(); 
        
       // salário R$ 2.150,00 = R$ 161,25
       
        c2.calculosalarioliquido();
        
        c3.saída();
        
        // salário R$ 3.500,00 = R$ 525,00
        
        c3.calculosalarioliquido();
        
        c4.saída();
        
        //salário R$ 5.600,00 = R$ 1540,00
        
        c4.calculosalarioliquido();
    }
       }


