package cl.individual.martes180723p1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.individual.martes180723p1.databinding.ItemBinding

class PokemonAdapter : RecyclerView.Adapter<PokemonAdapter.MyViewHolder>() {
    val pokemonList = mutableListOf<Pokemon>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return pokemonList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class MyViewHolder(binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}