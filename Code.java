public class Fila 
{
  
  private static Fila instancia;

    private Fila() 
    {
        // Fila de impressão
    }

    public static Fila getInstancia() 
    {

        if (instancia == null) 
        {
            instancia = new Fila();
        }
        return instancia;
    }

    public void ImprimeDoc() 
    {
        //Imprime um documento especifico
    }

    public void RemoveDoc() 
    {
       //Remove documento especifico
    }

    public void RemoveTodosDocs() 
    {
        // Remove todos os documentos
    }
}
