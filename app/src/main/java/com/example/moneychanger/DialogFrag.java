package com.example.moneychanger;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;


public class DialogFrag extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstance) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Thank You")
                .setMessage("Terima Kasih telah menggunakan aplikasi kami ^^")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        return builder.create();
    }
}