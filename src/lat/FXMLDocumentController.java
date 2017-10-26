/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Dewa Pradipta 
 */
public class FXMLDocumentController implements Initializable {
    
     @FXML
    private Button Proses;

    @FXML
    private Label label;

    @FXML
    private TextField Nama;

    @FXML
    private TextField Alamat;

    @FXML
    private TextField Absen;

    @FXML
    private TextField Telepon;

    @FXML
    private Button Hapus;

    @FXML
    private TextArea Hasil;

    @FXML
    void Hapus(ActionEvent event) {
        Hasil.setText("");
        Nama.setText("");
        Alamat.setText("");
        Absen.setText("");
        Telepon.setText("");
    }

    @FXML
    void Proses(ActionEvent event) {
        String nama = Nama.getText();
        String absen = Absen.getText();
        String alamat = Alamat.getText();
        String telepon = Telepon.getText();
        
        Hasil.setText(" Nama Anda : " +nama+ "\n Alamat Anda : "+alamat+"\n Absen Anda : "+absen+"\n Nomor Telepon : "+telepon);
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
