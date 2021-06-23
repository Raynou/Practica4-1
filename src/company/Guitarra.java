package company;
public class Guitarra implements InstrumentoMusical{
    final private String tipoDeInstrumento = "De cuerda pulsada";    
    @Override
    public void tocar() {
        System.out.println("Tocando guitarra... ");
        
    }
    @Override
    public void afinar() {
        System.out.println("Afinando guitarra... ");
        
    }
    @Override
    public String obtTipoDeInstrumento() {
        return tipoDeInstrumento;
    }

}