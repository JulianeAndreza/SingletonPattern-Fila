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
        System.out.println("Documento impresso.");
    }

    public void RemoveDoc() 
    {
        System.out.println("Documento removido da fila.");
    }

    public void RemoveTodosDocs() 
    {
        System.out.println("Todos os documentos removidos da fila.");
    }
}
