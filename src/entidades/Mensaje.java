package entidades;

public enum Mensaje {

    MENSAJE_SOLICITAR_NOTA("Por favor ingrese el valor de la  Nota"),
    MENSAJE_APROBADO_EXCELENTE("Excelente, tu rendimiento ha sido el mejor "),
   MENSAJE_REPROBO_ALTO("Te sugerimos comprometerte más con tu estudio"),
    MENSAJE_REPROBO_MEDIO("Malas noticias, no cumpliste con el mínimo para avanzar"),
    MENSAJE_APROBADO_ACEPTABLE("Tu rendimiento es aceptable, pero finalizaste bien"),
    MENSAJE_REPROBO_BAJO("Nuevamente vuelve a iniciar tus estudios y dedícate"),
    MENSAJE_VALOR_INVALIDO("LOS VALORES INGRESADOS NO SON VALIDOS"),
    MENSAJE_SU_NOTA_ES(" \n Su nota final fue de ");


    Mensaje(String s) {
        this.mensaje = s;
    }


    public String getMensaje() {return mensaje;}


    private String mensaje;






}
