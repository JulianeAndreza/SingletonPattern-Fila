public class main
{

    public static void main(String[] args) 
    {

        Fila fila = Fila.getInstancia();

        fila.ImprimeDoc();
        fila.RemoveDoc();
        fila.RemoveTodosDocs();
    }
}
