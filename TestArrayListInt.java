
/**
 * Write a description of class TestAgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestArrayListInt
{
    private int numeroTestsFallados;

    /**
     * Constructor for objects of class TestArrayListInt
     */
    public TestArrayListInt()
    {   
        numeroTestsFallados = 0;
        
        AgendaTelefonica agenda = new AgendaTelefonica();        
        numeroTestsFallados += testea(null, agenda.lookupNumber("Paco"), "lookupNumber(String name)");
        
        agenda.enterNumber("Paco","666555444");
        agenda.enterNumber("Pepe","666554433");
        numeroTestsFallados += testea("666555444", agenda.lookupNumber("Paco"), "enterNumber('Paco','666555444')");
        numeroTestsFallados += testea(null, agenda.lookupNumber("Rodrigo"), "lookupNumber('Rodrigo')");
        
        
        if (numeroTestsFallados == 0) {
            System.out.println("Todos los test se han pasado correctamente!!");
        }
        else {
            System.out.println("Han fallado " + numeroTestsFallados + " tests!!!");
        }
    }


    public int testea(Object valorEsperado, Object valorObtenido, 
                          String nombreFuncion)
    {
        int valorDevuelto = 0;
        if (valorEsperado == valorObtenido) {
            System.out.println("OK: " + nombreFuncion);
        }
        else {
            System.out.println("ERROR!!!!! " + nombreFuncion);
            System.out.println("Valor obtenido: " + valorObtenido + 
                               " / Valor esperado: " + valorEsperado);
            valorDevuelto = 1;
        }
        return valorDevuelto;
    }

}