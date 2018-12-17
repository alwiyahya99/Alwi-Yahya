/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 */

package edu.alwiyahya.latihanmvc.controller;

import edu.alwiyahya.latihanmvc.model.PelangganModel;
import edu.alwiyahya.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author ZeroXploit
 */
public class PelangganController {

    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }

    public void resetForm(PelangganView view) {

        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();

        if (nama.equals("") && email.equals("") && noTelp.equals("")) {

        } else {

            model.resetForm();
        }
    }

    public void simpanForm(PelangganView view) {

        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();

        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        } else if (noTelp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No Telpon Masih Kosong");
        } else {
            model.simpanForm();
        }
    }
}
