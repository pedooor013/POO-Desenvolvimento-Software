import java.io.IOException;

public class Main {
    public void m() throws IOException {
        throw new IOException("Erro de dispositivo!");
    }

    public static void main(String[] args) {
        try{
            Main main = new Main();
            main.m();
        }catch(Exception e){
            System.out.println("Algo deu errado! \n " + e.getMessage());
            e.printStackTrace();
            System.out.println("toString da Exceção! \n " + e.toString());
        }finally {
            System.out.println("O try catch terminou!");
        }

    }
}
