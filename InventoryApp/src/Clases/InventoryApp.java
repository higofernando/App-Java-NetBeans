
package Clases;

import Interfacez.FrmLogin;


public class InventoryApp {

    public static void main(String[] args) {
        //Creo el objeto datos 
        Datos misDatos = new Datos();
        //Llamar a la interfaz de Login
        FrmLogin miLogin = new FrmLogin();
        miLogin.setDatos(misDatos);
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
        
        
    }
    
}
