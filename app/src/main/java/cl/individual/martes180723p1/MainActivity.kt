package cl.individual.martes180723p1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import cl.individual.martes180723p1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycler()

    }

    private fun initRecycler() {
        val pokemonAdapter = PokemonAdapter()
        val pokedex = Pokedex.getPokedex()

        pokemonAdapter.setData(pokedex)

        binding.recPokemonList.adapter = pokemonAdapter

    }
}