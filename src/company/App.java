package company;
public class App {
    public static void main(String[] args) throws Exception {
        // Instancia de InstrumentoViento
        InstrumentoViento instrumentoViento = new InstrumentoViento("Trompeta");
        
        instrumentoViento.afinar();
        instrumentoViento.tocar();

        System.out.println(instrumentoViento.obtTipoDeInstrumento());


        System.out.println("======================================");

        // Instancia de guitarra
        Guitarra guitarraElectrica = new Guitarra();
        guitarraElectrica.afinar();
        guitarraElectrica.tocar();
        System.out.println(guitarraElectrica.obtTipoDeInstrumento());
    }
}
