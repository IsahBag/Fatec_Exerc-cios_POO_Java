public class DiasMes_Arrays {
    public static void main(String[] args) {
        
        int diasMes[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        String meses[] = {"","Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};

        System.out.printf("%s %9s\n","Mês","Dias");

        for (int i=1; i<diasMes.length; i++)
            System.out.printf("%02d (%3s) %4d\n", i, meses[i], diasMes[i]);
    }
}
