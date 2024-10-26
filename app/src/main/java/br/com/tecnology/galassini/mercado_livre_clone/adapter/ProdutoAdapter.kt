package br.com.tecnology.galassini.mercado_livre_clone.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.tecnology.galassini.mercado_livre_clone.databinding.ProdutoItemBinding
import br.com.tecnology.galassini.mercado_livre_clone.model.Produto


class ProdutoAdapter(private val context: Context, val listaProdutos: MutableList<Produto>) :
    RecyclerView.Adapter<ProdutoAdapter.ProdutoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemLista = ProdutoItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ProdutoViewHolder(itemLista)
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.imgProduto.setImageResource(listaProdutos[position].img!!)
        holder.precoProduto.text = listaProdutos[position].preco
        holder.descProduto.text = listaProdutos[position].descricao
        holder.frete.text = listaProdutos[position].frete

    }

    override fun getItemCount() = listaProdutos.size

    inner class ProdutoViewHolder(binding: ProdutoItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val imgProduto = binding.imgProduto
        val precoProduto = binding.txtPrice
        val descProduto = binding.txtDescription
        val frete = binding.txtFrete
    }
}