package anna.ruiz.ejerad_sqlite_orm.configuraciones;
import java.text.NumberFormat;

public class Configuracion {
        public static final String BD_NAME = "tienda.bd";
        public static final int BD_VERSION = 1;
        public static final NumberFormat NF;
       // public static final NumberFormat NFM;

        static{
            NF = NumberFormat.getNumberInstance(); //NUMERICO

           // NFM = NumberFormat.getCurrencyInstance(); //MONEDA
        }
}
