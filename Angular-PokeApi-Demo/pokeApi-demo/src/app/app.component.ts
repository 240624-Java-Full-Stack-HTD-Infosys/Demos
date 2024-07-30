import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import axios from 'axios';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  pokemon: PokemonData|null = null;

  async doGet() {
    let response: any = await axios.get("https://pokeapi.co/api/v2/pokemon/ditto");
    let bodyObj: any = response.data;
    console.log(bodyObj);
    this.pokemon = bodyObj;
    console.log(this.pokemon)
    
    this.pokemon?.moves.map((move, index)=>{
      console.log(index, move);
      console.log(move.move.name);
      console.log(move.move.url);
    });
  }
}
interface PokemonMove {
  move: {
    name: string;
    url: string;
  };
}

interface PokemonData {
  name: string;
  height: number;
  weight: number;
  base_experience: number;
  moves: PokemonMove[];
}
