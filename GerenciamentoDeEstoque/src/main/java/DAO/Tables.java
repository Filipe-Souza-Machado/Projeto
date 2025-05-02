/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class Tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;

        try {
            con = Conexao.getCon();
            st = con.createStatement();
            st.executeUpdate("Create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(50), name varchar(200), mobileNumber varchar(50), email varchar(200) passoword varchar(50), andrees varchar(200), status varchar(50))");
            st.executeUpdate("insert into appuser(UserRole,name, mobileNumber, email, passoword, andress, status) values('superAdimin', 'Super Adimin', '12345', 'superAdimin@testemail.com','adimin','Brazil', 'true')");

            JOptionPane.showMessageDialog(null, "Table Created Sucessally");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        } finally {
            try {
                con.close();
                st.close();

            } catch (Exception e) {

            }
        }

    }
}
