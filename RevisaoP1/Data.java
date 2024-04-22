// Codifique uma classe que represente uma data
// Para validar a data, considere:
// - Meses com 30 dias: 4, 6, 9, 11
// - Meses com 31 dias: 1, 3, 5, 7, 8, 10, 12
// - Ano bissexto: Divisível por 4, mas não por 100. ou divisível por 400.

public class Data {

    private int dia, mes, ano;
   
    public Data (int d, int m, int a) {
        setData(d,m,a);
    }
    
    public Data (int m, int a) {
        setData(1, m, a);
    }
       
    public Data (int a) {
        setData(1, 1, a);
    }
      
    public void setData(int d, int m, int a) {
        ano = a;
   
    switch(m) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12: mes = m;
                if (d > 0 && d <= 31)
                    dia = d;
                else {
                    System.out.println("Dia inválido. Será inserido o dia 1.");
                    dia = 1;
                }
                break;
                         
        case 4:
        case 6:
        case 9:
        case 11: mes = m;
                if (d > 0 && d <= 30)
                    dia = d;
                else {
                    System.out.println("Dia inválido. Será inserido o dia 1.");
                    dia = 1;
                }
                break;
                          
        case 2: mes = m;
                if (bissexto()) {
                    if (d > 0 && d <= 29)
                        dia = d;
                    else { 
                        System.out.println("Dia inválido, sera inserido o dia 1.");
                        dia = 1;
                    }
                }
                else {
                    if (d > 0 && d <= 28)
                        dia = d;
                    else {
                        System.out.println( "Dia inválido, sera inserido o dia 1." );
                        dia = 1;
                    }
                }
                break;
                     
        default: System.out.println( "Mes inválido. Será inserido o mês 1 e o dia 1." );
                 mes = 1;
                 dia = 1;
        }
    }
       
    public boolean bissexto() {
        if (ano % 400 == 0)
            return true;
        else if ( (ano % 4 == 0) && (ano % 100 != 0) )
            return true;
        else
            return false;
     }
       
    public void mostraData() {
        System.out.printf( "Data %02d/%02d/%d\n", dia, mes, ano );
    }
}