/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.Usuarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * The type Email util.
 * @author Pedro Rollán García
 */
public class EmailUtil {
  private final static String FROMEMAIL = "pedrorollangarcia.03@Gmail.com";
  private final static String PASSWORD = "tvcrfmabvkpacpbs";


  /**
   * The entry point of application.
   *
   * @param args the input arguments
   * @throws IOException the io exception
   */
  public static void main(String[] args) throws IOException {
    EmailUtil.confMail("pedrorollangarcia.03@gmail.com");
  }

  /**
   * Send email boolean.
   *
   * @param session the session
   * @param toEmail the to email
   * @param subject the subject
   * @param body the body
   * @return the boolean
   */
  public static boolean sendEmail(Session session, String toEmail, String subject, String body) {
    try {
      MimeMessage msg = new MimeMessage(session);
      msg.addHeader("Content-type", "text/HTML; charset-UTF-8");
      msg.addHeader("format", "flowed");
      msg.addHeader("Content-Transfer-Encoding", "8bit");
      msg.setFrom(new InternetAddress(FROMEMAIL, "NoReply-JD"));
      msg.setSubject(subject, "UTF-8");
      msg.setSentDate(new Date());
      msg.setContent(body, "text/html; charset=UTF-8");
      msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
      Usuarios usuario = Usuarios.encontrarPorCorreo(toEmail);

      if(usuario != null){
       usuario.setContraseña(Usuarios.crearContraseña(body));
       Usuarios.actualizar(usuario);
        System.out.println("Se ha enviado la contraseña");
      }
      Transport.send(msg);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }


  /**
   * Conf mail boolean.
   *
   * @param correo the correo
   * @return the boolean
   * @throws IOException the io exception
   */
  public static boolean confMail(String correo) throws IOException {
    Properties props = new Properties();
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.port", "587");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.user", FROMEMAIL);
    props.put("mail.smtp.ssl.enable", "TLSv1.2");

    Authenticator auth = new Authenticator() {
      protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(FROMEMAIL, PASSWORD);
      }
    };

    Session session = Session.getDefaultInstance(props, auth);
    sendEmail(session, correo, "Koiryu", generarContrasena());
    return true;
  }

  private static String generarContrasena() {
    String caracteres = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    Random random = new Random();

    StringBuilder codigoBuilder = new StringBuilder(12);

    for (int i = 0; i < 12; i++) {
      int indiceCaracter = random.nextInt(caracteres.length());
      char caracter = caracteres.charAt(indiceCaracter);
      codigoBuilder.append(caracter);
    }

    return codigoBuilder.toString();
  }


}
