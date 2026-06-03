/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package Clases;

public class Nodo {
    /*
    Cada nodo del arbol contiene una pregunta con respuesta SI o NO(boolean)
    Cada hoja del arbol contiene un animal que son los que
     */
    
    private String consulta;
    private Nodo si;
    private Nodo no;
    
    public Nodo(String consulta){
        this.consulta=consulta;
        this.si=null;
        this.no=null;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public Nodo getSi() {
        return si;
    }

    public void setSi(Nodo si) {
        this.si = si;
    }

    public Nodo getNo() {
        return no;
    }

    public void setNo(Nodo no) {
        this.no = no;
    }
    
}
