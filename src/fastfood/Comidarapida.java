/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastfood;

/**
 *
 * @author eliasvidal
 */
public class Comidarapida{
  
    private float gaseosas;
    private float pizzas;
    private float hamburgers;
    private float picadas ;
    private float aguas;


    private float vrgaseosa;
    private float vrpizza;
    private float vrhamburger;
    private float vrpicada ;
    private float vragua;
    private float iva;
    

//constructor se encarga de darles el valor de los productos y el del iva 
//tambien inicializa en cero los atributos
    public Comidarapida(float gas,float piz, float ham,float pica, float agua, float i){
        
        vrgaseosa = gas;
        vrpizza = piz;
        vrhamburger = ham;
        vrpicada = pica;
        vragua = agua;
        iva =i;
        gaseosas=0;
        pizzas=0;
        hamburgers=0;
        picadas =0;
        aguas=0;
        
    }
    
// Metodod get para extraer los valores de cada producto y el valor del iva, 
   public double getIva() {
        return iva;     }
   public float getvrGaseosas() {
        return vrgaseosa;     }
   public float getvrPizzas() {
        return vrpizza;    }
   public float getvrHamburgers() {
        return vrhamburger;    }
   public float getvrPicadas() {
        return vrpicada;    }
    public float getvrAguas() {
        return vragua;    }
    public float getiva() {
        return iva;
    }

//Metodos get y set para manipular la cantidad comprada de productos
    public float getGaseosas() {
        return gaseosas;
    }

    public void setGaseosas(float g) {
        this.gaseosas = g;
    }

    public float getPizzas() {
        return pizzas;
    }

    public void setPizzas(float p) {
        this.pizzas = p;
    }

    public float getHamburgers() {
        return hamburgers;
    }

    public void setHamburgers(float h) {
        this.hamburgers = h;
    }

    public float getPicadas() {
        return picadas;
    }

    public void setPicadas(float p) {
        this.picadas = p;
    }

    public float getAguas() {
        return aguas;
    }

    public void setAgua(float agua) {
        this.aguas = agua;
    }

    public float valorCompra() {
        float compra;
        compra = getGaseosas()*getvrGaseosas() + getHamburgers()* getvrHamburgers()+getPicadas()* getvrPicadas()+getPizzas()*getvrPizzas() +getAguas()*getvrAguas();
        return compra; 
    }
   
public float calcularIva() {
		float vriva;
		vriva=valorCompra()*getiva();
       return  vriva;
    }
	
public float ValoraPagar() {
		 float total;
		total=valorCompra()+ calcularIva();
       return  total;
    }
        
}


