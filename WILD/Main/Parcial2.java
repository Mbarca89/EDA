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
                        
                        Nodo velocidad = new Nodo("Tu animal es considerado el vae mas rapida del mundo?");
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
                
                    Nodo trompa =  new Nodo("Tu aniamal tiene trompa?");
                    mamifero.setSi(trompa);
                    
                        trompa.setSi(new Nodo("Elefante"));
                        
                        Nodo cuelloMamifero = new Nodo("Tu animal tiene el cuello muy largo?");
                        trompa.setNo(cuelloMamifero);
                        
                            cuelloMamifero.setSi(new Nodo("Jirafa"));
                            
                            Nodo domestico = new Nodo("Tu animal es domestico?");
                            cuelloMamifero.setNo(domestico);

                                Nodo ladra = new Nodo("Tu animal ladra?");
                                domestico.setSi(ladra);

                                    ladra.setSi(new Nodo("Perro"));

                                    Nodo maulla= new Nodo("Tu animal maulla?");
                                    ladra.setNo(maulla);

                                        maulla.setSi(new Nodo("Gato"));

                                        Nodo lana = new Nodo("Tu animal produce lana?");
                                        maulla.setNo(lana);
                                        //rayas
                                            lana.setSi(new Nodo("Oveja"));

                                            Nodo relincha = new Nodo("Tu animal relincha?");
                                            lana.setNo(relincha);

                                                relincha.setSi(new Nodo("Caballo"));

                                                Nodo hocico = new Nodo("Tu animal tiene el hocico chato?");
                                                relincha.setNo(hocico);

                                                    hocico.setSi(new Nodo("Cerdo"));
                                                    hocico.setNo(new Nodo("Vaca"));
                                                        
                                Nodo melena = new Nodo("Tu aniaml tiene melena?");
                                domestico.setNo(melena);

                                    melena.setSi(new Nodo("Leon"));

                                    Nodo primate = new Nodo("Tu animal es un primate?");
                                    melena.setNo(primate);

                                        Nodo robustez = new Nodo("Tu animal es muy robusto?");
                                        primate.setSi(robustez);

                                            robustez.setSi(new Nodo("Gorila"));
                                            robustez.setNo(new Nodo("Mono"));

                                        Nodo byn = new Nodo("Tu animal tiene rayas blancas y negras?");
                                        primate.setNo(byn);

                                            byn.setSi(new Nodo("Cebra"));
                                            
                                            Nodo rayas = new Nodo("Tu animal tiene rayas?");
                                            byn.setNo(rayas);

                                                rayas.setSi(new Nodo("Tigre"));
                                            
                                                Nodo mar = new Nodo("Tu animal vive en el mar?");
                                                rayas.setNo(mar);

                                                    Nodo enorme = new Nodo("Tu animal es enorme?");
                                                    mar.setSi(enorme);

                                                        enorme.setSi(new Nodo("Ballena"));
                                                        enorme.setNo(new Nodo("Delfin"));

                                                    mar.setNo(new Nodo("Oso"));
                             
                    Nodo aguaMamifero = new Nodo("Tu animal vive principalmente en el agua?");
                    mamifero.setNo(aguaMamifero);        
                                
                        Nodo aplanado = new Nodo("Tu animal tiene cuerpo aplanado?");
                        aguaMamifero.setSi(aplanado);
                        
                            aplanado.setSi(new Nodo("Mantarraya"));
                            
                            Nodo depredador =  new Nodo("Tu animal es un gran depredador?");
                            aplanado.setNo(depredador);
                            
                                depredador.setSi(new Nodo("Tiburon"));
                                depredador.setNo(new Nodo("Atun"));
                                
                        Nodo escamosa = new Nodo("Tu animal tiene la piel escamoza?");
                        aguaMamifero.setNo(escamosa);
                            
                            Nodo caparazon = new Nodo("Tu animal tiene caparazon?");
                            escamosa.setSi(caparazon);
                            
                                caparazon.setSi(new Nodo("Tortuga"));
                                
                                Nodo patas = new Nodo("Tu animal tiene patas?");
                                caparazon.setNo(patas);
                                
                                    Nodo color =  new Nodo("Tu animal cambia de color?");
                                    patas.setSi(color);
                                    
                                        color.setSi(new Nodo("Camaleon"));
                                        
                                        Nodo viveAgua = new Nodo("Tu animal vive cerca del agua?");
                                        color.setNo(viveAgua);
                                        
                                            viveAgua.setSi(new Nodo("Cocodrilo"));
                                            viveAgua.setNo(new Nodo("Iguana"));
                                            
                                    patas.setNo(new Nodo("Serpiente"));
                                    
                            Nodo adultez = new Nodo("Tu animal tiene cola en la adultez?");
                            escamosa.setNo(adultez);
                            
                                adultez.setSi(new Nodo("Salamandra"));
                                adultez.setNo(new Nodo("Sapo"));
                                
            Nodo patas8 = new Nodo("Tu animal tiene 8 patas?");
            raiz.setNo(patas8);
            
                Nodo cola = new Nodo("Tu animal tiene cola");
                patas8.setSi(cola);
                
                    cola.setSi(new Nodo("Escorpion"));
                    cola.setNo(new Nodo("Araña"));
                    
                Nodo volar = new Nodo("Tu animal puede volar?");
                patas8.setNo(volar);
                
                    Nodo pica = new Nodo("Tu animal pica?");
                    volar.setSi(pica);
                    
                        Nodo amarillo =  new Nodo("Tu animal es mayormente amarillos?");
                        pica.setSi(amarillo);
                        
                            amarillo.setSi(new Nodo("Abeja"));
                            amarillo.setNo(new Nodo("Mosquito"));
                            //halcon
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
