package br.com.example.orgs.extensions

import android.widget.ImageView
import br.com.example.orgs.R
import coil.load

fun ImageView.tentaCarregarImagem(
    url: String? = null,
    fallback: Int = R.drawable.imagem_padrao
){
    load(url) {
        fallback(fallback)
        error(R.drawable.erro)
        placeholder(R.drawable.placeholder)
    }
}