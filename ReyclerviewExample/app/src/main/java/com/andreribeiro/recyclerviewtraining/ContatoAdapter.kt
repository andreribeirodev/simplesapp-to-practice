package com.andreribeiro.recyclerviewtraining

import androidx.recyclerview.widget.RecyclerView
import com.andreribeiro.recyclerviewtraining.databinding.ContatoItemBinding

class ContatoAdapter : RecyclerView.Adapter<ContatoAdapter.ContatoViewHolder>() {

    inner class ContatoViewHolder(val binding: ContatoItemBinding) :
        RecyclerView.ViewHolder(binding.root)
}
