/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import Clases.*;
/**
 *
 * @author kamil
 */
public class Parcial2 {

    public static void main(String[] args) {
        Arbol adivinador = new Arbol();
        
        Nodo raiz = new Nodo("Tu animal es vertebrado?");
        
            Nodo plumas = new Nodo("Tu animal tiene plumas");
            raiz.setSi(plumas);
        
                Nodo avePresa = new Nodo("Tu animal es ave de presa?");
                plumas.setSi(avePresa);
                
                    Nodo nocturno = new Nodo("Tu animal es nocturno?");
                    avePresa.setSi(nocturno);
                    
                        nocturno.setSi(new Nodo("Buho"));
                        
                        Nodo velocidad = new Nodo("Tu animal es conocido por su velocidad?");
                        nocturno.setNo(velocidad);
                        
                            velocidad.setSi(new Nodo("Halcon"));
                            velocidad.setNo(new Nodo("Aguila"));
                            
                    Nodo granja = new Nodo("Tu animal es un ave domestica de granja?");
                    avePresa.setNo(granja);
                    
                        Nodo nadar = new Nodo("Tu animal nada habitualmente en lagos o estanques?");
                        granja.setSi(nadar);
                            
                            nadar.setSi(new Nodo("Pato"));
                            nadar.setNo(new Nodo("Gallina"));
                            
                        Nodo imita = new Nodo("Tu animal es capaz de imitar la voz humana?");
                        granja.setNo(imita);
                        
                            imita.setSi(new Nodo("Loro"));
                        
                            Nodo cuello = new Nodo("Tu animal tiene el cuello largo?");
                            imita.setNo(cuello);
                            
                                cuello.setSi(new Nodo("Cisne"));
                                cuello.setNo(new Nodo("Paloma"));
                            
                Nodo mamifero = new Nodo("Tu animal es mamifero?");
                plumas.setNo(mamifero);
                
                    Nodo domestico = new Nodo("Tu animal es domestico?");
                    mamifero.setSi(domestico);
                    
                        Nodo amigo = new Nodo("Tu animal es considerado el mejor amigo del hombre?");
                        domestico.setSi(amigo); 
                        
                            amigo.setSi(new Nodo("Perro"));
                            amigo.setNo(new Nodo("Gato"));
                            
                        Nodo deGranja = new Nodo("Tu animal es considerado de granja?");
                        domestico.setNo(deGranja);
                        
                            Nodo comestible  = new Nodo("Tu animal se come haitualmente?");
                            deGranja.setSi(comestible);
                                
                                Nodo leche = new Nodo("Tu animal consume leche que luego es consimda por seres humanos?");
                                comestible.setSi(leche);
                                
                                    Nodo lana = new Nodo("Tu animal produce lana?");
                                    leche.setSi(lana);
                                        
                                        lana.setSi(new Nodo("Oveja"));
                                        lana.setNo(new Nodo("Vaca"));
                                    
                                    leche.setNo(new Nodo("Cerdo"));
                            
                            Nodo montura = new Nodo("Tu animal se utiliza habitualmente para montar?");
                            deGranja.setNo(montura);
                                
                                montura.setSi(new Nodo("Caballo"));
                            
                                
                    Nodo agua1 = new Nodo("Tu animal vive principalmente en el agua?");
                    mamifero.setNo(agua1);        
                                
                    //No es mamifero
                    raiz.getSi().getSi().setNo(new Nodo("Tu animal vive principalmente en el agua?"));
                        //Si es mamifero
                            //Tiburón / Atún / Raya
                        
                        //No vive en el agua
                        raiz.getSi().getSi().getNo().setNo(new Nodo("Tu animal tiene la piel escamosa?"));
                            //Si tiene piel escamosa
                                //Cocodrilo / Lagarto / Iguana / Tortuga / Serpiente
                                
                            //No tiene piel escamosa
                                //Rana / Sapo / Salamandra
                                
            Nodo patas = new Nodo("Tu animal tiene 8 patas?");
            raiz.setNo(patas);
            
                Nodo cola = new Nodo("Tu animal tiene cola");
                patas.setSi(cola);
                
                    cola.setSi(new Nodo("Escorpion"));
                    cola.setNo(new Nodo("Araña"));
                    
                Nodo volar = new Nodo("Tu animal puede volar?");
                patas.setNo(volar);
                
                    Nodo pica = new Nodo("Tu animal pica?");
                    volar.setSi(pica);
                    
                        Nodo amarillo =  new Nodo("Tu animal es mayormente amarillos?");
                        pica.setSi(amarillo);
                        
                            amarillo.setSi(new Nodo("Abeja"));
                            amarillo.setNo(new Nodo("Mosquito"));
                            
                        pica.setNo(new Nodo("Mariposa"));
                        
                    Nodo agua = new Nodo("Tu animal vive en el agua?");
                    volar.setNo(agua);
                    
                        Nodo tentaculos = new Nodo("Tu animal tiene tentaculos?");
                        agua.setSi(tentaculos);
                        
                            Nodo tinta = new Nodo("Tu animal se defiende tirando tinta?");
                            tentaculos.setSi(tinta);
                            
                                tinta.setSi(new Nodo("Pulpo"));
                                tinta.setNo(new Nodo("Medusa"));
                                
                            tentaculos.setNo(new Nodo("Cangrejo"));
                            
                        Nodo salto = new Nodo("Tu animal peude saltar grandes distancias?");
                        agua.setNo(salto);
                        
                            salto.setSi(new Nodo("Pulga"));
                            
                            Nodo sangre = new Nodo("Tu animal se alimenta de sangre adheriendose a otros animales");
                            salto.setNo(sangre);
                            
                                sangre.setSi(new Nodo("Garrapata"));
                                sangre.setNo(new Nodo("Hormiga"));
                
    }
}
/*
¿Tiene columna vertebral?
├─ Sí
│  ├─ ¿Tiene plumas?
│  │  ├─ Sí
│  │  │  ├─ ¿Es ave de presa?
│  │  │  │  ├─ Sí → Águila / Halcón / Búho
│  │  │  │  └─ No → Loro / Paloma / Gallina / Pato / Cisne
│  │
│  └─ No
│     ├─ ¿Es mamífero?
│     │  ├─ Sí
│     │  │  ├─ ¿Es doméstico?
│     │  │  │  ├─ Sí → Perro / Gato / Caballo / Vaca / Oveja / Cerdo
│     │  │  │  └─ No → León / Tigre / Elefante / Jirafa / Cebra
│     │
│     │  └─ No
│     │     ├─ ¿Vive principalmente en el agua?
│     │     │  ├─ Sí → Tiburón / Atún / Raya
│     │     │  └─ No
│     │     │     ├─ ¿Tiene piel escamosa?
│     │     │     │  ├─ Sí → Cocodrilo / Lagarto / Iguana / Tortuga / Serpiente
│     │     │     │  └─ No → Rana / Sapo / Salamandra
│

*/