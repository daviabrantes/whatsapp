package com.example.whatsapp.helper;

import com.example.whatsapp.config.ConfiguracaoFirebase;
import com.google.firebase.auth.FirebaseAuth;

public class UsuarioFirebase {

    public static String getIdUsuario() {
        FirebaseAuth usuario = ConfiguracaoFirebase.getFirebaseAutenticacao();
        String email = usuario.getCurrentUser().getEmail();
        String idUsuario = Base64Custom.codificarBase64(email);

        return idUsuario;
    }
}
