package company;
public class InstrumentoViento implements InstrumentoMusical{
    final private String tipoDeInstrumento="De viento";
    private String nombreInstrumento = "";

    InstrumentoViento(){
        this.nombreInstrumento = "";
    }

    InstrumentoViento(String nombreInstrumento){
        this.nombreInstrumento = nombreInstrumento;
    }

    @Override
    public void tocar(){
        System.out.println("Tocando " + nombreInstrumento + "... ");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando " + nombreInstrumento + "... ");
        
    }

    @Override
    public String obtTipoDeInstrumento() {
        return tipoDeInstrumento;
    }
}