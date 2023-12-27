public class App {
    public static void main(String[] args) throws Exception {
        //Creando Moto
        Moto moto_1 = new Moto("BMW", 2000, "Azul", 1.5f, "Gasolina", 200, 100);
        
        //Mostrando moto
        moto_1.informacionMoto();

        //Accelerando moto 20km/h
        System.out.println("\n\t***Acelerando Moto 20km/h***");
        moto_1.acelerar(20);
        System.out.println("Velocidad Actual: "+moto_1.getVelocidadActual()+" km/h");

        //Desacelerando moto  50km/h
        System.out.println("\n\t***Decrementando velocidad de la  Moto 50km/h***");
        moto_1.desacelerar(50);
        System.out.println("Velocidad Actual: "+moto_1.getVelocidadActual()+" km/h");

        //Frenando moto 
        System.out.println("\n\t***Frenando Moto***");
        moto_1.frenar();
        System.out.println("Velocidad Actual: "+moto_1.getVelocidadActual()+" km/h");
    }
}

class Moto {

        //Atributos
        private String marca, tipo_combustible, color;
        private int modelo, velocidad_maxima, velocidad_actual;
        private float motor;

        //Constructor
        public Moto(String marca, int modelo, String color, float motor, String tipo_combustible, int velocidad_maxima, int velocidad_actual){
            this.marca = marca;
            this.modelo = modelo;
            this.color = color;
            this.motor = motor;
            this.tipo_combustible = tipo_combustible;
            this.velocidad_maxima = velocidad_maxima;
            this.velocidad_actual = velocidad_actual;
        }

        // Getters y Setters
        public String getMarca(){
            return marca;
        }

        public void setMarca(String marca){
            this.marca = marca;
        }

        public int getModelo(){
            return modelo;
        }

        public void setModelo(int modelo){
            this.modelo = modelo;
        }

        public String getColor(){
            return color;
        }

        public void setColor(String color){
            this.color = color;
        }

        public float getMotor(){
            return motor;
        }

        public void setMotor(float motor){
            this.motor = motor;
        }

        public String getTipoCombustible(){
            return tipo_combustible;
        }

        public void setTipoCombustible(String tipo_combustible){
            this.tipo_combustible = tipo_combustible;
        }

        public int getVelocidadMaxima(){
            return velocidad_maxima;
        }

        public void setVelocidadMaxima(int velocidad_maxima){
            this.velocidad_maxima = velocidad_maxima;
        }

        public int getVelocidadActual(){
            return velocidad_actual;
        }

        public void setVelocidadActual(int velocidad_actual){
            this.velocidad_actual = velocidad_actual;
        }

        //Acelerar
        public void acelerar(int acceleracion){
            int velocidad = velocidad_actual + acceleracion;
            if(velocidad > velocidad_maxima){
                System.out.println("La velocidad no es posible debe ser menor a la velocidad maxima de la moto");
            }
            else{
                velocidad_actual = velocidad;
            }
        }

        //Desalecelerar
        public void desacelerar(int desaceleracion){
            int velocidad = velocidad_actual - desaceleracion;
            if(velocidad < 0){
                System.out.println("La velocidad debe ser positiva");
            }
            else{
                velocidad_actual = velocidad;
            }
        }

        //Frenar
        public int frenar(){
            return velocidad_actual = 0;
        }

        //Tiempo estimado del recorrido
        public float tiempoEstimado(float distancia_recorrer){
            return distancia_recorrer / velocidad_actual;
        }

        //Detalles de la Moto
        public void informacionMoto(){
            System.out.println("\t\tDatos de la Moto\n");
            System.out.println("1.Marca: "+marca);
            System.out.println("2.Modelo: "+modelo);
            System.out.println("3.Color: "+color);
            System.out.println("5.Motor: "+motor+" litros");
            System.out.println("6.Velocidad Maxima: "+velocidad_maxima+" km/h");
            System.out.println("7.Velocidad Actual: "+velocidad_actual+" km/h");
        }
    }
