public class Main extends Window{
    public static void main(String[] args) {
        Window ventana = new Window();
        Thread hilo = new Thread(ventana.cubo);
        try{
            Thread.sleep(100);
            hilo.start();
        } catch(Exception e){
            System.out.println("Error al ejecutar el hilo");
        }
        
    }
}