package br.com.tecnology.galassini.mercado_livre_clone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.tecnology.galassini.mercado_livre_clone.databinding.ProdutoCarroselItemBinding
import br.com.tecnology.galassini.mercado_livre_clone.model.ProdutoCarrosel


class ProdutoCarroselAdapter(private val context: Context, val listaProdutosCarrosel: MutableList<ProdutoCarrosel>) :
    RecyclerView.Adapter<ProdutoCarroselAdapter.ProdutoCarroselViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoCarroselViewHolder {
        val itemLista = ProdutoCarroselItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ProdutoCarroselViewHolder(itemLista)
    }

    override fun onBindViewHolder(holder: ProdutoCarroselViewHolder, position: Int) {
        holder.imgProduto.setImageResource(listaProdutosCarrosel[position].img!!)
        holder.precoProduto.text = listaProdutosCarrosel[position].preco
        holder.descProduto.text = listaProdutosCarrosel[position].descricao
        holder.frete.text = listaProdutosCarrosel[position].frete

    }

    override fun getItemCount() = listaProdutosCarrosel.size

    inner class ProdutoCarroselViewHolder(binding: ProdutoCarroselItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val imgProduto = binding.imgProdutoCarrosel
        val precoProduto = binding.precoProdutoCarrosel
        val descProduto = binding.descProdutoCarrosel
        val frete = binding.freteProdutoCarrosel
    }
}