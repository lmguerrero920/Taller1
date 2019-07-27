package main;

import entidades.estudiante.Notas;

import javax.swing.*;

import java.text.DecimalFormat;

import static entidades.Mensaje.*;




public class Main
{

    public static void main(String[]args)
    {

        Notas notas= new Notas();

        DecimalFormat formateo = new DecimalFormat("#,###,##0.0");

        String nota1 = JOptionPane.showInputDialog(null,MENSAJE_SOLICITAR_NOTA.getMensaje());
        String nota2 = JOptionPane.showInputDialog(null,MENSAJE_SOLICITAR_NOTA.getMensaje());
        String nota3 = JOptionPane.showInputDialog(null,MENSAJE_SOLICITAR_NOTA.getMensaje());

        notas.setNota1(Double.parseDouble(nota1));
        notas.setNota2(Double.parseDouble(nota2));
        notas.setNota3(Double.parseDouble((nota3)));


         if (notas.calcularNota()>=4)
         {
             JOptionPane.showMessageDialog(null,MENSAJE_APROBADO_EXCELENTE.getMensaje()+MENSAJE_SU_NOTA_ES.getMensaje()+formateo.format( notas.calcularNota()));

         }
         else if (notas.calcularNota()>=3)
         {
            JOptionPane.showMessageDialog(null,MENSAJE_APROBADO_ACEPTABLE.getMensaje()+MENSAJE_SU_NOTA_ES.getMensaje()+formateo.format( notas.calcularNota()));
         }

         else if (notas.calcularNota()>=2)
         {
             JOptionPane.showMessageDialog(null,MENSAJE_REPROBO_ALTO.getMensaje()+MENSAJE_SU_NOTA_ES.getMensaje()+formateo.format( notas.calcularNota()));
         }

         else if(notas.calcularNota()>=1)
         {
             JOptionPane.showMessageDialog(null,MENSAJE_REPROBO_MEDIO.getMensaje()+MENSAJE_SU_NOTA_ES.getMensaje()+formateo.format( notas.calcularNota()));
         }
         else if(notas.calcularNota()>=0)
         {
             JOptionPane.showMessageDialog(null,MENSAJE_REPROBO_BAJO.getMensaje()+MENSAJE_SU_NOTA_ES.getMensaje()+formateo.format( notas.calcularNota()));
         }
         else {

             JOptionPane.showMessageDialog(null,MENSAJE_VALOR_INVALIDO.getMensaje());
         }

    }

}
