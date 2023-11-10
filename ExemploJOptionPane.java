package exemplos;

import javax.swing.*; 

public class ExemploJOptionPane {
	
 JFrame f;  
 
 ExemploJOptionPane(){  
    f = new JFrame();  
    JOptionPane.showMessageDialog(f,"Olá, Seja, bem-vindo ao MC Donald's"); 
    JOptionPane.showMessageDialog(f,"Opção 1 - Lançamentos"); 
}  
public static void main(String[] args) {  
    new ExemploJOptionPane();  
}  
}  
